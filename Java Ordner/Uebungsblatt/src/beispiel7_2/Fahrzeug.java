package beispiel7_2;

public class Fahrzeug {

	int nummer;

	double kilometerstand = 0;

	public Fahrzeug(int nummer) {
		this.nummer = nummer;
	}

	public void fahre(double anzahlKilometer) {
		this.kilometerstand += anzahlKilometer;
	}
	
	

	 public double getKilometerstand() {
		 return this.kilometerstand;
		 
		 
	 }
	
}
