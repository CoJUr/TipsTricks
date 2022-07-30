package com.example.tipstricks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private final UserService userService;

    public WebController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "home";

    }
}
