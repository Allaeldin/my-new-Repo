
public class ArrayExample {
	
	public static void main(String...args) {
		
		
		int[] numbers = {12,234,3,45,-45};
		int[] arrayCopy= new int[numbers.length];
		
		System.arraycopy(numbers, 0, arrayCopy, 0, numbers.length);
		
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
