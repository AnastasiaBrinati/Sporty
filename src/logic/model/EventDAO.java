package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EventDAO {
	
	
	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    
    
    
	
    public static void addEvent(Event newEvent) throws Exception {
        // STEP 1: dichiarazioni
        Statement stmt = null;
        Connection conn = null;
        
        try {
            // STEP 2: loading dinamico del driver mysql
            

            // STEP 3: apertura connessione
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            // STEP 4.2: creazione ed esecuzione della query
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            int result = Queries.addEvent(stmt, newEvent);
            
            // STEP 5.1: Clean-up dell'ambiente
            
 
        } finally {
            // STEP 5.2: Clean-up dell'ambiente        	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
    }
    
    public void deleteEvent(String eventName, String orgName) throws SQLException {
		Statement stmt = null;
        Connection conn = null;
        try {
        	 conn = DriverManager.getConnection(DB_URL, USER, PASS);
        	 stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);
             Queries.deleteEvent(stmt,eventName,orgName);
        	
        	
        }finally {
            // STEP 5.2: Clean-up dell'ambiente        	
            if (stmt != null)
                stmt.close();
            if (conn != null)
                conn.close();
    }
		
	}

    
    public Event getEvent(String eventName,String organizationName) throws Exception {
        // STEP 1: dichiarazioni
        Statement stmt = null;
        Connection conn = null;
        
        try {
            // STEP 2: loading dinamico del driver mysql
            

            // STEP 3: apertura connessione
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            // STEP 4.2: creazione ed esecuzione della query
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = Queries.getUserEvent(stmt, eventName,organizationName);
            if (!rs.first()){				
				Exception e = new Exception("No course Found matching with username: "  + organizationName);
            	throw e;
		    }
		
            rs.first();
            Event event = new Event();
            event.setName(rs.getString("name"));
            event.setDate(rs.getString("date"));
            event.setPrice(rs.getString("price"));
            event.setDescription(rs.getString("description"));
            event.setSport(rs.getString("sport"));
            event.setAvailability(rs.getString("availability"));
            event.setOrganization(rs.getString("organization"));
        	rs.close();
        	return event;
        	
        	
        	
        	
        	
        	
            
            
            // STEP 5.1: Clean-up dell'ambiente
            
        } finally {
            // STEP 5.2: Clean-up dell'ambiente        	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
    }

	public ArrayList<Event> retreiveBySport(String sport) throws SQLException {
		
		
	

	Statement stmt = null;
	        Connection conn = null;
	        ArrayList<Event> foundEvents = new ArrayList<Event>();
	        
	        try {
	            
	            try {
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
	            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	            
	            ResultSet rs = Queries.selectEventBySport(stmt,sport);
	
	            if (!rs.first()){ // rs empty
	            	Exception e = new Exception("No results were found");
	            	throw e;
	            }
	            
	            rs.first();
	            do{
	              
	            	String name=rs.getString("name");
	            	String organization=rs.getString("organization");
	            	String price=rs.getString("price");
	            	String availability=rs.getString("availability");
	            	String description = rs.getString("description");
	            	String date=rs.getString("date");
	            	Event foundEvent=new Event();
	            	foundEvent.setName(name);
	            	foundEvent.setOrganization(organization);
	            	foundEvent.setPrice(price);
	            	foundEvent.setDate(date);
	            	
	                foundEvent.setAvailability(availability);
	                foundEvent.setDescription(description);
	                System.out.println("this is the list of events found: "+foundEvent.getName());
	                foundEvents.add(foundEvent);
	
	            }while(rs.next());
	            
	           
	            rs.close();
	        } catch (Exception e1) {
				
				e1.printStackTrace();
			} finally {
	            
	            try {
	                if (stmt != null)
	                    stmt.close();
	            } catch (SQLException se2) {
	            }
	            try {
	                if (conn != null)
	                    conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	
	        return foundEvents;
    
}}