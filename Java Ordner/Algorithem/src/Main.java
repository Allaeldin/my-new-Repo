import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = {2,-12,45,9,-200,6};
		
		int tem=0;
	
	for (int j = 0; j < numbers.length-1; j++) {
		
		
		if(numbers[j]>numbers[j+1]) {
			tem = numbers[j+1];
			
		
		}
	}
		
		System.out.println(tem);
	}

}
