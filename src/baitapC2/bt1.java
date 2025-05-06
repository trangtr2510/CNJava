package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt1 extends JFrame {
    public bt1() {
        setTitle("My First Swing App");
        setSize(400, 300);
        setLocationRelativeTo(null); // Center
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        add(label);
    }

    public static void main(String[] args) {
        new bt1().setVisible(true);
    }
}
