package sortierung‹bung;

public class Person {
	private String vorname;
	private String nachname;
	private int id; 
	private int geburtsjahr; 
	
	public Person(int id, String vorname,String nachname,int geburtsjahr) {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr= geburtsjahr;
		
		
		
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	@Override
	public String toString() {
		
		return "ID: "+this.id+" "+this.vorname+" "+ this.nachname+" "+this.geburtsjahr;
	}
	
	
	
	
	
	
	
}
