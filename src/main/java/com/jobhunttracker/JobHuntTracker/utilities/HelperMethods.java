package com.jobhunttracker.JobHuntTracker.utilities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HelperMethods {

    public static String hashPassword(String password) {
        // Using BCryptPasswordEncoder for password hashing
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    public static boolean verifyPassword(String rawPassword, String encodedPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}

