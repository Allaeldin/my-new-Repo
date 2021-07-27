package sortierung‹bung;

import java.util.Comparator;

public class SortiereNachVorname implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getVorname().compareTo(o2.getVorname());
			
		
		
		
	
	}

}
