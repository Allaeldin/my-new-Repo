package online_Übung;

import java.util.Comparator;

public class SortiereSudentenMatrikelnummer implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
		if (o1.matrikelNr>o2.matrikelNr) {
			return 1;
		}
		
		if (o1.matrikelNr<o2.matrikelNr) {
			return -1;
		}
		

		
		
		
		return 0;
	}

}
