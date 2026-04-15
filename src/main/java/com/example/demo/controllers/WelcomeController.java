package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
class WelcomeController {

    @GetMapping()
    public String welcome()
    {
        return "welcome Nourhan";
    }

}
