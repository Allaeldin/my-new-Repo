
public class QuickSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {12,-9,3,66,5};
		
		int low = 0;
		int heigh = arr.length-1;
		
		
		System.out.println(heigh);
		int[] array = QuickSortExample.quickSort(arr, low, heigh);
		
		
		QuickSortExample.ausgeben(array);
		
		
		
		
		
	}
	
	
	public static  int[] quickSort(int[] sortieren, int low , int heigh) {
		
		int pivot = sortieren[heigh];
		int i = low;
		int j = heigh;
		
		while (i<=j) {
			
			while (sortieren[i]< pivot) {
				i++;
				
			}
			while (sortieren[j]>pivot) {
				j--;
			}
			
			if (i<=j) {
				int zahl = sortieren[i];
				sortieren[i]= sortieren[j];
				sortieren[j]= zahl;
				i++;
				j--;
			}
			
		}
		
		if(low<j) {
			
			quickSort(sortieren, low, j);
			
		}
		if (heigh>i) {
			quickSort(sortieren, i, heigh);
		}
		
			
		return sortieren;
	}
	
	
	public static void ausgeben(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
