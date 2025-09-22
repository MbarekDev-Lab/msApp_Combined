package com.mbarekDev.mainApp;

import com.mbarekDev.mainApp.web.WebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan("com.mbarekDev.gamerunner.game")
//@ComponentScan({"com.package1","com.package2" ,...}) multiple packages
//@ComponentScan({"com.mbarekDev.mainApp", "com.mbarekDev.enterprise.controllers"})
public class GamerunnerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GamerunnerApplication.class, args);
        //SuperContaGame game = new SuperContaGame();
        //PacmanGame game = new PacmanGame();
        // GamingConsole game = new MarioGame();
        // GameRunner runner = new GameRunner(game);
        // GameRunner runner = context.getBean(GameRunner.class);
        // runner.run();
        WebController controller = context.getBean(WebController.class);
        System.out.println(controller.returnValueFromBusinessService());
    }

}

//Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


