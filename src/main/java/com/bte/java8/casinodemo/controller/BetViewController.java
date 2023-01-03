package com.bte.java8.casinodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BetViewController {

    @GetMapping("/bet/add")
    public String getNewBetPage() {
        return "add-bet";
    }

}
