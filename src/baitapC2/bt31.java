package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt31 extends JFrame {
    public bt31() {
        setTitle("Bài 31");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] countries = {"Vietnam", "USA", "Japan", "Germany", "India"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.addActionListener(e -> JOptionPane.showMessageDialog(this, "Bạn đã chọn: " + comboBox.getSelectedItem()));

        add(comboBox);
    }

    public static void main(String[] args) {
        new bt31().setVisible(true);
    }
}
