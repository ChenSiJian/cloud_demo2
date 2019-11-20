package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment env;


    @GetMapping("/info")
    public String hello() {
        System.out.println(env.getProperty("info.profile"));
        return env.getProperty("info.profile");
    }

}
