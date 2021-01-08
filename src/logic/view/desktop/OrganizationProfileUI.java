package logic.view.desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Checkbox;
import javax.swing.UIManager;
import java.awt.FlowLayout;

public class OrganizationProfileUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel headerPanel = new JPanel();
	private JButton homeButton = new JButton("");
	private final JButton exitButton = new JButton("");
	private final JPanel panel = new JPanel();
	private JPanel coursesPanel = new JPanel();
	
	private JButton backButton = new JButton("<-");
	private JButton coursesButton = new JButton("Courses");
	private JButton eventsButton = new JButton("Events");
	private JButton courtsButton = new JButton("Courts");
	private JButton settingsButton = new JButton("sett");
	private static JTextArea descriptionTextArea = new JTextArea();
	private final JPanel descriptionPanel = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("Description");
	private final JTextField descriptionTextfield = new JTextField();
	private final JPanel courtsPanel = new JPanel();
	private final JPanel eventsPanel = new JPanel();
	private JTextField textField;
	private static JTextField titleTextField;
	private JLabel organizationNameLbl = new JLabel("Organization Name");
	
	private JPanel newCoursePanel = new JPanel();
	private final JButton saveButton = new JButton("SAVE");
	private JButton cancelButton = new JButton("cancel");
	private static Checkbox utilitiesCheckbox = new Checkbox("equipment required");
	private final JLabel priceForLessonlbl = new JLabel("price for 1 lesson:");
	private final JLabel monthlyPricelbl = new JLabel("monthly price:");
	private final static JTextField priceForLessonTextField = new JTextField();
	private final static JTextField monthlyPriceTextField = new JTextField();
	private static JTextField sportTextField;
	private static JTextField instructorNameTextField;
	private static JTextField availabilityTextField;
	private JPanel upperPanel = new JPanel();
	private JButton addButton = new JButton("+");
	private JPanel lowerPanel = new JPanel();
	private final JLabel eventsTitlelbl = new JLabel("Events");
	private final JLabel lblCourts = new JLabel("Courts");
	private final JLabel courseslbl = new JLabel("Courses");

	public OrganizationProfileUI() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1254, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//courses
		coursesPanel.setBounds(268, 145, 972, 568);
		coursesPanel.setLayout(null);
		upperPanel.setBounds(0, 0, 972, 134);
		coursesPanel.add(upperPanel);
		upperPanel.setLayout(null);
		addButton.setBackground(Color.PINK);
		addButton.setBounds(10, 48, 98, 48);
		upperPanel.add(addButton);
		courseslbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
		courseslbl.setBounds(10, 25, 96, 13);
		
		upperPanel.add(courseslbl);
		
		lowerPanel.setBounds(0, 136, 972, 432);
		coursesPanel.add(lowerPanel);
		lowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(coursesPanel);
		
		
		newCoursePanel.setBackground(new Color(211, 211, 211));
		newCoursePanel.setBounds(0, 0, 972, 568);
		coursesPanel.add(newCoursePanel);
		newCoursePanel.setLayout(null);		
		cancelButton.setBounds(52, 498, 162, 40);
		newCoursePanel.add(cancelButton);		
		saveButton.setBackground(new Color(255, 99, 71));
		saveButton.setBounds(247, 498, 162, 40);
		newCoursePanel.add(saveButton);
		
		
		JLabel titleLable = new JLabel("Insert Title:");
		titleLable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleLable.setBounds(10, 23, 114, 23);
		newCoursePanel.add(titleLable);
		
		titleTextField = new JTextField();
		titleTextField.setBounds(143, 23, 266, 24);
		newCoursePanel.add(titleTextField);
		titleTextField.setColumns(10);
		
		JLabel descriptionlbl = new JLabel("Description:");
		descriptionlbl.setFont(new Font("Arial", Font.PLAIN, 20));
		descriptionlbl.setBounds(10, 74, 114, 23);
		newCoursePanel.add(descriptionlbl);
		
		JLabel imgLabel = new JLabel("Insert Image:");
		imgLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		imgLabel.setBounds(573, 23, 140, 23);
		newCoursePanel.add(imgLabel);
		
		//JTextArea descriptionTextArea = new JTextArea();
		descriptionTextArea.setBounds(143, 76, 266, 112);
		newCoursePanel.add(descriptionTextArea);
		
		utilitiesCheckbox.setFont(new Font("Arial", Font.PLAIN, 20));
		utilitiesCheckbox.setBounds(10, 188, 250, 47);
		newCoursePanel.add(utilitiesCheckbox);
		priceForLessonlbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		priceForLessonlbl.setBounds(10, 277, 170, 23);
		
		newCoursePanel.add(priceForLessonlbl);
		monthlyPricelbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		monthlyPricelbl.setBounds(10, 310, 162, 23);
		
		newCoursePanel.add(monthlyPricelbl);
		priceForLessonTextField.setColumns(10);
		priceForLessonTextField.setBounds(190, 277, 219, 23);
		
		newCoursePanel.add(priceForLessonTextField);
		monthlyPriceTextField.setColumns(10);
		monthlyPriceTextField.setBounds(190, 313, 219, 23);
		
		newCoursePanel.add(monthlyPriceTextField);
		
		JLabel lblNewLabel_5 = new JLabel("Sport:");
		lblNewLabel_5.setBounds(10, 350, 46, 14);
		newCoursePanel.add(lblNewLabel_5);
		
		sportTextField = new JTextField();
		sportTextField.setColumns(10);
		sportTextField.setBounds(190, 347, 219, 23);
		newCoursePanel.add(sportTextField);
		
		instructorNameTextField = new JTextField();
		instructorNameTextField.setColumns(10);
		instructorNameTextField.setBounds(190, 381, 219, 23);
		newCoursePanel.add(instructorNameTextField);
		
		availabilityTextField = new JTextField();
		availabilityTextField.setColumns(10);
		availabilityTextField.setBounds(190, 415, 219, 23);
		newCoursePanel.add(availabilityTextField);
		
		JLabel instructorNameLbl = new JLabel("Instructor Name:");
		instructorNameLbl.setBounds(10, 385, 170, 14);
		newCoursePanel.add(instructorNameLbl);
		
		JLabel availabilityLbl = new JLabel("Availability:");
		availabilityLbl.setBounds(10, 419, 114, 14);
		newCoursePanel.add(availabilityLbl);
		
		//courts
		courtsPanel.setBounds(268, 145, 972, 568);
		contentPane.add(courtsPanel);
		courtsPanel.setLayout(null);
		lblCourts.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblCourts.setBounds(10, 29, 96, 13);
		
		courtsPanel.add(lblCourts);
		
		//events
		eventsPanel.setBounds(268, 145, 972, 568);
		contentPane.add(eventsPanel);
		eventsPanel.setLayout(null);
		eventsTitlelbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
		eventsTitlelbl.setBounds(10, 30, 96, 13);
		
		eventsPanel.add(eventsTitlelbl);
		
		descriptionTextfield.setBackground(new Color(220, 220, 220));
		descriptionTextfield.setBounds(10, 66, 798, 119);
		descriptionTextfield.setColumns(10);
		descriptionPanel.setBounds(268, 145, 972, 568);
		
		contentPane.add(descriptionPanel);
		descriptionPanel.setLayout(null);
		lblNewLabel_1.setBounds(10, 41, 86, 14);
		
		descriptionPanel.add(lblNewLabel_1);				
		descriptionPanel.add(descriptionTextfield);
	
		exitButton.setBounds(1181, 0, 55, 54);
		exitButton.setIcon(null);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);
	    
		exitButton.setIcon(new ImageIcon(""));
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);
		
		headerPanel.setBounds(0, 0, 1400, 54);
		headerPanel.setBackground(new Color(255, 0, 0));
		headerPanel.setForeground(new Color(255, 165, 0));
		homeButton.setBounds(314, 0, 45, 42);
		homeButton.setIcon(new ImageIcon(""));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);
		headerPanel.setLayout(null);
		headerPanel.add(homeButton);
		headerPanel.add(exitButton);
		headerPanel.add(exitButton);
		contentPane.add(headerPanel);
		
		textField = new JTextField();
		textField.setBounds(369, 12, 364, 30);
		headerPanel.add(textField);
		textField.setColumns(10);
		
		settingsButton.setBackground(UIManager.getColor("Button.background"));
		settingsButton.setForeground(new Color(0, 0, 0));
		settingsButton.setBounds(10, 0, 55, 54);
		headerPanel.add(settingsButton);
		panel.setBounds(0, 53, 269, 660);
		panel.setBackground(new Color(255, 0, 0));
		
		contentPane.add(panel);
		panel.setLayout(null);
										
		JLabel lblNewLabel = new JLabel("Sportee");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(0, 11, 269, 71);
		panel.add(lblNewLabel);
		coursesButton.setForeground(new Color(245, 255, 250));
		
		coursesButton.setBackground(new Color(139, 0, 0));
		coursesButton.setBounds(0, 153, 269, 59);
		panel.add(coursesButton);
		eventsButton.setForeground(new Color(245, 255, 250));
		
		eventsButton.setBackground(new Color(255, 0, 0));
		eventsButton.setBounds(0, 211, 269, 59);
		panel.add(eventsButton);
		courtsButton.setForeground(new Color(245, 255, 250));
										
		courtsButton.setBackground(new Color(255, 0, 0));
		courtsButton.setBounds(0, 267, 269, 59);
		panel.add(courtsButton);
		
		backButton.setFont(new Font("Arial Black", Font.BOLD, 10));
		backButton.setBackground(Color.RED);
		backButton.setBounds(10, 103, 69, 37);
		panel.add(backButton);
		
		//profile header
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(268, 53, 972, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
										
		JLabel orgLocationLbl = new JLabel("Location");
		orgLocationLbl.setBounds(104, 62, 73, 14);
		panel_1.add(orgLocationLbl);
									
		organizationNameLbl.setBounds(104, 26, 179, 25);
		organizationNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(organizationNameLbl);
										
		JLabel organizationImageLbl = new JLabel("");
		organizationImageLbl.setHorizontalAlignment(SwingConstants.CENTER);
		organizationImageLbl.setIcon(new ImageIcon(""));
		organizationImageLbl.setBounds(10, 11, 73, 71);
		panel_1.add(organizationImageLbl);
		
		//Image img3=new ImageIcon(this.getClass().getResource("/046-hierarchy.png")).getImage();
		//coursesButton.setIcon(new ImageIcon(img3));
		//coursesButton.setContentAreaFilled(true);
		
		//Image img4=new ImageIcon(this.getClass().getResource("/034-flag.png")).getImage();
		//eventsButton.setIcon(new ImageIcon(img4));
		//eventsButton.setContentAreaFilled(true);
		
		//Image img5=new ImageIcon(this.getClass().getResource("/015-idea.png")).getImage();
		//courtsButton.setIcon(new ImageIcon(img5));
		//courtsButton.setContentAreaFilled(true);
		
		//Image img6=new ImageIcon(this.getClass().getResource("/002-settings.png")).getImage();
		//settingsButton.setIcon(new ImageIcon(img6));
		//settingsButton.setContentAreaFilled(false);
		
		//Image img7=new ImageIcon(this.getClass().getResource("/016-trash bin.png")).getImage();
		//exitButton.setIcon(new ImageIcon(img7));
		//exitButton.setContentAreaFilled(false);
		
	}


	
	public void createCourseFrame(String name) {

        JButton frame = new JButton(name);
        //System.out.println("nuovo bottone:"+name);
        frame.setBorder(new LineBorder(Color.BLACK));
        frame.setPreferredSize(new Dimension(100, 100));
        frame.setVisible(true);
        lowerPanel.add(frame);
        lowerPanel.setVisible(true);
        lowerPanel.revalidate();
        lowerPanel.repaint();
        coursesPanel.repaint();
        
    }
	
	public void setDescriptionPanelVisible() {
		backButton.setVisible(false);
		descriptionPanel.setVisible(true);
		coursesPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
		newCoursePanel.setVisible(false);
	}

	public void setCoursesPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(true);
		upperPanel.setVisible(true);
		lowerPanel.setVisible(true);
		newCoursePanel.setVisible(false);
		
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
		
		coursesButton.setBackground(new Color(139, 0, 0));
		eventsButton.setBackground(Color.RED);
		courtsButton.setBackground(Color.RED);	
	}
	
	public void setEventsPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(true);
		newCoursePanel.setVisible(false);
		
		coursesButton.setBackground(Color.RED);
		eventsButton.setBackground(new Color(139, 0, 0));
		courtsButton.setBackground(Color.RED);
	}
	
	public void setCourtsPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(true);
		eventsPanel.setVisible(false);
		newCoursePanel.setVisible(false);
		
		coursesButton.setBackground(Color.RED);
		eventsButton.setBackground(Color.RED);
		courtsButton.setBackground(new Color(139, 0, 0));
	}
	

	public void showNewCoursePanel() {
		
		resetForm();
		
		backButton.setVisible(true);
		coursesPanel.setVisible(true);
		upperPanel.setVisible(false);
		lowerPanel.setVisible(false);
		newCoursePanel.setVisible(true);
		
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
		descriptionPanel.setVisible(false);
	}
	
	private static void resetForm() {
		titleTextField.setText("");
		descriptionTextArea.setText("");
		utilitiesCheckbox.setState(false);
		priceForLessonTextField.setText("");
		monthlyPriceTextField.setText("");
		sportTextField.setText("");
		instructorNameTextField.setText("");
		availabilityTextField.setText("");
		
	}
	
	public void setCredentials(String name) {
		organizationNameLbl.setText(name);
		//set img
	}
	
	public JButton getProfileButton() {
			return exitButton;
		}
	public JButton getCoursesButton() {
		return coursesButton;
	}
	public JButton getCourtsButton() {
		return courtsButton;
	}
	public JButton getEventsButton() {
		return eventsButton;
	}
	public JButton getHomeButton() {
		return homeButton;
	}
	public JButton getAddButton() {
		return addButton;
	}
	public JButton getSaveButton() {
		return saveButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	
	public JButton getSettingButton() {
		return settingsButton;
	}
	
	public JButton getBackButton() {
		return backButton;
	}


		public String getName() {
			return titleTextField.getText();
		}
		public String getMonthlyPrice() {
			return monthlyPriceTextField.getText();
		}
		public String getPriceForLesson() {
			return priceForLessonTextField.getText();
		}
		public String getDescription() {
			return descriptionTextArea.getText();
		}
		public String getSport() {
			return sportTextField.getText();
		}
		public String getInstructorName() {
			return instructorNameTextField.getText();
		}
}