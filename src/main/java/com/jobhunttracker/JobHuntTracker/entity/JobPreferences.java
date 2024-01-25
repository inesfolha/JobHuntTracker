package com.jobhunttracker.JobHuntTracker.entity;

import com.jobhunttracker.JobHuntTracker.entity.enums.WorkRegime;
import lombok.Data;

@Data
public class JobPreferences {
    WorkRegime workRegime;

    int[] salaryRange = new int[2];

    String careerGoals;
}
