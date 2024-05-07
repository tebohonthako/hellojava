package com.congo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RestController
@RequestMapping ("api/hello")
public class HelloController {


    @GetMapping
    public String getText() {
        return "Hello World! How are you ?";
    }

}
