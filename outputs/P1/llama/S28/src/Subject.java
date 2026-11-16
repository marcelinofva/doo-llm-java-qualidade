// File: Subject.java

public class Subject {
    private String subjectId;
    private String subjectName;
    private List<Source> sources;

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.sources = new ArrayList<>();
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void addSource(Source source) {
        this.sources.add(source);
    }
}
