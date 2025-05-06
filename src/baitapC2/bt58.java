package baitapC2;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;

public class bt58 extends JFrame {
    private JLabel label1, label2, label3;
    private ExecutorService executorService;

    public bt58() {
        setTitle("Bài 58");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label1 = new JLabel("Sum 1-100: ");
        label2 = new JLabel("Sum 1-200: ");
        label3 = new JLabel("Sum 1-300: ");

        executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> label1.setText("Sum 1-100: " + calculateSum(1, 100)));
        executorService.submit(() -> label2.setText("Sum 1-200: " + calculateSum(1, 200)));
        executorService.submit(() -> label3.setText("Sum 1-300: " + calculateSum(1, 300)));

        add(label1);
        add(label2);
        add(label3);
    }

    private int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        new bt58().setVisible(true);
    }
}
