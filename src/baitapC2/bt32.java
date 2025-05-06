package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt32 extends JFrame {
    private JLabel label;

    public bt32() {
        setTitle("Bài 32");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Văn bản ban đầu");
        JButton button = new JButton("Thay đổi văn bản");

        button.addActionListener(e -> label.setText("Văn bản đã thay đổi"));

        add(label);
        add(button);
    }

    public static void main(String[] args) {
        new bt32().setVisible(true);
    }
}
