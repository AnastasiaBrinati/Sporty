package logic.view.desktop;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import java.awt.SystemColor;
import javax.swing.JTextArea;

public class CourtUIOrg extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton profileButton = new JButton("");
	private JButton exitButton = new JButton("");
	private JButton homeButton = new JButton("");
	
	private JLabel nameLbl = new JLabel("Name");
	private JLabel sportLbl = new JLabel("Sport");
	private JLabel priceLbl = new JLabel("");
	private JLabel availabilityLbl = new JLabel("");
	private JLabel typeLbl = new JLabel("");
	private JTextArea descriptionTextArea = new JTextArea();
	private JButton deleteButton = new JButton("Delete ");
	private final JButton backButton = new JButton("\u21E6");

	public CourtUIOrg() {

		this.setLocationRelativeTo(null);
		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1264, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		panel.add(lblNewLabel);
		
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(980, 0, 49, 49);
		panel.add(profileButton);
		
		exitButton.setBounds(1039, 0, 49, 49);
		panel.add(exitButton);
		
	    homeButton.setContentAreaFilled(false);
		homeButton.setBounds(336, 10, 40, 43);
		panel.add(homeButton);
		backButton.setForeground(Color.WHITE);
		backButton.setFont(new Font("Cambria Math", Font.PLAIN, 40));
		backButton.setContentAreaFilled(false);
		backButton.setBackground(new Color(204, 0, 0));
		backButton.setBounds(112, 0, 85, 54);
		
		panel.add(backButton);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 55, 1264, 686);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1264, 148);
		panel_1.setBackground(new Color(47, 79, 79));
		mainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(10, 11, 126, 126);
		panel_1.add(lblNewLabel_1);
		
		nameLbl.setForeground(new Color(255, 255, 255));
		nameLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 23));
		nameLbl.setBounds(146, 11, 159, 25);
		panel_1.add(nameLbl);
		
		sportLbl.setForeground(Color.WHITE);
		sportLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		sportLbl.setBounds(146, 47, 61, 14);
		panel_1.add(sportLbl);
		
		
		deleteButton.setForeground(new Color(255, 255, 255));
		deleteButton.setBackground(new Color(255, 0, 0));
		deleteButton.setBounds(1082, 47, 133, 63);
		panel_1.add(deleteButton);
		
		descriptionTextArea.setBackground(new Color(230, 230, 250));
		descriptionTextArea.setBounds(61, 197, 758, 128);
		mainPanel.add(descriptionTextArea);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(new Color(0, 0, 0));
		lblDescription.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblDescription.setBounds(61, 172, 113, 14);
		mainPanel.add(lblDescription);
		
		
		priceLbl.setForeground(new Color(0, 0, 0));
		priceLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		priceLbl.setBounds(71, 381, 61, 14);
		mainPanel.add(priceLbl);
		
		typeLbl.setForeground(Color.BLACK);
		typeLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		typeLbl.setBounds(71, 435, 143, 14);
		mainPanel.add(typeLbl);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setForeground(Color.BLACK);
		lblAvailability.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblAvailability.setBounds(61, 460, 113, 14);
		mainPanel.add(lblAvailability);
		
		availabilityLbl.setForeground(Color.BLACK);
		availabilityLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		availabilityLbl.setBounds(71, 485, 61, 14);
		mainPanel.add(availabilityLbl);
		//LineBorder lineBorder=new LineBorder(Color.white,8,true);
	}

	public JButton getProfileButton() {
		return profileButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}

	public JButton getHomeButton() {
		return homeButton;
	}
	public JButton getBackButton() {
		return backButton;
	}
	
	public void setCredentials(String name, String price, String sport, String availability, String description, String type) {
		
		nameLbl.setText(name);
		sportLbl.setText(sport);
		descriptionTextArea.setText(description);
		priceLbl.setText(price+"$");
		typeLbl.setText(type);
		availabilityLbl.setText(availability);
	}

	public String getCourtName() {
		return nameLbl.getText();
	}

	public JButton getDeleteButton() {
		return deleteButton;
	}
	/*
	public JButton getSettingsButton() {
		return settingsButton;
	}
	*/
}
	
