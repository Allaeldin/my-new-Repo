package algorithums;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] a= {1,0,-1,-10,100,53,4};
		
		int[] b= InsertSort.insertSort(a);
		
		for (int i : b) {
			System.out.print(i+" ");
		}
		
	}

	
	
	
	
	
	public static int [] insertSort(int[] sortiere) {
		
		
		for (int i = 1; i < sortiere.length; i++) {
			
			int zahl = sortiere[i];
			int j = i;
			
			while (j>0 && sortiere[j-1] > zahl) {
				sortiere[j] = sortiere[j-1];
				j--;
			}
			
			sortiere[j]= zahl;
				
			
		}
		
		return sortiere;
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
