package baitapC2;

import javax.swing.*;
import java.awt.*;

public class bt45 extends JFrame {
    private JLabel imageLabel;

    public bt45() {
        setTitle("Bài 45");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        ImageIcon imageIcon = new ImageIcon("path_to_image.jpg");
        imageLabel = new JLabel(imageIcon);

        JCheckBox checkBox = new JCheckBox("Show Image");
        checkBox.addItemListener(e -> {
            if (checkBox.isSelected()) {
                add(imageLabel);
            } else {
                remove(imageLabel);
            }
            revalidate();
            repaint();
        });

        add(checkBox);
    }

    public static void main(String[] args) {
        new bt45().setVisible(true);
    }
}
