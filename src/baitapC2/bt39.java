package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt39 extends JFrame {
    private JLabel label;

    public bt39() {
        setTitle("Bài 39");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("You typed: ");
        JTextField textField = new JTextField(10);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("You typed: " + e.getKeyChar());
            }
        });

        add(label);
        add(textField);
    }

    public static void main(String[] args) {
        new bt39().setVisible(true);
    }
}
