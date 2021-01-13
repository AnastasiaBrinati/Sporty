package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.CourtBean;
import logic.view.desktop.CourtUIOrg;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;

public class CourtOrgControllerG {
	
	private static CourtUIOrg view;
	private static CourtOrgControllerG instance=null;
	
	private CourtOrgControllerG(CourtUIOrg view) {
		CourtOrgControllerG.view = view;
	}
	
	public static synchronized CourtOrgControllerG getInstance(CourtUIOrg view, String courtName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourtOrgControllerG(view);
			instance.assegnaGestori();
		}
		
		showCourseUI();
		setCourtCredentials(courtName, orgName);
		return instance;
	}
	
	private static void showCourseUI() {
		view.setVisible(true);
	}
	
	public void assegnaGestori() {
		
		ActionListener gestoreHome = e -> {
			
				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerGOrg.getInstance(homeview);

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		ActionListener gestoreExit = e -> {

				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		
	}

	private static void setCourtCredentials(String courtName,String organizationName) throws Exception {
		CourtBean courtBean = new CourtBean();
		CourtBean.setCourt(courtBean, courtName, organizationName);
		view.setCredentials(courtBean.getName(), courtBean.getPrice(),courtBean.getSport(),courtBean.getAvailability(),courtBean.getDescription(),courtBean.getType());
	}
}