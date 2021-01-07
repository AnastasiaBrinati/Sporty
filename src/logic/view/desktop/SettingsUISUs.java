package logic.view.desktop;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;


public class SettingsUISUs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JPanel headerPanel = new JPanel();

	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("");
	
	private final JPanel panel = new JPanel();
	private final JButton credentialsButton = new JButton("Name");
	private final JButton securityButton = new JButton("email and password");
	private final JButton coursesButton_2 = new JButton("Courses");
	private final JButton courtsButton = new JButton("Courts");
	private final JButton eventsButton = new JButton("Events");
	
	private final JPanel subtitlePanel = new JPanel();
	private final JLabel subtitlelbl = new JLabel("Settings");
	
	private JPanel namePanel = new JPanel();
	private final JLabel surnamelbl = new JLabel("Surname");
	private final JTextField textFieldSurname = new JTextField();
	private JLabel nameLbl = new JLabel("Name");
	private final JTextField textFieldName = new JTextField();
	private final JLabel usernamelbl = new JLabel("Username");
	private final JTextField textFieldUsername = new JTextField();

	
	private final JButton saveButton = new JButton("Save");
	private final JButton cancelButton = new JButton("Cancel");
	
	private final JPanel emailPanel = new JPanel();
	private final JLabel emaillbl = new JLabel("Email");
	private final JLabel lblPassword = new JLabel("Password");
	private final JLabel lblConfirmPassword = new JLabel("Confirm Password");
	private JTextField textFieldEmail;
	private final JPasswordField confirmPsswdtextField = new JPasswordField();
	private final JPasswordField passwordField = new JPasswordField();
	private final JLabel pencilLbl1 = new JLabel("");
	private final JLabel pencilLbl2 = new JLabel("");
	private final JLabel pencilLbl3 = new JLabel("");
	private final JLabel pencilLbl4 = new JLabel("");
	private final JLabel pencilLbl5 = new JLabel("");
	private final JLabel pencilLbl6 = new JLabel("");
	private final JButton exitButton = new JButton("");

	public SettingsUISUs() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		emailPanel.setBounds(305, 168, 1003, 491);
		contentPane.add(emailPanel);
		emailPanel.setLayout(null);
		
				emaillbl.setFont(new Font("Arial", Font.PLAIN, 18));
				emaillbl.setBounds(53, 53, 116, 29);
				
				emailPanel.add(emaillbl);
				lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
				lblPassword.setBounds(53, 133, 116, 29);
				
				emailPanel.add(lblPassword);
				lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 18));
				lblConfirmPassword.setBounds(53, 215, 154, 29);
				
				emailPanel.add(lblConfirmPassword);
				
				textFieldEmail = new JTextField();
				textFieldEmail.setColumns(10);
				textFieldEmail.setBounds(308, 60, 241, 25);
				emailPanel.add(textFieldEmail);
				confirmPsswdtextField.setBounds(308, 215, 241, 26);
				
				emailPanel.add(confirmPsswdtextField);
				passwordField.setBounds(308, 137, 241, 25);
				
				emailPanel.add(passwordField);
				pencilLbl4.setBounds(559, 41, 46, 44);
				
				emailPanel.add(pencilLbl4);
				pencilLbl5.setBounds(559, 118, 46, 44);
				
				emailPanel.add(pencilLbl5);
				pencilLbl6.setBounds(559, 200, 46, 44);
				
				emailPanel.add(pencilLbl6);
		
				
		textFieldName.setBounds(223, 58, 241, 25);
		textFieldName.setColumns(10);
		namePanel.setBounds(305, 168, 992, 491);
		
		contentPane.add(namePanel);
		namePanel.setLayout(null);
		surnamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		surnamelbl.setBounds(49, 146, 134, 25);
		namePanel.add(surnamelbl);
		
		nameLbl.setFont(new Font("Arial", Font.PLAIN, 18));
		nameLbl.setBounds(49, 54, 116, 29);
		namePanel.add(nameLbl);
		
		namePanel.add(textFieldName);
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(223, 148, 241, 25);
		
		namePanel.add(textFieldSurname);
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(223, 252, 241, 25);
		
		namePanel.add(textFieldUsername);
		usernamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		usernamelbl.setBounds(49, 250, 134, 25);
		
		namePanel.add(usernamelbl);
		saveButton.setBackground(new Color(255, 99, 71));
		saveButton.setBounds(262, 355, 158, 38);
		
		namePanel.add(saveButton);
		cancelButton.setBounds(94, 355, 158, 38);
		
		surnamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		surnamelbl.setBounds(49, 146, 134, 25);
		
		namePanel.add(surnamelbl);
		namePanel.add(cancelButton);
		pencilLbl1.setBounds(474, 39, 46, 44);
		
		namePanel.add(pencilLbl1);
		pencilLbl2.setBounds(474, 128, 46, 44);
		
		namePanel.add(pencilLbl2);
		pencilLbl3.setBounds(474, 233, 46, 44);
		
		namePanel.add(pencilLbl3);
		
		Image img1=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilLbl1.setIcon(new ImageIcon(img1));
		
		Image img2=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilLbl2.setIcon(new ImageIcon(img2));
		
		Image img3=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilLbl3.setIcon(new ImageIcon(img3));
		
		Image img4=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilLbl4.setIcon(new ImageIcon(img4));
		
		Image img5=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilLbl5.setIcon(new ImageIcon(img3));
		
		Image img6=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilLbl6.setIcon(new ImageIcon(img3));
		
		Image img7=new ImageIcon(this.getClass().getResource("/016-trash bin.png")).getImage();
		exitButton.setIcon(new ImageIcon(img7));
		exitButton.setContentAreaFilled(false);

		subtitlePanel.setBackground(new Color(192, 192, 192));
		subtitlePanel.setBounds(305, 54, 992, 115);

		contentPane.add(subtitlePanel);
		subtitlePanel.setLayout(null);
		subtitlelbl.setFont(new Font("Arial Black", Font.PLAIN, 20));
		subtitlelbl.setBounds(50, 35, 185, 43);

				

		subtitlePanel.add(subtitlelbl);

		//header
		headerPanel.setBackground(new Color(0, 128, 128));
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1297, 54);
		headerPanel.setLayout(null);

		homeButton.setBounds(367, 0, 48, 51);
		homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\home-3-32.png"));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);

		searchBar = new JTextField();
		searchBar.setBounds(422, 12, 343, 30);
		searchBar.setColumns(10);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);

		contentPane.add(headerPanel);
														
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 54, 307, 605);
		panel.setLayout(null);
		credentialsButton.setBackground(new Color(0, 128, 128));
		credentialsButton.setBounds(10, 79, 287, 57);
		panel.add(credentialsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		securityButton.setBackground(new Color(102, 205, 170));
		securityButton.setBounds(10, 137, 287, 57);
		
		panel.add(securityButton);
		coursesButton_2.setBackground(new Color(102, 205, 170));
		coursesButton_2.setBounds(10, 195, 287, 57);
		
		panel.add(coursesButton_2);
		courtsButton.setBackground(new Color(102, 205, 170));
		courtsButton.setBounds(10, 253, 287, 57);
		
		panel.add(courtsButton);
		eventsButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBounds(10, 311, 287, 57);
		
		panel.add(eventsButton);
		
				Image img8=new ImageIcon(this.getClass().getResource("/003-home.png")).getImage();
				homeButton.setIcon(new ImageIcon(img8));
				homeButton.setContentAreaFilled(false);
				exitButton.setBounds(1240, 0, 57, 51);
				
				headerPanel.add(exitButton);
				
				Image img9=new ImageIcon(this.getClass().getResource("/002-settings.png")).getImage();
	}
	
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public JButton getCredentialsButton() {
		return credentialsButton;
	}
	
	public JButton getCancelButton() {
		return cancelButton;
	}
	
	public JButton getSaveButton() {
		return saveButton;
	}
	
	public JButton getSecurityButton() {
		return securityButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	
		
	public void setNamePanelVisible() {
		namePanel.setVisible(true);
		emailPanel.setVisible(false);
		
		credentialsButton.setBackground(new Color(0, 128, 128));
		securityButton.setBackground(new Color(102, 205, 170));
		
	}
	
	public void setEmailPanelVisible() {
		namePanel.setVisible(false);
		emailPanel.setVisible(true);
		
		credentialsButton.setBackground(new Color(102, 205, 170));
		securityButton.setBackground(new Color(0, 128, 128));
		
	}
	
	
	
	public String getName() {
		return textFieldName.getText();
	}
	
	public String getSurname() {
		return textFieldSurname.getText();
	}
	
	public String getUsername() {
		return textFieldUsername.getText();
	}
	
	public void setCredentials(String name, String surname, String username, String email, String password) {
		
		textFieldName.setText(name);
		textFieldSurname.setText(surname);
		textFieldUsername.setText(username);
		textFieldEmail.setText(email);
		passwordField.setText(password);
		
	}
	
	
}
