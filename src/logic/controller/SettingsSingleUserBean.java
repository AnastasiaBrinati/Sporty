package logic.controller;

import java.sql.SQLException;

public class SettingsSingleUserBean {

	private String name;
	private String surname;
	private String username;
	
	private String email;
	private static String oldPassword;
	private static String newPassword;
	
	public SettingsSingleUserBean() {
	}
	
	//just for single user
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	//for both users
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPassword(String psswd) {
		oldPassword = psswd;
	}
	public String getPassword() {
		return oldPassword;
	}
	
	public void setNewPassword(String newPasswd) {
		newPassword = newPasswd;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	
	
	public static void changeUCredentialsName(SettingsSingleUserBean settingBean) throws SQLException {
		CustomizationController customizer=new CustomizationController();
		customizer.changeCredentialsName(settingBean);
	}
	
	public static void changeUCredentialsEmail(SettingsSingleUserBean settingBean) throws SQLException {
		CustomizationController customizer=new CustomizationController();
		customizer.changeCredentialsEmail(settingBean);
	}
	
	public static void changeUCredentialsPassword(SettingsSingleUserBean settingBean) throws SQLException {
		CustomizationController customizer=new CustomizationController();
		customizer.changeCredentialsPassword(settingBean);
	}
	
}
