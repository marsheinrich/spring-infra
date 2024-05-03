package com.demo;

import org.springframework.web.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController   //server request ready
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}