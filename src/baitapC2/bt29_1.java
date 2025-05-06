package baitapC2;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class bt29_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout layout;
	private JPanel jPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt29_1 frame = new bt29_1();
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
	public bt29_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		setContentPane(contentPane);
		
		layout = new CardLayout();
		jPanel = new JPanel(layout);
		
		JPanel card1 = new JPanel();
		card1.add(new JLabel("Page 1"));
		jPanel.add(card1, "card1");
		
		JPanel card2 = new JPanel();
		card2.add(new JButton("Click"));
		jPanel.add(card2, "card2");
		
		contentPane.add(jPanel);
		
		JButton btnSwitch = new JButton("Switch");
		btnSwitch.addActionListener(new ActionListener() {
			
			boolean showcard1 = true;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(showcard1) {
					layout.show(jPanel, "card2");
				} else {
					layout.show(jPanel, "card1");
				}
				showcard1 =! showcard1;
			}
		});
		contentPane.add(btnSwitch);
		
	}

}
