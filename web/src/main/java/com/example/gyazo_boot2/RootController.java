package com.example.gyazo_boot2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @Value("${hoge}")
    private String hoge;

    @GetMapping("/")
    public String index() {
        return "index: hoge is " + hoge;
    }
}
