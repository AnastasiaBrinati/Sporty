package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.eventBean;
import logic.view.desktop.EventUIOrg;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;

public class EventOrgControllerG {
	
	private static EventUIOrg view;
	private static EventOrgControllerG instance=null;
	//bean 
	
	private EventOrgControllerG(EventUIOrg view) {
		EventOrgControllerG.view = view;
	}
	
	public static synchronized EventOrgControllerG getInstance(EventUIOrg view, String courseName, String orgName) throws Exception {
		if(instance==null) {
			instance = new EventOrgControllerG(view);
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
		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerGOrg.getInstance(homeview);
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);
			}

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		
	}

	private static void setCourseCredentials(String courseName,String organizationName) throws Exception {
		EventBean eventBean = new EventBean();
		EventBean.setEvent(eventBean, courseName, organizationName);
		view.setCredentials(eventBean.getName(),eventBean.getOrganization(),eventBean.getLessonPrice(),eventBean.getMonthlyPrice(),
				eventBean.getDescription(),eventBean.getInstructorName(),eventBean.getSport());
	}
}
