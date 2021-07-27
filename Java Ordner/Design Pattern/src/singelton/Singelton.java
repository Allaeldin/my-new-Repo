package singelton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singelton {

	private Integer[] numbers = { 1, 2, 3, 4, 5, 6 };

	private List<Integer> list = Arrays.asList(numbers);
	private static Singelton instance;
	

	private Singelton() {

		Collections.shuffle(list);
		System.out.println("Hashcode "+this.hashCode());

	}
	
	
	public static Singelton getSingelton() {
		if (instance == null) {
			instance = new Singelton();
		}
		
		return instance;
	}

	public void print() {
		for (Integer i : list) {
			System.out.print(i + "  ");
		}

		System.out.println();

	}

}
