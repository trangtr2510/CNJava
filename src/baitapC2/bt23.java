package baitapC2;

import java.awt.EventQueue;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class bt23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hienthi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt23 frame = new bt23();
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
	public bt23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 446, 263);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		hienthi = new JTextField();
		panel.add(hienthi);
		hienthi.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btn7 = new JButton("7");
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		panel_1.add(btn9);
		
		JButton btnchia = new JButton("/");
		panel_1.add(btnchia);
		
		JButton btn4 = new JButton("4");
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		panel_1.add(btn6);
		
		JButton btnnhan = new JButton("*");
		panel_1.add(btnnhan);
		
		JButton btn1 = new JButton("1");
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		panel_1.add(btn3);
		
		JButton btntru = new JButton("-");
		panel_1.add(btntru);
		
		JButton btnphay = new JButton(".");
		panel_1.add(btnphay);
		
		JButton btn0 = new JButton("0");
		panel_1.add(btn0);
		
		JButton btn = new JButton("=");
		panel_1.add(btn);
		
		JButton btncong = new JButton("+");
		panel_1.add(btncong);
		
        // Gán sự kiện cho các nút số
        btn0.addActionListener(e -> appendToDisplay("0"));
        btn1.addActionListener(e -> appendToDisplay("1"));
        btn2.addActionListener(e -> appendToDisplay("2"));
        btn3.addActionListener(e -> appendToDisplay("3"));
        btn4.addActionListener(e -> appendToDisplay("4"));
        btn5.addActionListener(e -> appendToDisplay("5"));
        btn6.addActionListener(e -> appendToDisplay("6"));
        btn7.addActionListener(e -> appendToDisplay("7"));
        btn8.addActionListener(e -> appendToDisplay("8"));
        btn9.addActionListener(e -> appendToDisplay("9"));

        // Gán sự kiện cho các nút phép toán
        btncong.addActionListener(e -> appendToDisplay("+"));
        btntru.addActionListener(e -> appendToDisplay("-"));
        btnnhan.addActionListener(e -> appendToDisplay("*"));
        btnchia.addActionListener(e -> appendToDisplay("/"));
        btnphay.addActionListener(e -> appendToDisplay("."));

        // Xử lý nút "=" (thực hiện phép tính)
        btn.addActionListener(e -> calculateResult());
		
	}
	
	
	private void appendToDisplay(String text) {
	    hienthi.setText(hienthi.getText() + text);
	}
	
	private void calculateResult() {
	    try {
	        String expression = hienthi.getText();
	        double result = calculate(expression);
	        
	        // Hiển thị kết quả với định dạng phù hợp
	        if (result == (int) result) {
	            hienthi.setText(String.valueOf((int) result));
	        } else {
	            hienthi.setText(String.valueOf(result));
	        }
	    } catch (Exception ex) {
	        hienthi.setText("Lỗi");
	    }
	}
	
	// Phương thức đơn giản để tính toán biểu thức
	private double calculate(String expression) {
	    Stack<Double> numbers = new Stack<>();
	    Stack<Character> operators = new Stack<>();
	    
	    for (int i = 0; i < expression.length(); i++) {
	        char c = expression.charAt(i);
	        
	        // Bỏ qua khoảng trắng
	        if (c == ' ') continue;
	        
	        // Nếu là số hoặc dấu thập phân
	        if (Character.isDigit(c) || c == '.') {
	            StringBuilder sb = new StringBuilder();
	            
	            // Đọc toàn bộ số (có thể có nhiều chữ số)
	            while (i < expression.length() && 
	                  (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
	                sb.append(expression.charAt(i++));
	            }
	            // Lùi lại một vị trí vì vòng lặp for sẽ tăng i
	            i--;
	            
	            numbers.push(Double.parseDouble(sb.toString()));
	        }
	        // Nếu là dấu phép tính
	        else if (c == '+' || c == '-' || c == '*' || c == '/') {
	            // Xử lý phép tính có độ ưu tiên cao hơn trước
	            while (!operators.empty() && hasPrecedence(c, operators.peek())) {
	                numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
	            }
	            operators.push(c);
	        }
	    }
	    
	    // Thực hiện các phép tính còn lại
	    while (!operators.empty()) {
	        numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
	    }
	    
	    // Kết quả cuối cùng
	    return numbers.pop();
	}
	
	// Kiểm tra độ ưu tiên của phép tính
	private boolean hasPrecedence(char op1, char op2) {
	    if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
	        return false;
	    return true;
	}
	
	// Thực hiện phép tính
	private double applyOperation(char operator, double b, double a) {
	    switch (operator) {
	        case '+': return a + b;
	        case '-': return a - b;
	        case '*': return a * b;
	        case '/': 
	            if (b == 0) throw new ArithmeticException("Không thể chia cho 0");
	            return a / b;
	    }
	    return 0;
	}

	
}
