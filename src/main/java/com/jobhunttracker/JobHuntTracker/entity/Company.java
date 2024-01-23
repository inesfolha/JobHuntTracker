package com.jobhunttracker.JobHuntTracker.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
public class Company {
    String name;
    String location;

    Date reApplyTime;

    ArrayList<Application> applicationsSubmitted;

    boolean favorite;



}
