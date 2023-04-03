package org.example;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Stanislav Zeman
 */
public class MyKeyAdapter extends KeyAdapter {
    private int keyCode = KeyEvent.VK_LEFT;

    @Override
    public void keyPressed(KeyEvent e) {
        keyCode = e.getKeyCode();
    }

    public int getKeyCode() {
        return keyCode;
    }
}
