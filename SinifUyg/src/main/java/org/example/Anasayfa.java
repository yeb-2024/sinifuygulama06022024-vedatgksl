package org.example;

import javax.swing.*;

public class Anasayfa {

    JFrame frame = new JFrame();
    JButton button = new JButton("Profili göster");

    Anasayfa(){
        button.setBounds(200, 200, 100, 50);
        button.setFocusable(false);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(button);
    }
}
