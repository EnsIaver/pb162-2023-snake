package org.example;

import javax.swing.JFrame;

/**
 * @author Stanislav Zeman
 */
public class MyFrame extends JFrame {
    public MyFrame(MyPanel myPanel){
        setVisible(true);
        setTitle(""); //TODO: nastavte názov vašej hry
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(myPanel);
        pack();
    }
}
