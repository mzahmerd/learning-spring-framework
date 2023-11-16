package com.mzahmerd.learnspring;

import com.mzahmerd.learnspring.game.GameRunner;
import com.mzahmerd.learnspring.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}
