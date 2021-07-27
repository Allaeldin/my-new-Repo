package aufgabe1_ArrayList;

public class Kontakt {
	private String name;
	private String telefonnumer;
	public Kontakt(String name,String telefonnummer) {
		this.name = name;
		this.telefonnumer = telefonnummer;
	}

	
	
	public static Kontakt erstelle(String name,String telefonnummer)  {
		
		return new  Kontakt( name, telefonnummer);
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTelefonnumer() {
		return telefonnumer;
	}



	public void setTelefonnumer(String telefonnumer) {
		this.telefonnumer = telefonnumer;
	}
	
	
	
	
}
