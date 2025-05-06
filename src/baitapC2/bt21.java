// Example: bt21.java (JList)
package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt21 extends JFrame {
    public bt21() {
        setTitle("JList Example");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] cities = {"Hanoi", "Ho Chi Minh", "Da Nang", "Hue", "Can Tho",
                "Hai Phong", "Nha Trang", "Vung Tau", "Quy Nhon", "Bien Hoa"};
        JList<String> cityList = new JList<>(cities);
        JScrollPane scrollPane = new JScrollPane(cityList);

        JLabel countLabel = new JLabel("Total: " + cities.length + " cities");
        countLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(countLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new bt21().setVisible(true));
    }
}
