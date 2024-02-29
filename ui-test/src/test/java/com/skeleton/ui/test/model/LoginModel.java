package com.skeleton.ui.test.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

//@AllArgsConstructor
//@Getter
//@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class LoginModel {

    private final String username;
    private final String password;

    public LoginModel(String username, String password) {
        if (Objects.isNull(username) || username.isEmpty()) {
            throw new IllegalArgumentException("Username cant be null");
        }
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
