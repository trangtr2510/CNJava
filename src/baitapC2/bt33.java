package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt33 extends JFrame {
    public bt33() {
        setTitle("Bài 33");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        JLabel label3 = new JLabel("Label 3");

        add(label1);
        add(label2);
        add(label3);
    }

    public static void main(String[] args) {
        new bt33().setVisible(true);
    }
}
