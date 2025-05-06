package baitapC2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt46 extends JFrame {
    private JList<String> list;

    public bt46() {
        setTitle("Bài 46");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"};
        list = new JList<>(items);
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane);

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String selectedItem = list.getSelectedValue();
                    JOptionPane.showMessageDialog(bt46.this, "You selected: " + selectedItem);
                }
            }
        });
    }

    public static void main(String[] args) {
        new bt46().setVisible(true);
    }
}
