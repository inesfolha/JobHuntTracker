package com.jobhunttracker.JobHuntTracker.entity;

import lombok.Data;

import java.util.ArrayList;
@Data
public class ApplicationS {

    ArrayList<Application> recentlyApplied;
    ArrayList<Application> toApply;
    ArrayList<Application> archived;
    ArrayList<Application> interviewing;
}
