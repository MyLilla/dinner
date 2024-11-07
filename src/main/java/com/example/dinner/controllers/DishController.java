package com.example.dinner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {

    @GetMapping("/")
    public String dishes() {
        return "dishes";
    }
}
