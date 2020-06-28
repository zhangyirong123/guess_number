package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class GameService {

    private GuessNumberGame guessNumberGame;

    public GameService(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }

    public String guess(String userNumber) {

        return guessNumberGame.guess(userNumber);
    }
}
