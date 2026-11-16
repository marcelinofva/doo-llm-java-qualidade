// Métricas de AST com JavaParser (nível de linguagem Java 11).
// Uso: java -cp javaparser-core-<versão>.jar scripts/AstMetrics.java outputs > results/ast.csv
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AstMetrics {
    static int depth(Node n) {
        int d = 0;
        for (Node c : n.getChildNodes()) d = Math.max(d, depth(c));
        return d + 1;
    }

    public static void main(String[] args) throws Exception {
        ParserConfiguration cfg = new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_11);
        JavaParser parser = new JavaParser(cfg);
        System.out.println("file,parsed,nodes,depth,classes,interfaces,methods,fields,"
                + "private_fields,extends,implements,try_catch,throws");
        List<Path> files;
        try (Stream<Path> w = Files.walk(Paths.get(args[0]))) {
            files = w.filter(p -> p.toString().endsWith(".java")).sorted().collect(Collectors.toList());
        }
        for (Path p : files) {
            ParseResult<CompilationUnit> r = parser.parse(p);
            if (!r.isSuccessful() || !r.getResult().isPresent()) {
                System.out.println(p + ",0,,,,,,,,,,,");
                continue;
            }
            CompilationUnit cu = r.getResult().get();
            List<ClassOrInterfaceDeclaration> types = cu.findAll(ClassOrInterfaceDeclaration.class);
            long ifaces = types.stream().filter(ClassOrInterfaceDeclaration::isInterface).count();
            long ext = types.stream().filter(t -> !t.isInterface() && !t.getExtendedTypes().isEmpty()).count();
            long impl = types.stream().mapToLong(t -> t.getImplementedTypes().size()).sum();
            List<FieldDeclaration> fields = cu.findAll(FieldDeclaration.class);
            long priv = fields.stream().filter(FieldDeclaration::isPrivate).count();
            System.out.println(String.join(",", p.toString(), "1",
                    String.valueOf(cu.findAll(Node.class).size()), String.valueOf(depth(cu)),
                    String.valueOf(types.size() - ifaces), String.valueOf(ifaces),
                    String.valueOf(cu.findAll(MethodDeclaration.class).size()),
                    String.valueOf(fields.size()), String.valueOf(priv),
                    String.valueOf(ext), String.valueOf(impl),
                    String.valueOf(cu.findAll(TryStmt.class).size()),
                    String.valueOf(cu.findAll(ThrowStmt.class).size())));
        }
    }
}
