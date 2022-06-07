package com.example.gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public String hello(){return "Hello World";}

    @GetMapping
    public String ingressUser(){return  "ingress user";}
}
