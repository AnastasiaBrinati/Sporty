package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import logic.model.Course;



public class CourseDAO {
	
	
	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    
    //MANCA LA REFLECTION
    
	
    public static void addCourse(Course course) throws Exception {
       
        Statement stmt = null;
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            int rs = Queries.addCourse(stmt, course);
            
            
           
            stmt.close();

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            int result = Queries.addCourse(stmt, course);
            
          
            
        } finally {
            	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
    }
}