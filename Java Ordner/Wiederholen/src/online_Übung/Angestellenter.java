package online_Übung;

import java.util.Comparator;

public class Angestellenter  {
	
	
	String vorname;
	String nachname;
	int    alter;
	
	public Angestellenter(String vorname,String nachname, int aletr) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = aletr;
		
	}

	@Override
	public String toString() {
		
		return"Vorname: "+this.vorname+" Nachname: "+this.nachname+" Alter: "+ this.alter;
	}

	
	

}
