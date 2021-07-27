import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class QuickSort2 {

	public static int[] quickSort(int[] sortieren, int low, int high) {

		int pivot = sortieren[high];
		int i = low;
		int j = high;

		while (i <= j) {

			while (sortieren[j] > pivot) {
				j--;
			}

			while (sortieren[i] < pivot) {

				i++;
			}

			if(i <= j) {
				int zahl = sortieren[i];
				sortieren[i] = sortieren[j];
				sortieren[j] = zahl;
				i++;
				j--;
			}

		}

		if (low < j) {
			quickSort(sortieren, low, j);

		}

		if (high > i) {
			quickSort(sortieren, i, high);

		}

		return sortieren;
	}

	public static void main(String... args) {

		int[] a = { 10, -2, 23, 0, 1, 99 };
		int low = 0;
		int high = a.length - 1;
		System.out.println(Arrays.toString(QuickSort2.quickSort(a, low, high)));

	}

}
