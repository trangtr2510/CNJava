package baitapC2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bt27 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt27 frame = new bt27();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public bt27() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(70, 10, 146, 14);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(88, 52, 98, 35);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(false); // Vô hiệu hóa nút khi đang chạy
				SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
					@Override
					protected Void doInBackground() throws Exception {
						for (int i = 0; i <= 100; i++) {
							Thread.sleep(50); // 50ms x 100 = 5000ms = 5 giây
							publish(i);
						}
						return null;
					}

					@Override
					protected void process(java.util.List<Integer> chunks) {
						int value = chunks.get(chunks.size() - 1);
						progressBar.setValue(value);
					}

					@Override
					protected void done() {
						btnNewButton.setEnabled(true); // Cho phép nhấn lại
					}
				};
				worker.execute();
				
			}
		});
		contentPane.add(btnNewButton);
	}
	
	
}
