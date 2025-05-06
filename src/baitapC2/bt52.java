package baitapC2;
import javax.swing.*;
import java.awt.*;

public class bt52 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Safe GUI");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JLabel("Safe GUI"), BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
