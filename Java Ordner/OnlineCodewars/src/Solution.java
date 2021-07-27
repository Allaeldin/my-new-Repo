import java.util.Iterator;

public class Solution {
//
//	Write a function that takes an array of numbers (integers for the tests) and a target number.
//	It should find two different items in the array that, when added together, give the target value.
//	The indices of these items should then be returned in a tuple like so: (index1, index2).
	
	
	
	
	public static void main(String...args) {
		int[] a = {1, 2, 3};
		
		int[] result =Solution.twoSum(a, 4);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	  public static int[] twoSum(int[] numbers, int target)
	    {
		  int[]array = new int[2];
		  int summ =0;
		  for(int i = 0; i<numbers.length;i++) {
			  for (int j = 0; j < numbers.length-1; j++) {
				summ = numbers[i]+numbers[j+1];
				if (summ==target) {
					array[0]=i;
					array[1]=j+1;
					return array;
					
				}else {
					summ=0;
				}
			}
		  }
		  
		  
	        return array; // Do your magic!
	    }
	
	
	
}
