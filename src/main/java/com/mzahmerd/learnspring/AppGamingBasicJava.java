package com.mzahmerd.learnspring;

import com.mzahmerd.learnspring.game.GameRunner;
import com.mzahmerd.learnspring.game.PacmanGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

//        var game = new MarioGame();
//        var game = new SuperContra();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
