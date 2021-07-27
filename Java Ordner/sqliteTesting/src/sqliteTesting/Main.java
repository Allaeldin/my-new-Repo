package sqliteTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	
	public static final String DB_NAME = " Kontakt.db";
	public static final String CONNECTION = "jdbc:sqlite:‪P:\\Java Ordner"+DB_NAME;
    public static final String TABLE_KONTAKT ="kontakte";
    public static final String COLUMN_NAME ="name";
    public static final String COLUMN_EMAIL ="email";
    public static final String COLUMN_PHONE ="phone";
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = CONNECTION;
		
		 try {
			 
			Class.forName("org.sqlite.JDBC");
			
		
				Connection connection = DriverManager.getConnection(url);
				
				Statement statement = connection.createStatement();
//				statement.execute("CREATE TABLE "+TABLE_KONTAKT+"("+COLUMN_NAME+"TEXT)");
				
				
				
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		

	}

}
