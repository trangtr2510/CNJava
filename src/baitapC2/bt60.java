package baitapC2;

import javax.swing.*;
import java.awt.*;
import javax.swing.SwingWorker;

public class bt60 extends JFrame {
    private JProgressBar progressBar;
    private JLabel statusLabel;

    public bt60() {
        setTitle("Bài 60");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        progressBar = new JProgressBar(0, 100);
        statusLabel = new JLabel("Status: Waiting...");

        JButton downloadButton = new JButton("Download");
        downloadButton.addActionListener(e -> startDownload());

        add(progressBar);
        add(downloadButton);
        add(statusLabel);
    }

    private void startDownload() {
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(100);
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
                statusLabel.setText("Download Complete");
            }
        };
        worker.execute();
    }

    public static void main(String[] args) {
        new bt60().setVisible(true);
    }
}
