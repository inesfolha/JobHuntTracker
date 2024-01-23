package com.jobhunttracker.JobHuntTracker.controllers;

import com.jobhunttracker.JobHuntTracker.entity.User;
import com.jobhunttracker.JobHuntTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/")
    public String allUsers(){
            return "<h1> Hello Users! </>";

    }
    @Autowired
    UserService userService;
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getLoginCredentials().getUsername(),
                user.getLoginCredentials().getEmail(),
                user.getLoginCredentials().getPassword());
    }
}
