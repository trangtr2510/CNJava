package baitapC2;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class bt55 extends JFrame {
    private Timer timer;

    public bt55() {
        setTitle("Bài 55");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(e -> stopTimer());

        timer = new Timer(1000, e -> changeBackgroundColor());

        add(stopButton, BorderLayout.SOUTH);
        setVisible(true);
        startTimer();
    }

    private void startTimer() {
        timer.start();
    }

    private void stopTimer() {
        timer.stop();
    }

    private void changeBackgroundColor() {
        Random rand = new Random();
        getContentPane().setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
    }

    public static void main(String[] args) {
        new bt55();
    }
}
