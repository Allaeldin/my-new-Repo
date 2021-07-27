package online_Übung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AngestellentenListe {
	

	
	
	
	public static void main(String...args) {
		
		
		
		
		List<Angestellenter> angestellentenListe = new ArrayList<>();
		
		Angestellenter angestellenter1 = new Angestellenter("Ahmed", "Jomuaa", 23);
		Angestellenter angestellenter2 = new Angestellenter("zli", "Faisel", 19);
		Angestellenter angestellenter3 = new Angestellenter("Walid", "Adel", 33);
		
		angestellentenListe.add(angestellenter1);
		angestellentenListe.add(angestellenter2);
		angestellentenListe.add(angestellenter3);
		
		Collections.sort(angestellentenListe, new SortierenMitDemAlter());
		
		for (Angestellenter angestellenter : angestellentenListe) {
			System.out.println(angestellenter);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
