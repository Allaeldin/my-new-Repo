package singelton2;

public class Executer {

	public static void main(String[] args) {
		
		
		
		
		Singel singel = Singel.getSingel();
		singel.printData();
		
		
		
		
		
		Singel singel2 = Singel.getSingel();
		singel2.printData();
		
		

	}

}
