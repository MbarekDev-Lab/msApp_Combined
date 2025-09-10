package com.mbarekDev.gamerunner;

import com.mbarekDev.gamerunner.game.MarioGame;
import com.mbarekDev.gamerunner.game.PacmanGame;
import com.mbarekDev.gamerunner.game.SuperContaGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamerunnerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(GamerunnerApplication.class, args);
        //MarioGame game = new MarioGame();
        //SuperContaGame game = new SuperContaGame();
        PacmanGame game = new PacmanGame();
        GameRunner runner = new GameRunner(game);
        runner.run();
    }

}
