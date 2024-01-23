package com.jobhunttracker.JobHuntTracker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data @AllArgsConstructor
public class LoginCredentials {
    @Indexed(unique = true)
    private String email;
    private String password;
    private String username;

}