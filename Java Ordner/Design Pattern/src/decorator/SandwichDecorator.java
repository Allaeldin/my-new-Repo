package decorator;

public class SandwichDecorator implements Sandwich {
	
	private Sandwich sandwich;
	 public SandwichDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return sandwich.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return sandwich.getDescription();
	}

}
