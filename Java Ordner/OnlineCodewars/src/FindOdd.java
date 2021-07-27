import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {

	
	
//	Given an array of integers, find the one that appears an odd number of times.
//
//	There will always be only one integer that appears an odd number of times.
//
//	FUNDAMENTALS
//	 assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
//    assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
//  	assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a = {10};
       System.out.println(   FindOdd.findIt(a));
		
		
	}
	
	public static int findIt(int[] a) {
		
		int count =0;
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			
			int j;
			for ( j = 0; j < a.length; j++) {
				
				if (a[i]==a[j]  ) {
					count++;
				}
				
				
				
				if (count==1 && (j ==a.length-1)) {
					return a[i];
				}
				

				if ((count%2)!=0 && (j ==a.length-1)) {
					return a[i];
				}
				
				if ((count%2)==0 && (j ==a.length-1)) {
					count=0;
				}
				
			}

		}
		
	  	return 0;
	  }
	}