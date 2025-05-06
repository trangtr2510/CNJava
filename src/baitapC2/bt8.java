package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt8 extends JFrame {
    public bt8() {
        setTitle("Colored Background");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN); 

        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Colored Background", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        add(panel);
    }

    public static void main(String[] args) {
        new bt8().setVisible(true);
    }
}
