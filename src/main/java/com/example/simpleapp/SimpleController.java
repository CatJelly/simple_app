package com.example.simpleapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class SimpleController {

    @GetMapping("/")
    public String index() {
        return "Hello WOrld";
    }

}
