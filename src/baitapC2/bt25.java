package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt25 extends JFrame {
    public bt25() {
        setTitle("Bài 25");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        group.add(maleButton);
        group.add(femaleButton);

        JLabel label = new JLabel("Chọn giới tính:");

        maleButton.addActionListener(e -> label.setText("Bạn chọn: Male"));
        femaleButton.addActionListener(e -> label.setText("Bạn chọn: Female"));

        add(maleButton);
        add(femaleButton);
        add(label);
    }

    public static void main(String[] args) {
        new bt25().setVisible(true);
    }
}
