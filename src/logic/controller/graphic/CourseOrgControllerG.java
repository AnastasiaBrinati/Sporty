package logic.controller.graphic;

import java.awt.event.ActionListener;
import java.sql.SQLException;

import logic.controller.DeleteCourseController;
import logic.model.CourseBean;
import logic.view.desktop.CourseUIOrg;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.UserProfileUI;

public class CourseOrgControllerG {
	
	private static CourseUIOrg view;
	private static CourseOrgControllerG instance=null;
	//bean 
	
	private CourseOrgControllerG(CourseUIOrg view) {
		CourseOrgControllerG.view = view;
	}
	
	public static synchronized CourseOrgControllerG getInstance(CourseUIOrg view, String courseName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourseOrgControllerG(view);
			instance.assegnaGestori();
		}
		
		showCourseUI();
		setCourseCredentials(courseName, orgName);
		return instance;
	}
	
	private static void showCourseUI() {
		view.setVisible(true);
	}
	
	public void assegnaGestori() {
		
		
		
		
		
		
		
		//gestore per tornare indietro dal corso alla sezione corsi della organizzazione
		ActionListener gestoreBack = e -> {

				view.setVisible(false);
				OrganizationProfileUI profileView = new OrganizationProfileUI();
				OrganizationControllerG.getInstance(profileView);


		};
		view.getBackButton().addActionListener(gestoreBack);
		
		
		
		ActionListener gestoreExit = e -> {

			LoginUI loginUI=new LoginUI();
			loginUI.resetForm();
			view.setVisible(false);
			LoginControllerG.getInstance(loginUI);
			
		};
		view.getExitButton().addActionListener(gestoreExit);
		
		
		ActionListener gestoreDeleteCourse = e -> {


				DeleteCourseController controller=DeleteCourseController.getInstance();
				view.setVisible(false);
				
				try {
					controller.deleteCourse(view.getCourseName());
					OrganizationProfileUI orgUI = new OrganizationProfileUI();
					orgUI.setLocationRelativeTo(null);
					OrganizationControllerG orgControllerG =OrganizationControllerG.getInstance(orgUI);
					orgControllerG.deleteThisButton(view.getCourseName());
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}		

		};
		view.getDeleteButton().addActionListener(gestoreDeleteCourse);
		
		
	}

	
	private static void setCourseCredentials(String courseName,String organizationName) throws Exception {
		CourseBean courseBean = new CourseBean();
		courseBean.setCourse(courseBean, courseName, organizationName);
		view.setCredentials(courseBean.getName(),courseBean.getOrganization(),courseBean.getLessonPrice(),courseBean.getMonthlyPrice(),
				courseBean.getDescription(),courseBean.getInstructorName(),courseBean.getSport());
	}
}