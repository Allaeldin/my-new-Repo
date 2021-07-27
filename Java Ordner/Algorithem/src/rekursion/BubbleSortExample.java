package rekursion;

import java.util.Iterator;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 23, -45, 22, 8, 99, 200, 3009 };
		int temp;

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {

				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;

				}

			}

		}

	
	
		
		int[] array = BubbleSortExample.bubbleSortRekursiv(numbers);
		BubbleSortExample.ausgeben(array);
		
	}

	public static int[] bubbleSortRekursiv(int[] array) {
		int temp;
		for (int j = 0; j < array.length-1; j++) {
			if (array[j] > array[j + 1]) {
				continue;

			}
			temp = array[j];
			array[j] = array[j + 1];
			array[j + 1] = temp;
			bubbleSortRekursiv(array);

		}
		return array;
	}

	public static void ausgeben(int[] arry) {

		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "   ");
		}
	}
}