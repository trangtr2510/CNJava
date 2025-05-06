package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt37 extends JFrame {
    private JLabel label;

    public bt37() {
        setTitle("Bài 37");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Mouse at: (0, 0)");
        add(label);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        new bt37().setVisible(true);
    }
}
