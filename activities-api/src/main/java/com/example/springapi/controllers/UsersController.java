package com.example.springapi.controllers;

import com.example.springapi.models.User;
import com.example.springapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public User findUserById(@PathVariable Long userId) {
        return userRepository.findOne(userId);
    }

    @DeleteMapping("/users/{userId}")
    public HttpStatus deleteUserById(@PathVariable Long userId) {
        userRepository.delete(userId);
        return HttpStatus.OK;
    }

    @PostMapping("/users")
    public User createNewUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @PatchMapping("/users/{userId}")
    public User updateUserById(@PathVariable Long userId, @RequestBody User userRequest) {
        User userFromDb = userRepository.findOne(userId);
        userFromDb.setUserName(userRequest.getUserName());
        userFromDb.setTagLine(userRequest.getTagLine());
        return userRepository.save(userFromDb);
    }
}