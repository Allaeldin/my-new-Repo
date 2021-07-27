import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Kata4 {
	
//	
//	The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
//
//			The result array should be sorted in ascending order of values.
//
//			Assume there are no duplicate integers in the array. 
//			The order of the integers in the input array should not matter.
//
//			Examples
//			[1, 2, 3, 4]  should return [[1, 3], [2, 4]]
//
//			[4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
//
//			[1, 23, 3, 4, 7] should return [[1, 3]]
//
//			[4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
	
	
	
	public static void main(String...args) {
		
		
		int[] a = {4, 3, 1, 5, 6};
		
		Kata4.twosDifference(a);
	for (int[] i : Kata4.twosDifference(a)) {
		System.out.print(Arrays.toString(i));
	}
		
	}
	
	public static int[][] twosDifference(int[] array) {
		
		
		List<Integer[]> list = new ArrayList<Integer[]>();
		
		
		int temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				
			}
		}
		
		
		int d ;
		
		
		
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = i; j < array.length-1; j++) {

				  d = array[j+1 ] - array[i];
				
				if (d == 2) {
					Integer[] arr = new Integer[2];

				
					arr[0] = array[i];
					arr[1] = array[j+1]; 
					
					list.add(arr);
				}
				
				
			}
		}
		
		
		int[][] a = new int[list.size()][];
		
		
	for (int i = 0; i <list.size(); i++) {
		
		int [] b = new int[2];
		b[0] = list.get(i)[0];
		b[1] = list.get(i)[1];
		
		a[i]= b;
	}
		
    return a;
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}