package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfiliSayfası {
    JFrame frame = new JFrame();
    JLabel isimLabel = new JLabel("Mario Lemina");

    ProfiliSayfası(){

        frame.add(isimLabel);

        frame.setTitle("Profile Sayfası");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);
    }
}
