package baitapC2;

import java.awt.*;
import javax.swing.*;

public class bt17 extends JFrame {
    public bt17() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        add(new JLabel("Username:"));
        add(new JTextField(15));
        add(new JLabel("Password:"));
        add(new JPasswordField(15));
        add(new JButton("Login"));
    }

    public static void main(String[] args) {
        new bt17().setVisible(true);
    }
}
