package com.jobhunttracker.JobHuntTracker.entity;

import com.jobhunttracker.JobHuntTracker.entity.enums.WorkRegime;
import com.jobhunttracker.JobHuntTracker.entity.enums.applicationStatus;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
public class Application {

    applicationStatus status;
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
