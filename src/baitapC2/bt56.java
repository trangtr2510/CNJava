package baitapC2;
import javax.swing.*;
import java.awt.*;
import javax.swing.SwingWorker;

public class bt56 extends JFrame {
    private JLabel countLabel;

    public bt56() {
        setTitle("Bài 56");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        countLabel = new JLabel("Time: 10");
        JButton startButton = new JButton("Start");

        startButton.addActionListener(e -> {
            SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                @Override
                protected Void doInBackground() throws Exception {
                    for (int i = 10; i >= 0; i--) {
                        Thread.sleep(1000);
                        publish(i);
                    }
                    return null;
                }

                @Override
                protected void process(java.util.List<Integer> chunks) {
                    countLabel.setText("Time: " + chunks.get(chunks.size() - 1));
                }

                @Override
                protected void done() {
                    countLabel.setText("Finished");
                }
            };
            worker.execute();
        });

        add(countLabel);
        add(startButton);
    }

    public static void main(String[] args) {
        new bt56().setVisible(true);
    }
}
