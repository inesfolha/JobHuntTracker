package com.jobhunttracker.JobHuntTracker.entity;

import lombok.Data;

@Data
public class JobPreferences {
    WorkRegime workRegime;

    int[] salaryRange = new int[2];

    String careerGoals;
}
