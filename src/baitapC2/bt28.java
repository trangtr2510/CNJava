package baitapC2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class bt28 extends JFrame {
    public bt28() {
        setTitle("Bài 28");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Tên", "Tuổi", "Điểm"};
        Object[][] data = {
            {"Nguyễn A", 20, 8.5},
            {"Trần B", 22, 7.0},
            {"Lê C", 21, 9.0},
            {"Phan D", 23, 6.5},
            {"Hoàng E", 20, 7.8}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
    }

    public static void main(String[] args) {
        new bt28().setVisible(true);
    }
}
