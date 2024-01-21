package com.example.sem4HomeTask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @RequestMapping("/")
    @ResponseBody
    public String greeting() {
        return "Hello world!";
    }
}