// File: Subject.java

public class Subject {
    private String subjectType;
    private String subjectValue;

    public Subject(String type, String value) {
        this.subjectType = type;
        this.subjectValue = value;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public String getSubjectValue() {
        return subjectValue;
    }
}
