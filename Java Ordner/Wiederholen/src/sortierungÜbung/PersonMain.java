package sortierung‹bung;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.multi.MultiDesktopPaneUI;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person(1, "Allaeldin", "Hasan", 1990);
		Person person2 = new Person(2, "Walid", "Mohamed", 2002);
		Person person3 = new Person(3, "Mustafa", "Ali", 1993);
		Person person4 = new Person(4, "Khalid", "Taher", 2007);

		List<Person> personList = new ArrayList<Person>();

		personList.add(person4);
		personList.add(person1);
		personList.add(person3);
		personList.add(person2);

		for (Person person : personList) {
			System.out.println(person);
		}

		Collections.sort(personList, new SortiereNachVorname());
		System.out.println("----------------------");

		for (Person person : personList) {
			System.out.println(person);
		}

		System.out.println("in Set -------------------");

		Set<Person> set = new TreeSet<>(new SortiereNachgebutsjahr());
		set.add(person4);
		set.add(person3);
		set.add(person2);
		set.add(person1);
		for (Person person : set) {
			System.out.println(person);
		}

		Map<Person, String> map = new TreeMap<>(new SortiereNachVorname());

		map.put(person3, "Informatik");
		map.put(person4, "P‰dagogik");
		map.put(person1, "Mathematik");
		map.put(person2, "Maschinbau");

		System.out.println("in Map -------------------");

		for (Person person : map.keySet()) {

			System.out.println(person);
		}

		Iterator<Person> iterator = personList.iterator();

		while (iterator.hasNext()) {

			if (iterator.next().getVorname().equals("Mustafa")) {
				iterator.remove();
			}
		}

		PersonMain.getPerson(personList);

		Iterator<Person> it = set.iterator();

		while (it.hasNext()) {
         if (it.next().getGeburtsjahr()== 2007) {
			it.remove();
		}
		}

		
		
		PersonMain.getPerson(set);
		
		
		
		Iterator iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()) {
			Map.Entry<Person, String> entry = (Map.Entry<Person, String>)iterator2.next();
			if (entry.getKey().getNachname().equals("Hasan")) {
				iterator2.remove();
			}
			
		}
		
		System.out.println("in Map-------------------");
		
		for (Person person : map.keySet()) {
			System.out.println(person);
		}
		
	}

	public static void getPerson(Collection<Person> col) {

		System.out.println("in -------------------");

		for (Person person : col) {
			System.out.println(person);
		}

	}

}
