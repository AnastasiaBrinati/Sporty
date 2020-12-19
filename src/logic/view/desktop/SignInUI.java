package logic.view.desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignInUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldUsername;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;
	
	JButton resetButton = new JButton("Reset");
	JButton signUpButton = new JButton("Sign Up");
	Button btnLogin = new Button("Login");
	JSeparator separator4 = new JSeparator();
	JLabel lblName = new JLabel("NAME");
	JLabel lblSurname = new JLabel("SURNAME");
	JLabel lblUsername = new JLabel("USERNAME");
	JSeparator separator = new JSeparator();
	JSeparator separator5 = new JSeparator();
	JSeparator separator1 = new JSeparator();
	JSeparator separator3 = new JSeparator();
	JLabel lblEmail = new JLabel("E-MAIL");
	JSeparator separator2 = new JSeparator();
	JLabel lblPassword = new JLabel("PASSWORD");
	JPanel panel = new JPanel();
	JLabel lblNewLabel3 = new JLabel("");
	JButton btnNewButton1 = new JButton("");
	JButton btnNewButton2 = new JButton("");
	JLabel lblAlternative = new JLabel("Or sign up with:");
	JLabel lblOr = new JLabel("Or");


	// Create the frame.
	public SignInUI() {
		
		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLogin.setBounds(561, 480, 74, 22);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.GRAY);
		
		separator4.setBackground(Color.GRAY);
		separator4.setBounds(447, 136, 289, 2);
		
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(447, 34, 118, 14);

		textFieldName = new JTextField();
		textFieldName.setBounds(447, 48, 289, 20);
		textFieldName.setColumns(10);
		
		separator5.setBackground(Color.GRAY);
		separator5.setBounds(447, 79, 289, 2);
	
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBackground(Color.WHITE);
		lblSurname.setBounds(447, 92, 118, 14);

		textFieldSurname = new JTextField();
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(447, 107, 289, 20);
		
		separator2.setBackground(Color.GRAY);
		separator2.setBounds(406, 363, 362, -9);
		
		lblUsername.setBounds(447, 149, 118, 14);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);
		
		separator3.setBackground(Color.GRAY);
		separator3.setBounds(457, 322, 289, 2);

		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(447, 164, 289, 20);
		
		lblEmail.setBounds(447, 208, 46, 14);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		
		separator.setBackground(Color.GRAY);
		separator.setBounds(447, 253, 289, 2);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(447, 222, 289, 20);
		textFieldEmail.setColumns(10);
		
		lblPassword.setBounds(447, 266, 92, 14);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);
		
		separator1.setBackground(Color.GRAY);
		separator1.setBounds(447, 195, 289, 2);

		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(447, 281, 289, 20);
		textFieldPassword.setColumns(10);
		
		panel.setBounds(0, 0, 382, 512);
		panel.setLayout(null);
		contentPane.add(panel);
		
		lblNewLabel3.setBounds(-80, -12, 512, 537);
		panel.add(lblNewLabel3);
		lblNewLabel3.setIcon(new ImageIcon("C:\\Users\\giuli\\Pictures\\Wallpapers\\Sports-Wallpapers-and-Backgrounds-HD-by-Pocket-Books.jpg"));
		
		btnNewButton1.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\Facebook_logo_(square) (1).png"));
		btnNewButton1.setBounds(552, 416, 40, 40);
		
		btnNewButton2.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\219-2197783_training-documents-google-logo-icon-png (1).png"));
		btnNewButton2.setBounds(602, 416, 40, 40);
		
		lblAlternative.setForeground(Color.WHITE);
		lblAlternative.setBounds(561, 392, 74, 14);
		
		lblOr.setForeground(Color.WHITE);
		lblOr.setBounds(589, 460, 46, 14);

		resetButton.setBackground(Color.GRAY);
		resetButton.setBounds(503, 345, 89, 23);

		signUpButton.setBackground(Color.ORANGE);
		signUpButton.setBounds(602, 345, 89, 23);

		// adding stuff to content pane
		contentPane.add(separator);
		contentPane.add(separator1);
		contentPane.add(separator2);
		contentPane.add(separator3);
		contentPane.add(separator4);
		contentPane.add(separator5);
		
		contentPane.add(lblName);
		contentPane.add(lblPassword);
		contentPane.add(lblUsername);
		contentPane.add(lblEmail);
		contentPane.add(lblSurname);
		contentPane.add(textFieldName);
		contentPane.add(textFieldSurname);
		contentPane.add(textFieldUsername);
		contentPane.add(textFieldEmail);
		contentPane.add(textFieldPassword);
		contentPane.add(btnLogin);
		contentPane.add(btnNewButton1);
		contentPane.add(btnNewButton2);
		contentPane.add(lblAlternative);
		contentPane.add(lblOr);
		contentPane.add(resetButton);
		contentPane.add(signUpButton);
	}

	public JButton getDeleteButton() {
		return resetButton;
	}
	public Button getLoginButton() {
		return btnLogin;
	}
	public JButton getSignUpButton() {
		return signUpButton;
	}
	public void resetForm() {
		textFieldPassword.setText(" ");
		textFieldEmail.setText(" ");
		textFieldName.setText(" ");
		textFieldSurname.setText(" ");
		textFieldUsername.setText(" ");
	}
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public String getName() {
		return textFieldPassword.getText();
	}
	public String getSurname() {
		return textFieldEmail.getText();
	}
	public String getUsername() {
		return textFieldName.getText();
	}
	public String getEmail() {
		return textFieldSurname.getText();
	}
	public String getPassword() {
		return textFieldUsername.getText();
	}
}