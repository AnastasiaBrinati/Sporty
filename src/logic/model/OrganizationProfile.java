package logic.model;

import java.util.ArrayList;

public class OrganizationProfile {
	
	private static  String name;
	private static String email;
	private static String password;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<SportEvent> events=new ArrayList<SportEvent>();
	
	
	public OrganizationProfile() {
		//String name, String username
		//se credenziali ok
		//inizializzo l'array di corsi dal db		
		//esempio
	}
	
	public static void addCourse(Course course) {
		courses.add(course);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		name = name;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		email = email;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		password = password;
	}

	public static ArrayList<SportEvent> getEvents() {
		return events;
	}
	
}