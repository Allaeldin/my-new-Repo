package singelton2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singel {
	
	
	
	Integer[] numbers = {1,23,6,7,10,8};
	
	List<Integer> list = Arrays.asList(numbers);
	
	private static Singel instance;
	
private Singel() {
		
		Collections.shuffle(list);
		System.out.println(" Object Created");
		
		System.out.println("HashCode "+ this.hashCode());
		
		
	}
	
public static Singel getSingel() {
	if (instance ==null) {
		
		instance = new Singel();
	}
	
	return instance;
}


	public void printData() {
		
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
