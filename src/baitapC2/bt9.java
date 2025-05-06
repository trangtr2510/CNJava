package baitapC2;

import javax.swing.*;

public class bt9 extends JFrame {
    public bt9() {
        setTitle("Main Window");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Open Dialog");
        button.addActionListener(e -> {
            JDialog dialog = new JDialog(this, "Dialog", true);
            dialog.setSize(200, 150);
            dialog.add(new JLabel("This is a dialog", SwingConstants.CENTER));
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        });

        add(button);
    }

    public static void main(String[] args) {
        new bt9().setVisible(true);
    }
}
