package baitapC2;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class bt59 extends JFrame {
    private JList<Integer> numberList;
    private DefaultListModel<Integer> listModel;

    public bt59() {
        setTitle("Bài 59");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        numberList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(numberList);

        JButton generateButton = new JButton("Generate");
        generateButton.addActionListener(e -> generateNumbers());

        add(scrollPane, BorderLayout.CENTER);
        add(generateButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void generateNumbers() {
        new Thread(() -> {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    listModel.addElement(rand.nextInt(100) + 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new bt59();
    }
}
