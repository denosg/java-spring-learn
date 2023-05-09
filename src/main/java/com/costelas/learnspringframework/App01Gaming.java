package com.costelas.learnspringframework;

import com.costelas.learnspringframework.game.GameRunner;
import com.costelas.learnspringframework.game.PacManGame;

public class App01Gaming {

    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacManGame(); // 1: Object Creation
        var gameRunner = new GameRunner(game);
            // 2: Object Creation + Wiring of Dependencies
            // Game is a Dependency of GameRunner class
        gameRunner.run();
    }
}
