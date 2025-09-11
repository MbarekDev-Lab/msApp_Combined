package com.mbarekDev.gamerunner.game;

import com.mbarekDev.gamerunner.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("PacmanGame up");
    }

    @Override
    public void down() {
        System.out.println("PacmanGame down");
    }

    @Override
    public void left() {
        System.out.println("PacmanGame left");
    }

    @Override
    public void right() {
        System.out.println("PacmanGame right");
    }
}
