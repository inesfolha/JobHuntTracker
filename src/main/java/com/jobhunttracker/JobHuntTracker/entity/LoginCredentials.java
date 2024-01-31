package com.jobhunttracker.JobHuntTracker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

@Data @AllArgsConstructor @NoArgsConstructor
public class LoginCredentials {
    @Indexed(unique = true)
    private String email;
    private String password;
    private String username;

}