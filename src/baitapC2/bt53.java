package baitapC2;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bt53 extends JFrame {
    private JLabel timeLabel;

    public bt53() {
        setTitle("Bài 53");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timeLabel = new JLabel("", JLabel.CENTER);
        add(timeLabel, BorderLayout.CENTER);
        updateClock();
    }

    private void updateClock() {
        new Thread(() -> {
            while (true) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                timeLabel.setText(sdf.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new bt53().setVisible(true);
    }
}
