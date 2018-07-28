package com.example.gyazo_boot2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RootController {
    @Value("${hoge}")
    private String hoge;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hoge", hoge);
        return "index";
    }
}
