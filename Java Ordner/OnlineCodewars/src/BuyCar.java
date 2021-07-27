import java.util.Arrays;

public class BuyCar {
	public static void main(String...args) {
		
		
		int[]a=BuyCar.nbMonths(2000, 8000, 1000, 1.5);
		
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
	
	
	
	
	
	
	
	
	

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
	    // your code
		int[] array = new int[2];
		int saving =0;
		int count =0;
		int zaehler =1;
		
		
		if (startPriceOld>=startPriceNew) {
			array[0] = 0;
			array[1] = startPriceOld-startPriceNew;
			return array;
		}
		
		if (startPriceOld==startPriceNew) {
			array[0] = 0;
			array[1] = 0;
			return array;
		}
		
		while (saving <=0) {	
			
			startPriceNew = (int) (startPriceNew - ((startPriceNew*percentLossByMonth)/100));
			startPriceOld = (int) (startPriceOld - ((startPriceOld*percentLossByMonth)/100));
			System.out.println("Saving:"+saving);
			saving = startPriceOld+savingperMonth-startPriceNew;
			
			savingperMonth += 1000;
			System.out.println(percentLossByMonth);
			zaehler++;
			if (zaehler==2) {
				percentLossByMonth += 0.5;
				zaehler =0;
			}
			count++;
			
			
		}
		
		
		
		
		array[0]=count;
		array[1] = saving ;
		
		
		
			return array;
		}
	}