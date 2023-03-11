package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;

    public Window(){
        setContentPane(panel1);
        this.pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField1.getText());
            }
        });
    }
}
