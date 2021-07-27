import java.util.Arrays;

public class QuickSort {
	
	
	public static int[] quickSort(int[]sortieren, int low, int high) {
		
		int pivot = sortieren[high];
		int i = low;
		int j = high ;
		
		
		while (i<=j) {
			
			while (sortieren[i]<pivot) {
				i++;
				
			}
			
			while (sortieren[j]>pivot) {
				j--;
				
			}
			
			if (i<=j) {
				
				int zahl = sortieren[i];
				sortieren[i] = sortieren[j];
				sortieren[j] = zahl;
				i++;
				j--;
			}
				
			
			
		}
		
		if (low<j) {
			quickSort(sortieren, low, j);
			
		}
		
		if (high>i) {
			quickSort(sortieren, i, high);
			
		}
		
		return sortieren;
		
	}

	
	public static void main(String...args) {
		//int[]   a = {7,-77,10,3,99,-200};
		int[]	a = {10,-2,23,0,1,99};	
		System.out.println(Arrays.toString(a));
		
		int low =0;
		int high = a.length-1;
		QuickSort.quickSort(a, low, high);
		
		System.out.println("-------------------------------------");
		System.out.println(Arrays.toString(QuickSort.quickSort(a, low, high)));
		
		
		
		
		
		
		
		
		
		
		
	}
}
