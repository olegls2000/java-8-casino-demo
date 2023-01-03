package com.bte.java8.casinodemo.service;

import com.bte.java8.casinodemo.entity.*;
import com.bte.java8.casinodemo.repository.BetRepository;
import com.bte.java8.casinodemo.repository.BetResultRepository;
import com.bte.java8.casinodemo.repository.GameResultRepository;
import com.bte.java8.casinodemo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameResultRepository gameResultRepository;
    @Autowired
    private BetRepository betRepository;
    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private BetResultRepository betResultRepository;

    public void evaluateBet(Bet bet) {
        final var currentUser = getCurrentUser();
        bet.setUserAccount(currentUser);
        betRepository.save(bet);
        final var gameResult = getRandomGameResult();
        gameResultRepository.save(gameResult);
        final var latestBetResult = betResultRepository.findOneByUserAccountIdOrderByIdDesc(currentUser.getId());
        final var currentBalance = latestBetResult.getBalance();
        final var newBalance = calculateNewBalance(bet, gameResult, currentBalance);
        final var newBetResult = generateBetResult(newBalance, bet, currentUser);
        betResultRepository.save(newBetResult);
    }
    private BetResult generateBetResult(Long newBalance, Bet bet, UserAccount currentUser){
        return BetResult.builder()
                .balance(newBalance)
                .userAccount(currentUser)
                .bet(bet)
                .build();
    }

    private Long calculateNewBalance(Bet bet, GameResult gameResult, Long currentBalance){
        if (isJackpot(gameResult)) {
            final Long winValue = bet.getValue() * 3;
            return currentBalance + winValue;
        }
        if (isDoubleWin(gameResult)) {
            final Long winValue = bet.getValue() * 2;
            return currentBalance + winValue;
        }
        return currentBalance - bet.getValue();
    }

    private boolean isJackpot(GameResult result) {
        return result.getPosition1() == result.getPosition2()
                && result.getPosition3() == result.getPosition2();
    }

    private boolean isDoubleWin(GameResult result) {
        return result.getPosition1() == result.getPosition2()
                || result.getPosition1() == result.getPosition3()
                || result.getPosition2() == result.getPosition3();
    }

    private UserAccount getCurrentUser() {
        final Optional<UserAccount> defaultUserOpt = userAccountRepository.findById(3L);
        final UserAccount defaultUser = defaultUserOpt
                .orElseThrow(() -> new RuntimeException("Default user was not found!!!"));
        return defaultUser;
    }
    private GameResult getRandomGameResult(){
        return GameResult.builder()
                .position1(getRandomBetItem())
                .position2(getRandomBetItem())
                .position3(getRandomBetItem())
                .gameTime(LocalDateTime.now())
                .build();
    }

    private BetItem getRandomBetItem() {
        final int randomIndex = getRandomNumberFromInterval(0, BetItem.values().length);
        return BetItem.values()[randomIndex];
    }

    private int getRandomNumberFromInterval(int from, int till) {
        int result = (int) (Math.random() * (till - from)) + from;
        return result;
    }
}
