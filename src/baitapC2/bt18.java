package baitapC2;

import java.awt.*;
import javax.swing.*;

public class bt18 extends JFrame {
    public bt18() {
        setTitle("Chess Board");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        boolean isWhite = false;
        for (int i = 0; i < 64; i++) {
            JPanel cell = new JPanel();
            cell.setBackground(isWhite ? Color.WHITE : Color.BLACK);
            add(cell);
            if (i % 8 != 7) isWhite = !isWhite;
        }
    }

    public static void main(String[] args) {
        new bt18().setVisible(true);
    }
}
