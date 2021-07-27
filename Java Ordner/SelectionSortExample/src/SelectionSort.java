import java.util.Arrays;
import java.util.Iterator;

public class SelectionSort {
	
	
	public static int[] selectionSort(int[] sortieren) {
		int temp;
		
		for (int i = 0; i < sortieren.length-1; i++) {
			
			for (int j = i+1; j < sortieren.length; j++) {
				
				if (sortieren[i]>sortieren[j]) {
					temp =  sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
				}
				
				
				
			}
			
		}
		
		
		
		
		return sortieren;
		
		
	}
	
	
	
	
	
	public static void main(String...args) {
		
		int[]a = {1,11,-22,4,90,0,40,-1};		
		System.out.println(Arrays.toString(a));
		SelectionSort.selectionSort(a);
		System.out.println(Arrays.toString(SelectionSort.selectionSort(a)));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
