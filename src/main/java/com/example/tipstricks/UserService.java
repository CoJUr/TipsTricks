package com.example.tipstricks;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.List;


//component = bean
@Component
public class UserService {

//    field injection < constructor injection
    private final PasswordService passwordService;
    private final String specialUsername;

    public UserService(PasswordService passwordService,
                       String specialUsername) {
        this.passwordService = passwordService;
        this.specialUsername = specialUsername;
    }

    public List<User> getUsers() {
        return List.of(new User("cory"), new User(specialUsername));
    }
}
