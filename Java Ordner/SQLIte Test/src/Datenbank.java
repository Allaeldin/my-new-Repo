import java.sql.*;

public class Datenbank {
	
	
	public static final String DB_NAME = "Kontakt.com";
	public static final String CONNECTION = "jdbc:sqlite:‪‪P:\\Java Ordner\\SQLIte Test\\src" + DB_NAME;
    public static final String TABLE_KONTAKT ="kontakte";
    public static final String COLUMN_NAME ="name";
    public static final String COLUMN_EMAIL ="email";
    public static final String COLUMN_PHONE ="phone";
	
	
	public static void main(String[] args) {
		
		
		
		String url = CONNECTION;
		
		

	    try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			
			
			 ResultSet resultSet = statement  
	                 .executeQuery("SELECT EMPNAME FROM EMPLOYEEDETAILS");  
	         while (resultSet.next()) 
	         {  
	             System.out.println("EMPLOYEE NAME:"  
	                     + resultSet.getString("EMPNAME"));  
	         }  
			
			
			
			
			resultSet.close();
			statement.close();
			connection.close();
			
			
			
			
			
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
