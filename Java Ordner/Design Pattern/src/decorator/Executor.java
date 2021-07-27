package decorator;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sandwich sandwich = new Beef(new Cheese( new Basic2()));
				
		System.out.println(sandwich.getCost());
		System.out.println(sandwich.getDescription());
		
		
		
		
		
		
		
		
		
		
		
	}

}
