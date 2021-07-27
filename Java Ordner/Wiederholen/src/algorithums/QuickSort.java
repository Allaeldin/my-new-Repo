package algorithums;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] a= {7,1,23,5,0};
		
		int low =0;
		int high = a.length-1;
		int [] b = QuickSort.quickSort(a, low, high);
		
		for (int i : b) {
			
			System.out.print(i+"   ");
		}
	}
	
	
	public static int [] quickSort(int[] sortiere, int low,int  high) {
		
		int pivot = sortiere[high];
		int i = low;
		int j = high;
		
		
		
		while (i<=j) {
			
			while (sortiere[i]<pivot) {
				i++;
				
			}
			
			while (sortiere[j]>pivot) {
				
				j--;
				
			}
			
			if (i<=j) {
				int zahl = sortiere[i];
				sortiere[i] = sortiere[j];
				sortiere[j] = zahl;
				i++;
				j--;
			}
			
			
			
		}
		
		
		
		if (i<high) {
			
			return quickSort(sortiere, i, high);
		}
		
		
		if (j>low) {
			return quickSort(sortiere, low, j);
			
		}
		
		return sortiere;
	}

}
