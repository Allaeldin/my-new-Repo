package algorithums;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {-1,2,-2,-3,0,7,10,-20};
		//int[] b = SelectionSort2.SelectionSort(a);
		Arrays.sort(a, 0, 8);
		
		
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	
	
	
	public static int[] SelectionSort(int[] sortieren ) {
		
		for (int i = 0; i < sortieren.length; i++) {
			
			for (int j = i; j < sortieren.length-1; j++) {
				
				
				if (sortieren[i]> sortieren[j+1]) {
					int zahl = sortieren[i];
					sortieren[i] = sortieren[j+1];
					sortieren[j+1] = zahl;
				}
			}
		}
		
		return sortieren;
	}
	
	
	
	
	
}
