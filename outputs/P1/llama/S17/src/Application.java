// File: Application.java

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<SupportingDocumentation> supportingDocumentation;
    private List<Fee> fees;

    public Application() {
        supportingDocumentation = new ArrayList<>();
        fees = new ArrayList<>();
    }

    public void submit() {
        // submission logic
    }

    public List<SupportingDocumentation> getSupportingDocumentation() {
        return supportingDocumentation;
    }

    public List<Fee> getFees() {
        return fees;
    }
}
