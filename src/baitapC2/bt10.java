package baitapC2;

import javax.swing.*;

public class bt10 extends JFrame {
    public bt10() {
        setTitle("Menu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.addActionListener(e -> System.exit(0));

        menuFile.add(itemExit);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        new bt10().setVisible(true);
    }
}
