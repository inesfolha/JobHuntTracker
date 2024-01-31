package com.jobhunttracker.JobHuntTracker.entity;

import com.jobhunttracker.JobHuntTracker.utilities.HelperMethods;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data @Document(collection = "Users") @NoArgsConstructor
public class User {
    @Id
    private String id;
    private LoginCredentials loginCredentials;
    private UserProfile userProfile; //Object with info on user skills and job preferences
    private ApplicationS userApplications; // object with info on the applied jobs
    private LocalDateTime created;

    public User(String username, String email, String password) {

        // Hash the password
        String hashedPassword = HelperMethods.hashPassword(password);

        // Create LoginCredentials Object with the info
        this.loginCredentials = new LoginCredentials(email, hashedPassword, username);
        this.userProfile = new UserProfile(); // Initialize as empty
        this.userApplications = new ApplicationS(); // Initialize as empty
        this.created = LocalDateTime.now();
    }



}

