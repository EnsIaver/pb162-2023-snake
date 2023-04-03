package org.example;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Stanislav Zeman
 */
public class Game {
    public static int WIDTH = 500;
    public static int HEIGHT = 500;
    public static Color COLOR = Color.BLUE;
    private String direction = "left";
    private Random random = new Random();
    private List<Point> snake = new ArrayList<>();
    private Point fruit;
    private boolean fruitTaken = false;

    private Point createFruit() {
        // TODO
        return null;
    }

    public Game() {
        // TODO
    }

    public void move(int keyCode) {
       // TODO
    }

    public void takeFruit() {
        // TODO
    }

    public boolean gameOver() {
        // TODO
        return true;
    }

    public void drawSnake(Graphics g) {
        // TODO
    }

    public void drawFruit(Graphics g) {
        // TODO
    }
}
