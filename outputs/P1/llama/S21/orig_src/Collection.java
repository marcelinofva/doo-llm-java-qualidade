// File: Collection.java

public class Collection {
    private String name;
    private String branding;
    private List<Document> documents;
    private Comparator<Document> sortingComparator;

    public Collection(String name, String branding) {
        this.name = name;
        this.branding = branding;
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void removeDocument(Document document) {
        documents.remove(document);
    }

    public void sortDocuments(Comparator<Document> comparator) {
        sortingComparator = comparator;
        Collections.sort(documents, comparator);
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public String getName() {
        return name;
    }

    public String getBranding() {
        return branding;
    }
}
