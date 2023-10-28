package com.todocodeacademy.usersapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
}
