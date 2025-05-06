package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt40 extends JFrame {
    private int count = 0;
    private JLabel label;

    public bt40() {
        setTitle("Bài 40");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Count: 0");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> {
            count++;
            label.setText("Count: " + count);
        });

        add(label);
        add(button);
    }

    public static void main(String[] args) {
        new bt40().setVisible(true);
    }
}
