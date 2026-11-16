// File: StaffMember.java

import java.util.ArrayList;
import java.util.List;

public class StaffMember {
    private List<Permission> permissions;

    public StaffMember() {
        permissions = new ArrayList<>();
    }

    public void performCompletenessReview(Application application) {
        // completeness review logic
    }

    public void assignApplicationForDetailedReview(Application application) {
        // assignment logic
    }
}
