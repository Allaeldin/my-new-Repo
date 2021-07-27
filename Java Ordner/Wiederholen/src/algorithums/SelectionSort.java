package algorithums;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {10, 2,20,-1,0,23,4};
		
		
		
		int [] b = SelectionSort.selectionSort(a);
		
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
	
	
	
	
	public static int[] selectionSort(int[] sortiere) {
		int temp;
		for (int i = 0; i < sortiere.length-1; i++) {
			for (int j = i+1; j < sortiere.length; j++) {
				if (sortiere[i]>sortiere[j]) {
					temp = sortiere[i];
					sortiere[i] = sortiere[j];
					sortiere[j]= temp;
					
				}
				
			}
		}
		
		return sortiere;
	}
	
	
	
	
	
	
	
	

}
