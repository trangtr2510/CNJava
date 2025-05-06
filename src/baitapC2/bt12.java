package baitapC2;

import javax.swing.*;

public class bt12 extends JFrame {
    public bt12() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Custom Look and Feel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("Custom Look and Feel", SwingConstants.CENTER));
    }

    public static void main(String[] args) {
        new bt12().setVisible(true);
    }
}
