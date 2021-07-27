import java.sql.*;


public class Main {

	public static final String DB_NAME = "Kontakt.db	";
	public static final String CONNECTION = "jdbc:sqlite:‪‪‪‪P:\\Java Ordner\\SQLite\\src" + DB_NAME;
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
				String sql = "CREATE TABLE Tabelle (Vorname TEXT, Datum TEXT)";
				statement.executeUpdate(sql);

				
				
//				 statement.execute("CREATE TABLE "+TABLE_KONTAKT+"("+COLUMN_NAME+"TEXT)") ; 
//				 statement.execute("CREATE TABLE "+TABLE_KONTAKT+"("+COLUMN_NAME+"TEXT)") ; 
				
			
				
				
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO: handle exception
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
		
		
		
	}

}
