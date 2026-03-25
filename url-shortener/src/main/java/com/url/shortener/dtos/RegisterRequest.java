package com.url.shortener.dtos;


import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {
    private String username;
    private Set<String> roles;
    private String email;
    private String password;
}
