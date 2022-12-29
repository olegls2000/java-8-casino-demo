package com.bte.java8.casinodemo.controller;

import com.bte.java8.casinodemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/add-user")
    public String getRegistrationPage() {
        return "add-user";
    }

    @GetMapping("/play")
    public String play() {
        gameService.play();
        return "index";
    }

}
