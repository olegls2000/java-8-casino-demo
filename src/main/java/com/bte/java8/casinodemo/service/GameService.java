package com.bte.java8.casinodemo.service;

import com.bte.java8.casinodemo.entity.BetItem;
import com.bte.java8.casinodemo.entity.GameResult;
import com.bte.java8.casinodemo.repository.GameResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GameService {
    @Autowired
    private GameResultRepository repository;

    public void play() {
        System.out.println("Play game");
        final GameResult result = GameResult.builder()
                .position1(getRandom())
                .position2(getRandom())
                .position3(getRandom())
                .gameTime(LocalDateTime.now())
                .build();
        repository.save(result);
        System.out.println("Result Saved!!!");
    }

    private BetItem getRandom() {
        int randomIndex = getRandomNumberFromInterval(0, BetItem.values().length);
        return BetItem.values()[randomIndex];
    }

    private int getRandomNumberFromInterval(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        return result;
    }
}
