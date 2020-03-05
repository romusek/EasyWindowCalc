package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import controler.DigitsController;
import controler.MainCalcController;

public class MainCalcWindow {
	
	private static MainCalcWindow INSTANCE;
	
	private MainCalcWindow() {
		initialize();
	}
	
	public static MainCalcWindow getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MainCalcWindow();
		}
		return INSTANCE;
	}
	
	MainCalcController mainCalcController;
	DigitsController digitsController;
	
	private JLabel first;
	private JLabel second;
	private JLabel sign;
	private JLabel solution;

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCalcWindow window = getInstance();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton zero = new JButton("0");
		zero.setBounds(95, 303, 50, 50);
		frame.getContentPane().add(zero);
		
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().zeroPressed();
			}
		});
		
		JButton one = new JButton("1");
		one.setBounds(34, 120, 50, 50);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().onePressed();
			}
		});
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.setBounds(95, 120, 50, 50);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().twoPressed();
			}
		});
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.setBounds(155, 120, 50, 50);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().threePressed();
			}
		});
		frame.getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.setBounds(34, 181, 50, 50);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().fourPressed();
			}
		});
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.setBounds(95, 181, 50, 50);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().fivePressed();
			}
		});
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.setBounds(155, 181, 50, 50);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().sixPressed();
			}
		});
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.setBounds(34, 242, 50, 50);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().sevenPressed();
			}
		});
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.setBounds(95, 242, 50, 50);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().eightPressed();
			}
		});
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.setBounds(155, 242, 50, 50);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitsController.getInstance().ninePressed();
			}
		});
		
		frame.getContentPane().add(nine);
		
		first = new JLabel("");
		first.setBackground(Color.RED);
		first.setBounds(10, 11, 145, 14);
		first.setForeground(Color.BLACK);
		frame.getContentPane().add(first);
		
		second = new JLabel("");
		second.setBounds(234, 11, 190, 14);
		frame.getContentPane().add(second);
		
		sign = new JLabel("");
		sign.setBounds(178, 11, 46, 14);
		frame.getContentPane().add(sign);
		
		JButton plus = new JButton("+");
		plus.setBounds(234, 120, 42, 42);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainCalcController.getInstance().plusPressed();
			}
		});
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.setBounds(234, 167, 42, 42);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainCalcController.getInstance().minusPressed();
			}
		});
		frame.getContentPane().add(minus);
		
		JButton multiple = new JButton("*");
		multiple.setBounds(234, 220, 42, 42);
		multiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainCalcController.getInstance().multiplyPressed();
			}
		});
		frame.getContentPane().add(multiple);
		
		JButton devide = new JButton("/");
		devide.setBounds(234, 268, 42, 42);
		devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainCalcController.getInstance().devidePressed();
			}
		});
		frame.getContentPane().add(devide);
		
		solution = new JLabel("");
		solution.setBounds(10, 30, 414, 14);
		frame.getContentPane().add(solution);
		
		JButton equals = new JButton("=");
		equals.setBounds(374, 292, 50, 23);
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainCalcController.getInstance().equalsPressed();
			}
		});
		frame.getContentPane().add(equals);
		
		JButton btnFocusLeft = new JButton("Change focus");
		btnFocusLeft.setBounds(155, 64, 121, 23);
		btnFocusLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainCalcController.getInstance().changeFocusePressed();
			}
		});
		frame.getContentPane().add(btnFocusLeft);
	}

	public JLabel getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first.setText(first);
	}

	public JLabel getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second.setText(second);
	}

	public JLabel getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign.setText(sign);
	}

	public JLabel getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution.setText(solution);
	}
	
}
