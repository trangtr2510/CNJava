package baitapC2;

import java.awt.*;
import javax.swing.*;

public class bt16 extends JFrame {
    public bt16() {
        setTitle("BorderLayout Example");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel north = new JLabel("North", SwingConstants.CENTER);
        north.setBackground(Color.RED);
        north.setOpaque(true);

        JLabel south = new JLabel("South", SwingConstants.CENTER);
        south.setBackground(Color.BLUE);
        south.setOpaque(true);

        JLabel east = new JLabel("East", SwingConstants.CENTER);
        east.setBackground(Color.YELLOW);
        east.setOpaque(true);

        JLabel west = new JLabel("West", SwingConstants.CENTER);
        west.setBackground(Color.GREEN);
        west.setOpaque(true);

        JLabel center = new JLabel("Center", SwingConstants.CENTER);
        center.setBackground(Color.ORANGE);
        center.setOpaque(true);

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new bt16().setVisible(true);
    }
}
