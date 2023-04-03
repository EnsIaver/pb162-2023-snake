package org.example;

import java.awt.EventQueue;

/**
 * @author Stanislav Zeman
 */
public class Snake {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Game game = new Game();
            MyPanel panel = new MyPanel(game);
            new MyFrame(panel);
        });
    }
}
