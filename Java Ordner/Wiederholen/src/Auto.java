
public class Auto {
	
	
	static int reifenAnzahl = 4;
	int reifen;
	String marke;
	double preis;
	
	
	
	public Auto() {
		
	}
	
	
	public Auto(int reifen, String marke , double preis) {
		if (marke.equals("BMW")) {
		reifenAnzahl = 5;	
		}
		this.marke = marke;
		this.preis = preis;
	}
	
	public void gasGeben() {
		
		System.out.println("Das Auto "+ marke +" fährt jetzt los");
		
		System.out.println(this.marke +" "+reifenAnzahl+" Preis "+this.preis);
	}

}
