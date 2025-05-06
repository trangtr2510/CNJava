package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt36 extends JFrame {
    private JLabel label;

    public bt36() {
        setTitle("Bài 36");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Original Text");
        JButton button = new JButton("Change");
        button.addActionListener(e -> label.setText("Text Changed"));

        add(label);
        add(button);
    }

    public static void main(String[] args) {
        new bt36().setVisible(true);
    }
}
