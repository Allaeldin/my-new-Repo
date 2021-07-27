
package sortierungÜbung;

import java.util.Comparator;

public class SortiereNachgebutsjahr implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getGeburtsjahr()>o2.getGeburtsjahr()) {
			return 1;
		}
		
		if (o1.getGeburtsjahr()<o2.getGeburtsjahr()) {
			return -1;
		}
		return 0;
	}

}
