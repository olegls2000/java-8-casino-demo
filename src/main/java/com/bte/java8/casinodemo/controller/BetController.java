package com.bte.java8.casinodemo.controller;

import com.bte.java8.casinodemo.entity.Bet;
import com.bte.java8.casinodemo.service.GameService;
import com.bte.java8.casinodemo.service.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BetController {
    @Autowired
    private GameService gameService;

    @PostMapping("/bet/add")
    public void addBet(Bet bet){
        gameService.evaluateBet(bet);
    }

}
