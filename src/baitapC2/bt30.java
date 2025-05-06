package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt30 extends JFrame {
    public bt30() {
        setTitle("Bài 30");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new GridLayout(2, 2));

        panel1.add(new JButton("Button 1"));
        panel1.add(new JButton("Button 2"));

        panel2.add(new JButton("Button A"));
        panel2.add(new JButton("Button B"));
        panel2.add(new JButton("Button C"));
        panel2.add(new JButton("Button D"));

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new bt30().setVisible(true);
    }
}
