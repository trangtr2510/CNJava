package baitapC2;

import javax.swing.*;
import java.awt.*;
import javax.swing.SwingWorker;

public class bt54 extends JFrame {
    private JProgressBar progressBar;
    private JLabel statusLabel;

    public bt54() {
        setTitle("Bài 54");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        progressBar = new JProgressBar(0, 100);
        statusLabel = new JLabel("Status: Waiting...");

        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(e -> {
            SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                @Override
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(50);
                        publish(i);
                    }
                    return null;
                }

                @Override
                protected void process(java.util.List<Integer> chunks) {
                    progressBar.setValue(chunks.get(chunks.size() - 1));
                }

                @Override
                protected void done() {
                    statusLabel.setText("Done!");
                }
            };
            worker.execute();
        });

        add(progressBar);
        add(loadButton);
        add(statusLabel);
    }

    public static void main(String[] args) {
        new bt54().setVisible(true);
    }
}
