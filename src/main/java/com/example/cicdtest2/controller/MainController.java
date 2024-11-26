package com.example.cicdtest2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String main() {
        return "this is cicid2, test";
    }
}
