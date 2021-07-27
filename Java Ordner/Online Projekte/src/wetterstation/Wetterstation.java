package wetterstation;

import java.util.Iterator;

public class Wetterstation {
public static void main(String...args) {
	
	
	int[][] station = {{1,  2 , 3 , 4 , 5,  6,  7 , 8,  9, 10, 11 ,12, 13, 14},
			          {12, 14 , 9 ,12, 15, 16, 15, 15, 11,  8, 13 ,13, 15 ,12}};
	
	double durchschnittstemperatur;
	int summe =0;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE ;
	int temp ;
	int tag1=0;
	int tag2=0;
	int sume = Integer.MIN_VALUE ;
	
	for (int i = 0; i < station[1].length; i++) {
	
				summe = summe+	station[1][i];
	}

	durchschnittstemperatur = summe/14;
	
	

		for (int j = 0; j < station[1].length-1; j++) {
			
			
			if (max  < station[1][j]) {
				max = station[1][j];
				
			}
			
			if (min > station[1][j]) {
				min = station[1][j];
				
			}
			
			
		}

		
		
   for (int i = 0; i < station[1].length-1; i++) {
	
	   temp= station[1][i]+station[1][i+1];
	   
	   if (sume < temp) {
		sume = temp;
		tag1 =station[0][i];
		tag2 = station[0][i+1];
	}
	   
	   
	   
	 
}
	
	
   
   System.out.println("Tag1:" +tag1);
   System.out.println("Tag2:" +tag2);
   
	
   
   for (int i = 0; i < station.length; i++) {
	
	   for (int j = 0; j < station[i].length; j++) {
		
		   
		   System.out.print(station[i][j]+" ");
	}
	   System.out.println();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
