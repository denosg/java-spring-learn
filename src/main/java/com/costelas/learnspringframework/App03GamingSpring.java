package com.costelas.learnspringframework;

import com.costelas.learnspringframework.game.GameRunner;
import com.costelas.learnspringframework.game.GamingConsole;
import com.costelas.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
