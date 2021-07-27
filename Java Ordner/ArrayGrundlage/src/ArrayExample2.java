import java.util.Arrays;

public class ArrayExample2 {
	public static void main(String...args) {
		
		int[] array = {1,-33,52,17,71,-2};
		
	System.out.println(Arrays.toString(ArrayExample2.sort(array))	);
		
		System.out.println(ArrayExample2.maxNumber(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static int[] sort(int[] array) {
		
		int temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j]>array[j+1]) {
					temp = array[j];
					 array[j]=  array[j+1];
					 array[j+1] = temp;
				}
				
				
			}
			
		}
		return array;
		
	}
	
	public static int maxNumber(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max>array[i]) {
				max = array[i];
				
			}
			
		}
		return max;
	}
	

}
