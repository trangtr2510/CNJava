package baitapC2;

import javax.swing.*;

public class bt7 extends JFrame {
    public bt7() {
        setTitle("Resizable Window");
        setSize(400, 300);
        setMinimumSize(new java.awt.Dimension(200, 150));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Resizable Window", SwingConstants.CENTER);
        add(label);
    }

    public static void main(String[] args) {
        new bt7().setVisible(true);
    }
}
