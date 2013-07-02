import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;


public class calculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String display="";
	String display1="";
	Double num1;
	String ope;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator1 frame = new calculator1();
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
	public calculator1() {
		setBackground(UIManager.getColor("Button.foreground"));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 293, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display=textField.getText();
				textField.setText(display + "1");
			}
		});
		btnNewButton.setBounds(10, 50, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "2");
			}
		});
		button.setBounds(111, 50, 91, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "3");
			}
		});
		button_1.setBounds(212, 50, 91, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "4");
			}
		});
		button_2.setBounds(10, 84, 91, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "5");
			}
		});
		button_3.setBounds(111, 84, 91, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "6");
			}
		});
		button_4.setBounds(212, 84, 91, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "7");
			}
		});
		button_5.setBounds(10, 118, 91, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "8");
			}
		});
		button_6.setBounds(111, 118, 91, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "9");
			}
		});
		button_7.setBounds(212, 118, 91, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText(display + "0");
			}
		});
		button_8.setBounds(111, 152, 91, 23);
		contentPane.add(button_8);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(ope){
				case "+":
					display=Double.toString(Double.parseDouble(textField.getText())+num1);
					textField.setText(display);
					break;
				case "-":
					display=Double.toString(num1-Double.parseDouble(textField.getText()));
					textField.setText(display);
					break;
				case "*":
					display=Double.toString(Double.parseDouble(textField.getText())*num1);
					textField.setText(display);
					break;
				case "/":
					if(Double.parseDouble(textField.getText())!=0){
					display=Double.toString(num1/Double.parseDouble(textField.getText()));
					textField.setText(display);
					}else{textField.setText("Undefined");
					}
					
					break;
					
					
				}
				
			}
		});
		btnNewButton_1.setBounds(212, 152, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button_9 = new JButton("/");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				num1=Double.parseDouble(display);
				textField.setText("");
				ope="/";
			}
		});
		button_9.setBounds(313, 50, 91, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				num1=Double.parseDouble(display);
				textField.setText("");
				ope="*";
			}
		});
		button_10.setBounds(313, 84, 91, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display=textField.getText();
				num1=Double.parseDouble(display);
				textField.setText("");
				ope="-";
			}
		});
		button_11.setBounds(313, 118, 91, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				num1=Double.parseDouble(display);
				textField.setText("");
				ope="+";
				
			}
		});
		button_12.setBounds(313, 152, 91, 23);
		contentPane.add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				textField.setText("");
			}
		});
		btnC.setBounds(10, 152, 91, 23);
		contentPane.add(btnC);
		
		JButton btnNewButton_2 = new JButton(",");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display=textField.getText();
				
				display1=textField.getText();
				display=display+"."+display1;
				textField.setText("");
				
			}
		});
		btnNewButton_2.setBounds(10, 186, 91, 23);
		contentPane.add(btnNewButton_2);
	}
}
