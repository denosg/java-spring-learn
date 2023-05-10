package com.costelas.learnspringframework;

import com.costelas.learnspringframework.game.GameRunner;
import com.costelas.learnspringframework.game.GamingConsole;
import com.costelas.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    // Spring would take this name bean and wire it here (pass it as a parameter call)
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    // 1: Object Creation
}
