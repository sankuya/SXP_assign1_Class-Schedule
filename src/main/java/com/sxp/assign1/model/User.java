package com.sxp.assign1.model;


import lombok.Data;

@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String phone;
    private String email;
}
