package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt24 extends JFrame {
    private JPanel panel;

    public bt24() {
        setTitle("Bài 24");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel);

        JCheckBox checkBox = new JCheckBox("Enable Background");
        checkBox.addItemListener(e -> {
            if (checkBox.isSelected()) {
                panel.setBackground(Color.GREEN);
            } else {
                panel.setBackground(Color.WHITE);
            }
        });

        panel.add(checkBox);
    }

    public static void main(String[] args) {
        new bt24().setVisible(true);
    }
}
