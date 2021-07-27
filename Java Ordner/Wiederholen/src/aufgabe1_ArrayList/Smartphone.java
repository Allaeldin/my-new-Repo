package aufgabe1_ArrayList;

import java.util.ArrayList;

public class Smartphone {

	ArrayList<Kontakt> meineKontakte;

	public Smartphone() {

		this.meineKontakte = new ArrayList<>();

	}

	public boolean addKontakt(Kontakt newKontakt) {

		if (meineKontakte.isEmpty()) {
			meineKontakte.add(newKontakt);
			return true;

		}
			for (Kontakt kontakt : meineKontakte) {

				if (newKontakt.getName().equals(kontakt.getName())) {
					System.out.println( " Der Kontakt ist bereits vorhanden ");
					return false;
				}

			}
		

		meineKontakte.add(newKontakt);
		return true;
	}
	
	
	public boolean findKontakt(String name) {
		
		for (Kontakt kontakt : meineKontakte) {
			if (name.equals(kontakt.getName())) {
				
				System.out.println( " gefunden Name :" + kontakt.getName()+ " Tel :"+kontakt.getTelefonnumer());
				return true;
			}
		}
		
		System.out.println(" nicht gefunden");
		return false; 
	}
	
	
	public void ausgabe() {
		
		for (Kontakt kontakt : meineKontakte) {
			System.out.println("Name: "+kontakt.getName()+ " Tel: "+ kontakt.getTelefonnumer());
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
