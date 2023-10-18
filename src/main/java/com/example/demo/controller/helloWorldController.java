package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor.STRING;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class helloWorldController {
    @GetMapping("/hello")
    public helloWorldBen hello() {
        return new helloWorldBen("heloo");
    }
    @GetMapping("/api/hello/{name}")
    public String helloweb(@PathVariable String name) {
        return "Hello, world!"+ name;
    }
}
