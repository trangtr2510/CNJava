package baitapC2;
import javax.swing.*;
import java.awt.*;

public class bt57 extends JFrame {
    private JButton startButton, stopButton;
    private JLabel statusLabel;
    private Thread taskThread;

    public bt57() {
        setTitle("Bài 57");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        statusLabel = new JLabel("Status: Idle");

        startButton.addActionListener(e -> startTask());
        stopButton.addActionListener(e -> stopTask());

        add(startButton);
        add(stopButton);
        add(statusLabel);
    }

    private void startTask() {
        statusLabel.setText("Status: Running");
        taskThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        taskThread.start();
    }

    private void stopTask() {
        if (taskThread != null && taskThread.isAlive()) {
            taskThread.interrupt();
            statusLabel.setText("Status: Stopped");
        }
    }

    public static void main(String[] args) {
        new bt57().setVisible(true);
    }
}

