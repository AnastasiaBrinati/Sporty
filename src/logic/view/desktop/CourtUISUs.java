package logic.view.desktop;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import java.awt.SystemColor;
import javax.swing.JTextArea;

public class CourtUISUs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel menuBarPanel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton profileButton = new JButton("profile");
	private JButton exitButton = new JButton("\u2398");
	private JButton homeButton = new JButton("\u2302");

	private JTextArea descriptionTextArea = new JTextArea();
	private JLabel sportLbl = new JLabel("Sport");
	private JLabel nameLbl = new JLabel("Name");
	private JLabel priceLbl = new JLabel("$20.00");
	private JLabel typeLbl = new JLabel("Synthetic");
	private JLabel availabilityLbl = new JLabel("7");
	private final JButton backButton = new JButton("\u21E6");

	public CourtUISUs() {

		this.setLocationRelativeTo(null);
		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		exitButton.setContentAreaFilled(false);

		menuBarPanel.setBackground(new Color(255, 0, 0));
		menuBarPanel.setBounds(0, 0, 1264, 54);
		contentPane.add(menuBarPanel);
		menuBarPanel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		menuBarPanel.add(lblNewLabel);
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(931, 0, 98, 54);
		menuBarPanel.add(profileButton);
		//settingsButton.setEnabled(false);
		/*
		settingsButton.setContentAreaFilled(false);
		
		Image img3=new ImageIcon(this.getClass().getResource("049-edit (1).png")).getImage();
		settingsButton.setIcon(new ImageIcon(img3));
		settingsButton.setContentAreaFilled(false);

		Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		exitButton.setIcon(new ImageIcon(img5));
		exitButton.setContentAreaFilled(false);

		//Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		//exitButton.setIcon(new ImageIcon(img5));
		exitButton.setContentAreaFilled(false);

		Image img6=new ImageIcon(this.getClass().getResource("/settings-24.png")).getImage();
		settingsButton.setIcon(new ImageIcon(img6));
		settingsButton.setContentAreaFilled(false);

		//Image img6=new ImageIcon(this.getClass().getResource("/settings-24.png")).getImage();
		//settingsButton.setIcon(new ImageIcon(img6));
		settingsButton.setContentAreaFilled(false);

		
		//Image img4=new ImageIcon(this.getClass().getResource("/040-user.png")).getImage();
		//profileButton.setIcon(new ImageIcon(img4));
		profileButton.setContentAreaFilled(false);

		*/
		
		profileButton.setContentAreaFilled(false);
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		
		
		exitButton.setBounds(1010, 7, 98, 53);
		menuBarPanel.add(exitButton);
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));
		
		homeButton.setContentAreaFilled(false);
		homeButton.setBounds(348, -13, 71, 67);
		menuBarPanel.add(homeButton);
		backButton.setForeground(Color.WHITE);
		backButton.setFont(new Font("Cambria Math", Font.PLAIN, 40));
		backButton.setContentAreaFilled(false);
		backButton.setBackground(new Color(204, 0, 0));
		backButton.setBounds(98, 0, 85, 54);
		
		menuBarPanel.add(backButton);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 55, 1264, 686);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 1264, 148);
		titlePanel.setBackground(new Color(47, 79, 79));
		mainPanel.add(titlePanel);
		titlePanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(10, 11, 126, 126);
		titlePanel.add(lblNewLabel_1);
		
		nameLbl.setForeground(new Color(255, 255, 255));
		nameLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 23));
		nameLbl.setBounds(146, 11, 259, 26);
		titlePanel.add(nameLbl);
		
		sportLbl.setForeground(Color.WHITE);
		sportLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		sportLbl.setBounds(146, 47, 61, 14);
		titlePanel.add(sportLbl);
		
		JButton bookButton = new JButton("Book");
		bookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bookButton.setForeground(Color.BLACK);
		bookButton.setBackground(Color.GRAY);
		bookButton.setBounds(1061, 47, 157, 65);
		titlePanel.add(bookButton);
		
		JLabel organizationLbl = new JLabel("Organization");
		organizationLbl.setForeground(Color.WHITE);
		organizationLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		organizationLbl.setBounds(146, 71, 145, 25);
		titlePanel.add(organizationLbl);
		
		descriptionTextArea.setBackground(new Color(230, 230, 250));
		descriptionTextArea.setBounds(61, 197, 758, 128);
		mainPanel.add(descriptionTextArea);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(new Color(0, 0, 0));
		lblDescription.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblDescription.setBounds(61, 172, 113, 14);
		mainPanel.add(lblDescription);
		
		JLabel priceLbl2 = new JLabel("Lesson Price");
		priceLbl2.setForeground(Color.BLACK);
		priceLbl2.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		priceLbl2.setBounds(61, 356, 113, 14);
		mainPanel.add(priceLbl2);
		
		JLabel lblMonthlyPrice = new JLabel("Type");
		lblMonthlyPrice.setForeground(Color.BLACK);
		lblMonthlyPrice.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblMonthlyPrice.setBounds(61, 410, 113, 14);
		mainPanel.add(lblMonthlyPrice);
		
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
}
	
