import java.util.Arrays;

public class ArraySortieren {
public static void main(String...args) {
	
	
	
	
	float[] numbers = {2.3f, 4.5f, 100.43f, -234.43f, -10.4f};
	
	
	Arrays.sort(numbers);
	for (int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i]+" ");
	}
}
}
