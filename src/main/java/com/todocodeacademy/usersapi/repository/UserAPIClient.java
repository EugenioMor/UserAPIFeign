package com.todocodeacademy.usersapi.repository;

import com.todocodeacademy.usersapi.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "usersapi", url="https://jsonplaceholder.typicode.com")
public interface UserAPIClient {

    @GetMapping("/users/{userId}")
    public UserDTO getUserInfo(@PathVariable("userId") int userId);

    @GetMapping("/users")
    public List<UserDTO> getUsersInfo();
}
