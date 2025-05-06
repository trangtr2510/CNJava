package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt11 extends JFrame {
    public bt11() {
        setTitle("System Info");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        JLabel osLabel = new JLabel("OS: " + System.getProperty("os.name"), SwingConstants.CENTER);
        JLabel javaLabel = new JLabel("Java Version: " + System.getProperty("java.version"), SwingConstants.CENTER);

        add(osLabel);
        add(javaLabel);
    }

    public static void main(String[] args) {
        new bt11().setVisible(true);
    }
}
