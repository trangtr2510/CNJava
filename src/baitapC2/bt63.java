package baitapC2;
import javax.swing.*;
import java.awt.*;

public class bt63 extends JFrame {
    private JLabel countLabel;
    private int count = 0;
    private boolean paused = false;

    public bt63() {
        setTitle("Bài 63");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        countLabel = new JLabel("Count: 0");
        JButton startButton = new JButton("Start");
        JButton pauseButton = new JButton("Pause");
        JButton resumeButton = new JButton("Resume");

        startButton.addActionListener(e -> startCounting());
        pauseButton.addActionListener(e -> paused = true);
        resumeButton.addActionListener(e -> paused = false);

        add(startButton);
        add(pauseButton);
        add(resumeButton);
        add(countLabel);
    }

    private void startCounting() {
        new Thread(() -> {
            while (count < 100) {
                try {
                    Thread.sleep(1000);
                    if (!paused) {
                        count++;
                        countLabel.setText("Count: " + count);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new bt63().setVisible(true);
    }
}
