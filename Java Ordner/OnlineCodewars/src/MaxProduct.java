public class MaxProduct {
	
//	Task
//	Given an array of integers , Find the maximum product obtained 
//	from multiplying 2 adjacent numbers in the array.
//	Notes
//	Array/list size is at least 2.
//
//	Array/list numbers could be a mixture of positives, negatives also zeroes .
//	adjacentElementsProduct([1, 2, 3]); ==> return 6
//	adjacentElementsProduct([9, 5, 10, 2, 24, -1, -48]); ==> return 50
//	adjacentElementsProduct([-23, 4, -5, 99, -27, 329, -2, 7, -921])  ==>  return -14
	
	public static void main(String...args) {
		int s = MaxProduct.adjacentElementsProduct(new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921});
		System.out.println(s);
	}
	
  public static int adjacentElementsProduct(int[] array) {
    // your code here
	  
	  int max = Integer.MIN_VALUE;
	  int multi = 1;
	  
	  for (int i = 0; i < array.length-1; i++) {
		  
		  multi = array[i]*array[i+1];
		  
		  if (max<multi) {
			max = multi;
		}
		
	}
	  
	  
	  
	  
	  return max;
	  
  }
}