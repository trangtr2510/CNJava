package baitapC2;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class bt49 extends JFrame {
    private JLabel label;

    public bt49() {
        setTitle("Bài 49");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Sample");

        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton blueButton = new JRadioButton("Blue");
        JRadioButton greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(blueButton);
        group.add(greenButton);

        redButton.addItemListener(e -> label.setForeground(Color.RED));
        blueButton.addItemListener(e -> label.setForeground(Color.BLUE));
        greenButton.addItemListener(e -> label.setForeground(Color.GREEN));

        add(redButton);
        add(blueButton);
        add(greenButton);
        add(label);
    }

    public static void main(String[] args) {
        new bt49().setVisible(true);
    }
}
