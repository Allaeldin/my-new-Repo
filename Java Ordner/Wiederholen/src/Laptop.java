
public class Laptop {

	int ram;
	double preis;
	String marke;
	
	public Laptop(int ram , String marke, double preis) {
	this.marke = marke;
	this.preis = preis;
	this.ram = ram;
	}
	
	
	
	public void ausgabe()   {
		
		System.out.println("Marke: "+this.marke+" Ram: "+this.ram+" Preis: " +this.preis);
		
		
		System.out.println(this);
		
		
	}
	

}
