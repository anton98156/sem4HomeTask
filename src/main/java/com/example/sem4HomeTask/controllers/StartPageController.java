package com.example.sem4HomeTask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartPageController {

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("pageTitle", "Добро пожаловать!");
        model.addAttribute("message", "Привет, это страница с использованием Thymeleaf");
        return "index";
    }

    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("pageTitle", "Результат");
        model.addAttribute("message", "Привет, " + name + "!");
        return "index";
    }
}