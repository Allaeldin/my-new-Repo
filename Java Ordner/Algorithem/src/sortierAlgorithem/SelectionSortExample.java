package sortierAlgorithem;

public class SelectionSortExample {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] array = {12,1,23,345,-5,944,44};
		
		
		int[] arr = SelectionSortExample.sortiere(array);
		
		SelectionSortExample.ausgeben(arr);
		
		
		
	}
	
	
	public static  int[] sortiere(int[] array) {
		
		int temp ;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if(array[i]<array[j+1]) {
					temp = array[i];
					
					array[i]= array[j];
					array[j] = temp;
					
					
				}
				
			}
			
		}
		
		
	return array;	
	}
	
	public static void ausgeben(int[]array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
