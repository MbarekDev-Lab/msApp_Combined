package com.mbarekDev.gamerunner;

import com.mbarekDev.gamerunner.game.MarioGame;
import com.mbarekDev.gamerunner.game.SuperContaGame;

public class GameRunner  {
   // private final MarioGame game;
    //private  final SuperContaGame game;
    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
