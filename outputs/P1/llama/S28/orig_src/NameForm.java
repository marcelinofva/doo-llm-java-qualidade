// File: NameForm.java

public class NameForm {
    private String nameFormId;
    private String nameFormName;
    private Agent agent;

    public NameForm(String nameFormId, String nameFormName) {
        this.nameFormId = nameFormId;
        this.nameFormName = nameFormName;
        this.agent = new Agent();
    }

    public String getNameFormId() {
        return nameFormId;
    }

    public String getNameFormName() {
        return nameFormName;
    }

    public Agent getAgent() {
        return agent;
    }
}
