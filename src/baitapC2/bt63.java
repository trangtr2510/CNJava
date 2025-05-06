package baitapC2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class bt63 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int count = 0;  // Biến đếm
	private boolean isPaused = false; // Kiểm tra trạng thái tạm dừng
	private Thread counterThread;
	private JButton btnStart, btnPause, btnResume;
    private JLabel lblCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt63 frame = new bt63();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 // Hàm bắt đầu đếm
    private void startCounting() {
        count = 0;  // Đặt lại số đếm về 0 khi bắt đầu lại
        lblCount.setText("Count: " + count);

        counterThread = new Thread(() -> {
            while (true) {
                if (!isPaused) {
                    count++;
                    // Cập nhật GUI trên EDT
                    final int currentCount = count;
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        lblCount.setText("Count: " + currentCount);
                    });

                    try {
                        Thread.sleep(1000); // Đợi 1 giây
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break; // Nếu thread bị interrupt thì thoát
                    }
                } else {
                    try {
                        Thread.sleep(100); // Đợi ngắn để tránh tiêu tốn CPU khi pause
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        });
        counterThread.start();

        // Ẩn nút Start và hiển thị Resume
        btnStart.setEnabled(false);
        btnResume.setEnabled(true);
    }

    // Hàm tạm dừng đếm
    private void pauseCounting() {
        isPaused = true;  // Đặt isPaused là true để tạm dừng
        btnPause.setEnabled(false);  // Ẩn nút Pause khi đang tạm dừng
        btnResume.setEnabled(true);  // Hiển thị nút Resume khi tạm dừng
    }

    // Hàm tiếp tục đếm
    private void resumeCounting() {
        isPaused = false;  // Đặt isPaused là false để tiếp tục đếm
        btnPause.setEnabled(true);  // Hiển thị lại nút Pause
        btnResume.setEnabled(false);  // Ẩn nút Resume khi tiếp tục
    }

	/**
	 * Create the frame.
	 */
	public bt63() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(37, 88, 85, 21);
		contentPane.add(btnStart);

		btnPause = new JButton("Pause");
		btnPause.setBounds(134, 88, 85, 21);
		contentPane.add(btnPause);

		btnResume = new JButton("Resume");
		btnResume.setBounds(229, 88, 85, 21);
		contentPane.add(btnResume);

		lblCount = new JLabel("Count: 0");
		lblCount.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCount.setBounds(96, 27, 165, 32);
		contentPane.add(lblCount);

		
		// Ẩn nút Resume ban đầu
		btnResume.setEnabled(false);

        // Thêm ActionListener cho các nút
        btnStart.addActionListener(e -> startCounting());
        btnPause.addActionListener(e -> pauseCounting());
        btnResume.addActionListener(e -> resumeCounting());
	}

}
