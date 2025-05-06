package baitapC2;

import javax.swing.*;
import java.awt.event.*;

public class bt3 extends JFrame {
    public bt3() {
        setTitle("Exit App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(e -> System.exit(0));

        add(btnExit);
    }

    public static void main(String[] args) {
        new bt3().setVisible(true);
    }
}
