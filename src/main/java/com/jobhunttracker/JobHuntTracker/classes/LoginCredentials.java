package com.jobhunttracker.JobHuntTracker.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class LoginCredentials {
    private String email;
    private String hashedPassword;
    private String username;

}