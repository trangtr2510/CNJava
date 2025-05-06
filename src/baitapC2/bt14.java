package baitapC2;

import javax.swing.*;

public class bt14 extends JFrame {
    JLabel resultLabel;

    public bt14() {
        setTitle("Option Dialog");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Show Message");
        resultLabel = new JLabel("", SwingConstants.CENTER);

        btn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(this, "Choose an option", "Message", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (result) {
                case JOptionPane.YES_OPTION -> resultLabel.setText("You chose YES");
                case JOptionPane.NO_OPTION -> resultLabel.setText("You chose NO");
                case JOptionPane.CANCEL_OPTION -> resultLabel.setText("You chose CANCEL");
            }
        });

        setLayout(new java.awt.BorderLayout());
        add(btn, "North");
        add(resultLabel, "Center");
    }

    public static void main(String[] args) {
        new bt14().setVisible(true);
    }
}
