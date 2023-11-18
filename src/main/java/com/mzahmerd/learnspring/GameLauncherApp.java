package com.mzahmerd.learnspring;

import com.mzahmerd.learnspring.game.GameRunner;
import com.mzahmerd.learnspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mzahmerd.learnspring.game")
public class GameLauncherApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameLauncherApp.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        };
    }
}