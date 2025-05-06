package baitapC2;

import javax.swing.*;
import java.awt.event.*;

public class bt22 extends JFrame {
    public bt22() {
        setTitle("Bài 22");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String[] fruits = {"Táo", "Cam", "Chuối", "Xoài", "Dứa"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);
        comboBox.setBounds(50, 30, 200, 25);

        JLabel label = new JLabel("Chọn loại trái cây");
        label.setBounds(50, 70, 200, 25);

        comboBox.addActionListener(e -> label.setText("Bạn chọn: " + comboBox.getSelectedItem()));

        add(comboBox);
        add(label);
    }

    public static void main(String[] args) {
        new bt22().setVisible(true);
    }
}
