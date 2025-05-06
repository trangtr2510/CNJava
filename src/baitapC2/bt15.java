package baitapC2;

import javax.swing.*;

public class bt15 extends JFrame {
    public bt15() {
        setTitle("No Close Button");
        setSize(400, 300);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btn = new JButton("Exit");
        btn.addActionListener(e -> System.exit(0));

        add(btn);
    }

    public static void main(String[] args) {
        new bt15().setVisible(true);
    }
}
