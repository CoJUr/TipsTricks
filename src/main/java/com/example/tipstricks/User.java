package com.example.tipstricks;

import org.springframework.context.annotation.Bean;

public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
