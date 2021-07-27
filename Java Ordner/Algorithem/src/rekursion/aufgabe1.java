package rekursion;

public class aufgabe1 {
	public static void main(String...args) {
		
		
		
		System.out.println(aufgabe1.fakultaet(5));
		
		
		
		
	}
	
	
	public static int  fakultaet(int n ) {
		
	   if(n==1) {
		   
		   
		   return 1;
		   
	   } else {
			return fakultaet(n-1)*n;
		}
	
	}

}
