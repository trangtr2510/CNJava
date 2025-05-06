package baitapC2;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class bt48 extends JFrame {
    private JTextField textField;
    private JLabel label;

    public bt48() {
        setTitle("Bài 48");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Number: ");
        textField = new JTextField(10);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateInput();
            }

            private void validateInput() {
                String text = textField.getText();
                try {
                    Integer.parseInt(text);
                    label.setText("Number: " + text);
                } catch (NumberFormatException ex) {
                    label.setText("Invalid input, only numbers allowed");
                }
            }
        });

        add(label);
        add(textField);
    }

    public static void main(String[] args) {
        new bt48().setVisible(true);
    }
}
