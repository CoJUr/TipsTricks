package com.example.tipstricks;

import org.springframework.stereotype.Component;

import java.util.List;


//component = bean
@Component
public class UserService {

    public List<User> getUsers() {
        return List.of(new User("cory"));
    }
}
