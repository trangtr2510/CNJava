package baitapC2;

import javax.swing.*;

public class bt2 extends JFrame {
    public bt2() {
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(this, "Welcome to Java Swing");
        System.exit(0);
    }

    public static void main(String[] args) {
        new bt2().setVisible(true);
    }
}
