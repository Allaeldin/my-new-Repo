package singelton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Singelton singelton1 = Singelton.getSingelton();
		singelton1.print();
		
		Singelton singelton2 = Singelton.getSingelton();
		singelton2.print();
	}

}
