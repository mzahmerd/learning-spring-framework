package com.mzahmerd.learnspring;

import com.mzahmerd.learnspring.game.GameRunner;
import com.mzahmerd.learnspring.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args){

//        var game = new MarioGame();
//        var game = new SuperContra();
        var game = new PacmanGame(); //1: object creation
        var gameRunner = new GameRunner(game); //2: object creation + wiring/injection of dependencies.
// Game is a dependency of GamRunner

        gameRunner.run();
    }
}
