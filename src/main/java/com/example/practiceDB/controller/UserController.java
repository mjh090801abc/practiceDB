package com.example.practiceDB.controller;

import com.example.practiceDB.entity.User;
import com.example.practiceDB.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("singup")
    public String signupSubmit(@ModelAttribute User user, Model model) {
        return "signup";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        return "login";
    }
}
