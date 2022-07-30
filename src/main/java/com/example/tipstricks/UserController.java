package com.example.tipstricks;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> user() {
        return userService.getUsers();
    }


}
