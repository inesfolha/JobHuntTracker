package com.jobhunttracker.JobHuntTracker.controllers;

import com.jobhunttracker.JobHuntTracker.entity.User;
import com.jobhunttracker.JobHuntTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/allUsers") //Add Admin security for this route
    public List<User> getAllUsers(){
            return userService.getAllUsers();

    }
    @PostMapping("/create")
    public User createUser(@RequestBody Map<String, String> requestBody) {

        String password = requestBody.get("password");
        String username = requestBody.get("username");
        String email = requestBody.get("email");

        return userService.createUser(username, email, password);
    }

    @GetMapping("/getUser/{id}")
    public User getUserDetails(@PathVariable String id) {

        return userService.getUserDetails(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id,
                             @RequestBody Map<String, String> requestBody) {

        String password = requestBody.get("password");
        return userService.deleteUser(id, password);
    }

    @DeleteMapping("/adminDelete/{id}")
    public String deleteUser(@PathVariable String id) {

        return userService.AdminDeleteUser(id);
    }




}
