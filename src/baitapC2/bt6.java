package baitapC2;

import javax.swing.*;

public class bt6 extends JFrame {
    public bt6() {
        setTitle("Custom Icon Window");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("path/to/logo.png").getImage()); // <-- Đổi path

        JLabel label = new JLabel("Custom Icon Window", SwingConstants.CENTER);
        add(label);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new bt6().setVisible(true);
    }
}
