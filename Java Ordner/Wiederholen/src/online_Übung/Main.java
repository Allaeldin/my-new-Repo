package online_Übung;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student student1 = new Student("Hasan", "Alladin",4, 2);
		Student student2 = new Student("Sami", "Ali", 5, 2);
		Student student3 = new Student("Rami", "Khalid", 1, 2);
		Student student4 = new Student("Walid ", "Adel", 3, 2);
		
		
		
		Map<Student, String> map = new  HashMap<>();
		
		map.put(student1, "Informatik");
		map.put(student2, "Medizin");
		map.put(student3, "BWL");
		map.put(student4, "Pädagogik");
		
		
		
		System.out.println("Bei Map ----------------------");
		for (Student elem : map.keySet()) {
			
			System.out.println(elem+" " +map.get(elem));
			
		}
		
		
		Iterator iterator  = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Student	, String> entry = (Map.Entry<Student,String>)iterator.next();
			if (entry.getKey().name.equals("Hasan")) {
				iterator.remove();
			}
		}
		
		
		System.out.println("-----------");
		
	for (Student elem : map.keySet()) {
	
		
			System.out.println(elem+" " +map.get(elem));
			
		}	

	List<Student> studentenListe = new LinkedList<Student>();
	
	studentenListe.add(student1);
	studentenListe.add(student2);
	studentenListe.add(student3);
	studentenListe.add(student4);
	
	System.out.println("Bei List -----------------------");
	
	for (Student student : studentenListe) {
		System.out.println(student);
	}
	
	
	Iterator<Student> it = studentenListe.iterator();
	
	while (it.hasNext()) {
		
		if (it.next().name.equals("Rami")) {
			it.remove();
			
		}
		
		
		
	}
	
	System.out.println("-----------");
	
	
	for (Student student : studentenListe) {
		System.out.println(student);
	}
	
	
	
	System.out.println("Bei Set -----------------------");
	Set<Student> studentenSet = new  HashSet<Student>();
	
	
	
	
	studentenSet.add(student4);
	studentenSet.add(student2);
	studentenSet.add(student1);
	studentenSet.add(student3);
	for (Student student : studentenSet) {
		System.out.println(student);
	}
	
	
	System.out.println("-----------");
	
	
	
	
	
	Iterator<Student>it2 = studentenSet.iterator();
	
	while (it2.hasNext()) {
		
		
		if (it2.next().name.equals("Rami")) {
			it2.remove();
		}
	}
	
	for (Student student : studentenSet) {
		System.out.println(student);
	}
	
	}
	
	



















}
