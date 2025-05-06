package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt47 extends JFrame {
    private JLabel label;

    public bt47() {
        setTitle("Bài 47");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Follow Me");
        label.setSize(100, 20);
        add(label);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setLocation(e.getX(), e.getY());
            }
        });
    }

    public static void main(String[] args) {
        new bt47().setVisible(true);
    }
}
