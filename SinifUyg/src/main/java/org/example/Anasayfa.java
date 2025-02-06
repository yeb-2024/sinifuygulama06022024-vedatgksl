package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Annotation;

public class Anasayfa implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Profili göster");

    Anasayfa(){
        button.setBounds(200, 200, 100, 50);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setSize(500, 500); //.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            ProfiliSayfası profiliSayfası = new ProfiliSayfası();
        }
    }
}
