package decorator;

public class Cheese extends SandwichDecorator {

	public Cheese(Sandwich sandwich) {
		super(sandwich);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	@Override
	public double  getCost() {
		
		return super.getCost()+7;
		
		
	}
	
	
	
	@Override
	public String  getDescription() {
		return super.getDescription()+" + Chesse";
	}
	
	
	
	
	
	

}
