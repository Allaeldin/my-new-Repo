package observerDesignPattern;

public class Subscribers implements ObserverYouTube {
	
	private String name;
	
	
	public Subscribers(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		
		System.out.println("Hey "+this.name+ "  Das Video "+message+" ist  hochgeladen"  );
		
	}
	
	
	

}
