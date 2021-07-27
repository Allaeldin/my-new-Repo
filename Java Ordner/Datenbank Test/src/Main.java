
import java.sql.*;





public class Main {
	
	public static final String DB_NAME = "Kontakt.db";
	public static final String CONNECTION = "jdbc:sqlite:‪‪‪‪P:\\Java Ordner\\Datenbank Test\\src\\" + DB_NAME;
    public static final String TABLE_KONTAKT ="kontakte";
    public static final String COLUMN_NAME ="name";
    public static final String COLUMN_EMAIL ="email";
    public static final String COLUMN_PHONE ="phone";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	
		
		
	String url = CONNECTION;
		
		try {
			
			 Class.forName("org.sqlite.JDBC");  

			Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			
			
			
//			 statement.execute("CREATE TABLE "+TABLE_KONTAKT+"("+COLUMN_NAME+"TEXT)") ; 
     		 statement.execute("CREATE TABLE "+TABLE_KONTAKT+"("+COLUMN_NAME+" TEXT)") ; 
			
			
			
			
			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		
		
		
	}
	
	
	public static void  createContact() {
		
	
		
	}
	
	
	
	public static void  readContact() {
		
	}
	
	public static void updateContact() {
		
	}
	
	public static void  deleteContact() {
		
	}
}
