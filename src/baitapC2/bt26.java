package baitapC2;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class bt26 extends JFrame {
    private JPanel panel;

    public bt26() {
        setTitle("Bài 26");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);

        JSlider slider = new JSlider(0, 255, 0);
        slider.addChangeListener(e -> {
            int value = slider.getValue();
            panel.setBackground(new Color(value, value, value));
        });

        add(slider, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new bt26().setVisible(true);
    }
}
