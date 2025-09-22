package com.mbarekDev.runner.game;

import com.mbarekDev.runner.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class SuperContaGame implements GamingConsole {
    public void up() {
        System.out.println("SuperContra up");

    }
    public void down() {
        System.out.println("SuperContra down");

    }

    public void left() {
        System.out.println("SuperContra left");
    }

    public void right(){
        System.out.println("SuperContra right");
    }

}
