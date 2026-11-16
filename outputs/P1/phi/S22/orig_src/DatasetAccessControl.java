// File: DatasetAccessControl.java
public class DatasetAccessControl {
    private Map<String, List<Dataset>> accessControlList = new HashMap<>();

    public void grantAccess(String collaborator, Dataset dataset) {
        accessControlList.computeIfAbsent(collaborator, k -> new ArrayList<>()).add(dataset);
    }

    public void revokeAccess(String collaborator, Dataset dataset) {
        accessControlList.getOrDefault(collaborator, new ArrayList<>()).remove(dataset);
    }

    // Getters and setters omitted for brevity
}

