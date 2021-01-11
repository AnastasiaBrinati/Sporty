package logic.controller;

import java.sql.SQLException;

import logic.model.CourseDAO;
import logic.model.DeleteItemBean;

public class DeleteCourseController {
	
	private static DeleteCourseController instance=null;
	
	public DeleteCourseController getInstance() {
		if(instance==null) {
			instance=new DeleteCourseController();
		}
		return instance;
	}
	
	public void deleteCourse(DeleteItemBean deleteBean) throws SQLException {
		
		CourseDAO courseDAO=new CourseDAO();
		courseDAO.deleteCourse(deleteBean.getItemName(),deleteBean.getOrganizationName());
		
	}

}