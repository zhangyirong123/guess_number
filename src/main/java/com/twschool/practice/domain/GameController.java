package com.twschool.practice.domain;

import com.twschool.practice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class GameController {
    public GameService gameService = new GameService(new GuessNumberGame(new AnswerGenerator()));

    @PostMapping("/games/guess-number")
    public Map<String, String> guess(@RequestBody Map<String, String> requestBody) {
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("input", requestBody.get("number"));
        String result = gameService.guess(requestBody.get("number"));
        responseBody.put("result", result);
        return responseBody;
    }
}
