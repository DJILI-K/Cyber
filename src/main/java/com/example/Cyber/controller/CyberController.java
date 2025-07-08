package com.example.Cyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CyberController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
