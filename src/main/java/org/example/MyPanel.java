package org.example;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author Stanislav Zeman
 */
public class MyPanel extends JPanel implements ActionListener {
    private Game game;
    private Timer timer = new Timer(100, this);
    private MyKeyAdapter keyAdapter = new MyKeyAdapter();

    public MyPanel(Game game) {
        this.game = game;
        setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
        setFocusable(true);
        addKeyListener(keyAdapter);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Game.COLOR);
        game.drawSnake(g);
        game.takeFruit();
        game.drawFruit(g);
    }
}
