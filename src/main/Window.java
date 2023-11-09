package main;

import javax.swing.*;

public class Window extends JFrame {
    public Window(GameScreen gameScreen) {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(gameScreen);
        setLocationRelativeTo(null);
        setResizable(false);

        pack();
        setVisible(true);


    }

}
