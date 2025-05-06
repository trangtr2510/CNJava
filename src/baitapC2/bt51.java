package baitapC2;

import javax.swing.*;
import java.awt.*;

public class  bt51 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        frame.add(progressBar, BorderLayout.CENTER);
        
        JButton button = new JButton("Start");
        button.addActionListener(e -> {
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
            };
            worker.execute();
        });
        frame.add(button, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
