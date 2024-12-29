package com.example.ticketease.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Test {

    @GetMapping("/hello")
    public String test() {
        System.out.println("테스트");
        return "test";  // templates/testtest.html을 찾아서 반환
    }
}