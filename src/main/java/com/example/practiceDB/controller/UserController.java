package com.example.practiceDB.controller;

import com.example.practiceDB.entity.UserEntity;
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
        model.addAttribute("user", new UserEntity());
        return "signup";
    }

    @PostMapping("singup")
    public String signupSubmit(@ModelAttribute UserEntity user, Model model) {
        return "signup";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        return "login";
    }
}
