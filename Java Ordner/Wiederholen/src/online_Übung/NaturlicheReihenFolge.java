package online_Übung;

import java.util.Comparator;

public class NaturlicheReihenFolge implements Comparator<Angestellenter> {
	
	
	
	
	

	@Override
	public int compare(Angestellenter o1, Angestellenter o2) {
		// TODO Auto-generated method stub
		return o1.vorname.compareTo(o2.vorname);
	}
}
