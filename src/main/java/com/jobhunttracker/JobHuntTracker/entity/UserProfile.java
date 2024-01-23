package com.jobhunttracker.JobHuntTracker.entity;

import lombok.Data;

import java.util.ArrayList;
@Data
public class UserProfile {
    String name;
    int age;
    String location;
    String email;
    String phoneNumber;
    double experienceTime;
    ArrayList<String> academicExperience;
    ArrayList<String> professionalExperience;
    ArrayList<String> hardSkills;
    ArrayList<String> softSkills;
    ArrayList<String> personalityTraits;
    ArrayList<String> hobbies;
    JobPreferences jobPreferences;
}
