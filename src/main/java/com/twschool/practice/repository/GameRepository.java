package com.twschool.practice.repository;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;

public class GameRepository {

    public GuessNumberGame create() {
        return new GuessNumberGame(new AnswerGenerator());
    }

    public GuessNumberGame find() {
        return null;
    }
}

