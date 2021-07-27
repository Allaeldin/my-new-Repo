package online_�bung;

import java.util.Comparator;

public class SortierenMitDemAlter implements Comparator<Angestellenter> {

	@Override
	public int compare(Angestellenter o1, Angestellenter o2) {
		if (o1.alter>o2.alter) {
			return -1;
		}else if (o1.alter<o2.alter) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
