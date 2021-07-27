
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Main.ausgabe(10);
		
		
		
	}
	
	
	public static void ausgabe(int n ) {
		
		if (n >=10) {
			return;
		}
		
		System.out.println("Hallo ");
		
		ausgabe(n+1);
	}
	

}