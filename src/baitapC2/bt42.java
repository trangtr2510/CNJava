package baitapC2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class bt42 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt42 frame = new bt42();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 // Hàm đổi tên màu sang Color
    private Color getColorFromName(String name) {
        switch (name) {
            case "Red": return Color.RED;
            case "Blue": return Color.BLUE;
            case "Green": return Color.GREEN;
            case "Yellow": return Color.YELLOW;
            case "Black": return Color.BLACK;
            default: return Color.WHITE;
        }
    }

	/**
	 * Create the frame.
	 */
	public bt42() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		// Tạo JComboBox với 5 màu
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);

        // Thêm JComboBox vào JFrame
        contentPane.add(colorComboBox);

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy màu được chọn
                String selectedColor = (String) colorComboBox.getSelectedItem();
                
                // Tạo 1 JPanel để custom nền cho JOptionPane
                JPanel panel = new JPanel();
                Color bgColor = getColorFromName(selectedColor);
                panel.setBackground(bgColor);

                JLabel label = new JLabel("You selected: " + selectedColor);
                label.setForeground(Color.WHITE); // Đổi màu chữ trắng cho dễ nhìn
                panel.add(label);

                // Hiển thị JOptionPane với panel custom
                JOptionPane.showMessageDialog(contentPane, panel, "Color Selected", JOptionPane.INFORMATION_MESSAGE);
            }
        });
		
	}

}
