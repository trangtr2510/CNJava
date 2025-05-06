package baitapC2;

import javax.swing.*;

public class bt4 extends JFrame {
    public bt4() {
        setTitle("Image Viewer");

        ImageIcon icon = new ImageIcon("C:\\Users\\TV\\Documents\\Zalo Received Files\\QLNH - Copy\\QLNH\\src\\Icons\\export.png"); // <-- Đổi path
        JLabel label = new JLabel(icon);

        add(label);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new bt4().setVisible(true);
    }
}
