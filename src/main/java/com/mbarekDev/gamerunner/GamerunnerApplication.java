package com.mbarekDev.gamerunner;

import com.mbarekDev.gamerunner.game.MarioGame;
import com.mbarekDev.gamerunner.game.PacmanGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
@SpringBootApplication
//@ComponentScan("com.mbarekDev.gamerunner.game")
//@ComponentScan({"com.package1","com.package2" ,...}) multiple packages
public class GamerunnerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GamerunnerApplication.class, args);

        //SuperContaGame game = new SuperContaGame();
        //PacmanGame game = new PacmanGame();
       // GamingConsole game = new MarioGame();
       // GameRunner runner = new GameRunner(game);

        GameRunner runner = context.getBean(GameRunner.class);


        runner.run();
    }

}
