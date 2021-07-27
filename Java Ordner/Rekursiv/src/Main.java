
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Main.ausgabe(10);
		
		
		
	}
	
	
	public static void ausgabe(int n ) {
		
		if (n >=1) {
			
			ausgabe(n-1);
			
			System.out.println("Hallo ");
			
		
		}
		
	}
	

}
