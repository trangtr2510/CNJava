package baitapC2;

import javax.swing.*;

public class bt13 extends JFrame {
    public bt13() {
        setTitle("Main Window");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Open Child Window");
        btn.addActionListener(e -> {
            JFrame child = new JFrame("Child Window");
            child.setSize(200, 200);
            child.add(new JLabel("Child Window", SwingConstants.CENTER));
            child.setLocationRelativeTo(null);
            child.setVisible(true);
        });

        add(btn);
    }

    public static void main(String[] args) {
        new bt13().setVisible(true);
    }
}
