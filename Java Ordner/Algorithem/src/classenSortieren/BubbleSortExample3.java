package classenSortieren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BubbleSortExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> personList = new ArrayList<>();
		List<String> namenList = new ArrayList<>();
		namenList.add("Alla");
		namenList.add("Bahgdad");
		
	personList.add(new Person("Schmmit", "Klaus", 28, 123456, 21075));
	personList.add(new Person("Abdellatif", "Tarq", 33, 987523, 36521));
	personList.add(new Person("Mansor", "Ali", 45, 7392876, 21698));
	personList.add(new Person("widad", "Ismail", 17, 3785123, 21890));
	
	Collections.sort(namenList);
//	
//	for (Person person : personList) {
//		
//		System.out.println(person.name);
//	}
//	
//	System.out.println("---------------------------------------");
//	
//	Collections.sort(personList, new NachNameSortieren());
//	
//	for (Person person : personList) {
//		
//		System.out.println(person.name);
//	}
//	
//		
		
		
		
		
	List<Person> persons = BubbleSortExample3.sort(personList);	
		
		for (Person person : persons) {
			System.out.println(person.vorname);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static List<Person> sort(List<Person> persons) {
		
		Person tempPerson ;
		
		for (int i = 0; i <persons.size()-1; i++) {
			
			for (int j = 0; j < persons.size()-1; j++) {
				
				if((persons.get(j).compareTo(persons.get(j+1)))>0) {
					
					tempPerson = persons.get(j);
					persons.set(j,persons.get(j+1)) ;
					persons.set(j+1, tempPerson);
					
				}
				
				
				
			}
			
			
		}
		
		return persons;
	}

}
