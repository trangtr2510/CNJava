package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt50 extends JFrame {
    private int count = 0;
    private JLabel countLabel;
    private JLabel clickLabel;

    public bt50() {
        setTitle("Bài 50");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        countLabel = new JLabel("Count: 0");
        clickLabel = new JLabel("Click at: (0, 0)");

        JButton button = new JButton("Multi-Event");

        button.addActionListener(e -> {
            count++;
            countLabel.setText("Count: " + count);
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickLabel.setText("Click at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        add(countLabel);
        add(clickLabel);
        add(button);
    }

    public static void main(String[] args) {
        new bt50().setVisible(true);
    }
}
