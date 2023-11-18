package com.mzahmerd.learnspring;

import com.mzahmerd.learnspring.game.GameRunner;
import com.mzahmerd.learnspring.game.GamingConsole;
import com.mzahmerd.learnspring.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
    
}
