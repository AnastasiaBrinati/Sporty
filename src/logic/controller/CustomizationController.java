package logic.controller;

import logic.model.OrganizationProfile;

public class CustomizationController {
	
	//for organization
	public void changeNameLocation(SettingsBean settingBean) throws Exception {
		
		if(!OrganizationProfile.changeUsername(settingBean.getName())) {
			//va male
		}
		
	}
	
	public void changeEmailPassword(SettingsBean settingBean) throws Exception {
		
		if(!OrganizationProfile.changeEmail(settingBean.getEmail())) {
			//va male
		}
	}
	
	//for single user
	public void changeCredentials(SettingsBean settingBean) {
		
		
	}

}
