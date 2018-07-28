package com.example.gyazo_boot2.controller;

import com.example.gyazo_boot2.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("var", "stash by controller");
        return "index";
    }
}
