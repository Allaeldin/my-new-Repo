package algorithums;

import javax.sound.midi.Soundbank;

public class InsertSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = { 7,1,0,10,-3,55,4};
		
		int[] b = InsertSort2.insertSort(a);
		
		for (int i : b) {
			System.out.print(i +" ");
		}
		
		
		
	}

	
	
	
	public static int[] insertSort(int[] sortiere) {
		
	
		for (int i = 1; i < sortiere.length; i++) {
			int zahl = sortiere[i];
			int j = i;
			
			while (j>0 && sortiere[j-1]>zahl) {
				
				sortiere[j] = sortiere[j-1];
				j--;
			}
			
			sortiere[j] = zahl;
			
			
		}
		
		return sortiere;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
