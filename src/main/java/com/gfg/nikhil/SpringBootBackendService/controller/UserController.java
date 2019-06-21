package com.gfg.nikhil.SpringBootBackendService.controller;

import com.gfg.nikhil.SpringBootBackendService.model.User;
import com.gfg.nikhil.SpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> getAllUsers(){

        return userDaoService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){

        return userDaoService.findUserById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){

        return userDaoService.createUser(user);
    }

    @PutMapping("/user")
    public User updateUserById(@RequestBody User user){
        return userDaoService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") Long id){

        return userDaoService.deleteUser(id);

    }
}
