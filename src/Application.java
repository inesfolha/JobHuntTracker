import java.util.ArrayList;
import java.util.Date;

public class Application {

    enum Status {
        applied,
        toApply,
        interviewing,
        archived
    }

    boolean favorite;
    String jobTitle;

    String jobDescription;

    ArrayList<String> jobRequirements;

    WorkRegime workRegime;
    int[] salaryRange = new int[2];

    String resumeVersionSent; //filename

    String coverLetter;

    Date dateApplied;

    Company company;
}
