package bubbelsort;

public class Bubbelsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,234,-4,55,9};
		Bubbelsort.sortiere(a);
          Bubbelsort.ausgeben(Bubbelsort.sortiere(a));
	}
	
	
	public static int[] sortiere(int[] array) {
		
		int tem =0;
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = 0; j < array.length-1; j++) {
				
			if(array[j]>array[j+1]) {
				tem = array[j];
				array[j]=array[j+1];
				array[j+1]= tem;
				
			}
				
			}
			
		}
		return array;
	}
	
	
	
	public static void ausgeben(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+ " ");
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	

}
