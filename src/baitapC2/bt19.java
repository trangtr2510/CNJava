package baitapC2;

import java.awt.*;
import javax.swing.*;

public class bt19 extends JFrame {
    public bt19() {
        setTitle("Nested Layout");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel1.add(new JLabel("Label 1A"));
        panel1.add(Box.createHorizontalStrut(10));
        panel1.add(new JLabel("Label 1B"));
        panel1.add(Box.createHorizontalStrut(10));
        panel1.add(new JButton("Button 1"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JLabel("Label 2A"));
        panel2.add(Box.createHorizontalStrut(10));
        panel2.add(new JLabel("Label 2B"));
        panel2.add(Box.createHorizontalStrut(10));
        panel2.add(new JButton("Button 2"));

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        add(mainPanel);
    }

    public static void main(String[] args) {
        new bt19().setVisible(true);
    }
}
