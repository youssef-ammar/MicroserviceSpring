package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloWorldController {
    @GetMapping("/hello")
    public helloWorldBen helloBean() throws Exception {
        return new helloWorldBen("heloo");
    }

    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("hello",
                HttpStatus.ACCEPTED);
    }
}
