import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame1 {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 + num2;
					textField.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(73, 166, 118, 41);
		frame.getContentPane().add(btnNewButton);
		
		textField1 = new JTextField();
		textField1.setBounds(34, 36, 371, 72);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(415, 36, 389, 72);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 - num2;
					textField.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_1.setBounds(200, 166, 118, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 * num2;
					textField.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_2.setBounds(73, 218, 245, 47);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					
					ans = num1 / num2;
					textField.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 21));
		btnNewButton_3.setBounds(73, 276, 245, 41);
		frame.getContentPane().add(btnNewButton_3);
	
		textField = new JTextField();
		textField.setBounds(532, 166, 272, 151);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(359, 211, 163, 61);
		frame.getContentPane().add(lblNewLabel);
	}
}
