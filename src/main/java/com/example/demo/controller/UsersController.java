package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import com.example.demo.Exception.NotFoundException;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {

        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id) {
        User user = userService.findById(id);
        if (user == null) {

            throw new NotFoundException("id:" + id);

        }
        return userService.findById(id);
    }

    @DeleteMapping("/users/delete/{id}")
    public List<User> delete(@PathVariable Integer id) {
        return userService.deleteById(id);
    }

    @PostMapping("/addUser")
    public void createUser(@RequestBody User user) {

        userService.save(user);
    }

}
