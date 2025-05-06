package baitapC2;

import java.awt.*;
import javax.swing.*;

public class bt20 extends JFrame {
    public bt20() {
        setTitle("TabbedPane Example");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Home", new JLabel("Welcome to Home", SwingConstants.CENTER));
        tabbedPane.add("Profile", new JLabel("User Profile Info", SwingConstants.CENTER));
        tabbedPane.add("Settings", new JLabel("Settings Panel", SwingConstants.CENTER));

        add(tabbedPane);
    }

    public static void main(String[] args) {
        new bt20().setVisible(true);
    }
}
