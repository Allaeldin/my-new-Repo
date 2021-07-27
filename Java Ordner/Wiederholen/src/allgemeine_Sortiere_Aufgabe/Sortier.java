package allgemeine_Sortiere_Aufgabe;

import java.util.Arrays;

public class Sortier {
	
	public static void main (String...args) {
		
		
		float[] numbers = {2.3f, 4.5f, 100.43f, -234.43f, -10.4f};
		
		Arrays.sort(numbers);
		
		
		for (float f : numbers) {
			
			System.out.print(f+" ");
		}
		
		
		
		String[] names = {"Bernt", "Olaf", "Alex", "Jurgen"};
		
		System.out.println();
		Arrays.sort(names);
		
		for (String string : names) {
			System.out.print(string+" ");
		}
		
		System.out.println();
		

		Film film1 = new Film("Krieg der Sterne", 1977, 8.6);
		Film film2 = new Film("Schindler's List", 1993, 8.9);
		Film film3 = new Film("Casablanca", 1942, 8.5);
		Film film4 = new Film("Der Pate", 1972, 9.2);
		Film film5 = new Film("Die Verurteilten", 1994, 9.3);
		
		Film[] filme = {
				film1,
				film2,
				film3,
				film4,
				film5
		};
		
		System.out.println("------------------");
		
		Arrays.sort(filme);
		
		for (Film film : filme) {
			
			System.out.println(film);
		}
		
	}

	
	

}