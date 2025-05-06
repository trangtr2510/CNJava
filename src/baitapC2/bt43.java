package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt43 extends JFrame {

    public bt43() {
        setTitle("Bài 43");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    public static void main(String[] args) {
        new bt43().setVisible(true);
    }
}
