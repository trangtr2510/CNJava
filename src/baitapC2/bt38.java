package baitapC2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class bt38 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt38 frame = new bt38();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Color getrandomColor() {
		Random random = new Random();
		int a = random.nextInt(255);
		int b = random.nextInt(255);
		int c = random.nextInt(255);
		return new Color(a,b,c);
		
	}
	
	private String colorRGB(Color color) {
		return "("+ color.getRed() +","+ color.getGreen() +","+ color.getBlue() +")";
	}
	/**
	 * Create the frame.
	 */
	public bt38() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RGB");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 152, 371, 86);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color randomColor = getrandomColor();
				contentPane.setBackground(randomColor);
				lblNewLabel.setText("RGB: "+colorRGB(randomColor));
			}
		});
		
	}
}
