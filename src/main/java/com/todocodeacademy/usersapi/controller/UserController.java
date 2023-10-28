package com.todocodeacademy.usersapi.controller;

import com.todocodeacademy.usersapi.dto.UserDTO;
import com.todocodeacademy.usersapi.repository.UserAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserAPIClient userAPIClient;

    @GetMapping("/users/{userId}")
    public UserDTO getUserInfo(@PathVariable("userId") int id){
        return userAPIClient.getUserInfo(id);
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
       return userAPIClient.getUsersInfo();
    }
}
