package com.twschool.practice.domain;

import com.twschool.practice.repository.GameRepository;
import org.junit.Assert;
import org.junit.Test;

public class GuessNumberRepositoryTest {

    @Test
    public void should_create_game() {
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame guessNumberGame = gameRepository.create();

        Assert.assertNotNull(guessNumberGame);
    }

    @Test
    public void should_find_game() {
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame initGuessNumber = gameRepository.create();
        GuessNumberGame guessNumber = gameRepository.find();

        Assert.assertNotNull(guessNumber);
        Assert.assertEquals(initGuessNumber, guessNumber);
    }
}


