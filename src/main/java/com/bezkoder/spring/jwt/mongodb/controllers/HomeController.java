package com.bezkoder.spring.jwt.mongodb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "signin";
    }

    @GetMapping("/App/Signup")
    public String signup(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "signup";
    }

    @GetMapping("/App/menu")
    public String menu(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "menu";
    }
    @GetMapping("/App/profileCreation")
    public String profileCreation(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "ProfileCreation";
    }

    @GetMapping("/App/voteProfile")
    public String votePage(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "makeVote";
    }

    @GetMapping("/App/voteSummary")
    public String summary(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "voteSummary";
    }

    @GetMapping("/App/makeVote")
    public String makeVote(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Application!");
        return "makeVote";
    }
}
