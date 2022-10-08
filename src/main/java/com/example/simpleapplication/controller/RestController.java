package com.example.simpleapplication.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/test")
    public ResponseEntity<String> EndPoint1()   {

        return ResponseEntity.ok("I am testing you");
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<String> EndPoint2(@PathVariable int id)   {

        return ResponseEntity.ok("I am testing you"+" and ID is " +id);
    }

}







