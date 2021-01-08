package logic.view.desktop;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JMenuBar;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class CourseUISUs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton profileButton = new JButton("");
	private JButton settingsButton = new JButton("");
	private JButton exitButton = new JButton("");


	public CourseUISUs() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1088, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		panel.add(lblNewLabel);
		
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(980, 0, 49, 49);
		panel.add(profileButton);
		settingsButton.setBounds(10, 5, 40, 43);
		panel.add(settingsButton);
		//settingsButton.setEnabled(false);
		
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

		
		
		profileButton.setContentAreaFilled(false);
		
		
		exitButton.setBounds(1039, 0, 49, 49);
		panel.add(exitButton);
		
		JButton homeButton = new JButton("");
		homeButton.setContentAreaFilled(false);
		homeButton.setBounds(336, 10, 40, 43);
		panel.add(homeButton);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 55, 1088, 588);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1088, 148);
		panel_1.setBackground(new Color(47, 79, 79));
		mainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(10, 11, 126, 126);
		panel_1.add(lblNewLabel_1);
		
		JLabel nameLbl = new JLabel("Name");
		nameLbl.setForeground(new Color(255, 255, 255));
		nameLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 23));
		nameLbl.setBounds(146, 22, 61, 14);
		panel_1.add(nameLbl);
		
		JLabel sportLbl = new JLabel("Sport");
		sportLbl.setForeground(Color.WHITE);
		sportLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		sportLbl.setBounds(146, 47, 61, 14);
		panel_1.add(sportLbl);
		
		JButton joinButton = new JButton("Join");
		joinButton.setForeground(new Color(255, 255, 255));
		joinButton.setBackground(new Color(105, 105, 105));
		joinButton.setBounds(900, 44, 157, 65);
		panel_1.add(joinButton);
		
		JLabel organizationLbl = new JLabel("Organization");
		organizationLbl.setForeground(Color.WHITE);
		organizationLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		organizationLbl.setBounds(146, 72, 145, 14);
		panel_1.add(organizationLbl);
		
		JTextArea descriptionTextArea = new JTextArea();
		descriptionTextArea.setBackground(new Color(230, 230, 250));
		descriptionTextArea.setBounds(61, 197, 758, 128);
		mainPanel.add(descriptionTextArea);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(new Color(0, 0, 0));
		lblDescription.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblDescription.setBounds(61, 172, 113, 14);
		mainPanel.add(lblDescription);
		
		JLabel lblLessonPrice = new JLabel("Lesson Price");
		lblLessonPrice.setForeground(Color.BLACK);
		lblLessonPrice.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblLessonPrice.setBounds(61, 356, 113, 14);
		mainPanel.add(lblLessonPrice);
		
		JLabel lblMonthlyPrice = new JLabel("Monthly Price");
		lblMonthlyPrice.setForeground(Color.BLACK);
		lblMonthlyPrice.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblMonthlyPrice.setBounds(61, 410, 113, 14);
		mainPanel.add(lblMonthlyPrice);
		
		JLabel lessonPriceLbl = new JLabel("$20.00");
		lessonPriceLbl.setForeground(new Color(0, 0, 0));
		lessonPriceLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		lessonPriceLbl.setBounds(71, 381, 61, 14);
		mainPanel.add(lessonPriceLbl);
		
		JLabel monthlyPriceLbl = new JLabel("$50.00");
		monthlyPriceLbl.setForeground(Color.BLACK);
		monthlyPriceLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		monthlyPriceLbl.setBounds(71, 435, 61, 14);
		mainPanel.add(monthlyPriceLbl);
		
		JLabel lblInstructor = new JLabel("Instructor");
		lblInstructor.setForeground(Color.BLACK);
		lblInstructor.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblInstructor.setBounds(61, 460, 113, 14);
		mainPanel.add(lblInstructor);
		
		JLabel instructorNameLbl = new JLabel("John");
		instructorNameLbl.setForeground(Color.BLACK);
		instructorNameLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		instructorNameLbl.setBounds(71, 485, 61, 14);
		mainPanel.add(instructorNameLbl);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setForeground(Color.BLACK);
		lblAvailability.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblAvailability.setBounds(61, 510, 113, 14);
		mainPanel.add(lblAvailability);
		
		JLabel availabilityLbl = new JLabel("7");
		availabilityLbl.setForeground(Color.BLACK);
		availabilityLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		availabilityLbl.setBounds(71, 535, 61, 14);
		mainPanel.add(availabilityLbl);
		LineBorder lineBorder=new LineBorder(Color.white,8,true);
	}

	public JButton getProfileButton() {
		return profileButton;
	}
	public JButton getSettingsButton() {
		return settingsButton;
	}
	public JButton getExitButton() {
		return exitButton;
	}
}
	