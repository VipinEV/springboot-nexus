package com.training.nexus.springbootnexus.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam("name") final String name) {
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
}
