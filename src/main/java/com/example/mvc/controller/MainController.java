package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wydarzenia")
public class MainController {


    @GetMapping("/siatka")
    public String getSport(){
        return "sport/siatka";
    }
}
