package baitapC2;

import javax.swing.*;
import java.time.LocalDateTime;

public class bt5 extends JFrame {
    public bt5() {
        setTitle("Digital Clock");
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String time = LocalDateTime.now().toString();
        JLabel label = new JLabel(time, SwingConstants.CENTER);
        add(label);
    }

    public static void main(String[] args) {
        new bt5().setVisible(true);
    }
}
