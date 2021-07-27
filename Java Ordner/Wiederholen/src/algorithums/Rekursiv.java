package algorithums;

public class Rekursiv {
	public static void main(String...args) {
		
	
		System.out.println(Rekursiv.fakulitaet(5));
		
	}
	
	
	public static int fakulitaet(int n) {
		
		
		    if (n==1) {
				return n;
			}else {
				return n*fakulitaet(n-1);
			}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
