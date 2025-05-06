package baitapC2;

import javax.swing.*;

public class bt35 extends JFrame {
    public bt35() {
        setTitle("Bài 35");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Đây là Tab 1"));
        tabbedPane.addTab("Tab 1", panel1);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Đây là Tab 2"));
        tabbedPane.addTab("Tab 2", panel2);

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Đây là Tab 3"));
        tabbedPane.addTab("Tab 3", panel3);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        new bt35().setVisible(true);
    }
}
