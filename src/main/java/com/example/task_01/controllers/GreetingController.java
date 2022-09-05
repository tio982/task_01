package com.example.task_01.controllers;

import com.example.task_01.expression.Greeting;
import com.example.task_01.expression.Reply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")

public class GreetingController {

    @GetMapping
    public Reply newGreeting(){
        Greeting greeting = new Greeting("Tio", "timeofday");
        return new Reply("Good afternoon " + "Tio");

    }




}
