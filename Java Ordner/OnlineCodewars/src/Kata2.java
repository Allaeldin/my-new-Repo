import java.util.ArrayList;
import java.util.List;

public class Kata2{


//Your task is to return the sum of Triangular Numbers up-to-and-including the nth Triangular Number.
//
//Triangular Number: "any of the series of numbers (1, 3, 6, 10, 15, etc.) obtained by continued summation of the natural numbers 1, 2, 3, 4, 5, etc."
//
//[01]
//02 [03]
//04 05 [06]
//07 08 09 [10]
//11 12 13 14 [15]
//16 17 18 19 20 [21]
//e.g. If 4 is given: 1 + 3 + 6 + 10 = 20.



  public static void main(String...agrs) {
	
	  
	int s =  Kata2.sumTriangularNumbers(4);
	System.out.println(s);
}


  public static int sumTriangularNumbers(int n)
  {
	  List< List<Integer>>list1 = new ArrayList< List<Integer>>();
	  List<Integer>list2 = new ArrayList<Integer>();
	  int sum =0;
	  int count = 1;
	  int count2 =1;
	  for (int i = 0; i < n; i++) {
		  for (int j = 0; j < count; j++) {
			list2.add(count2);
			count2++;
		}
		  count++;
		  
		  list1.add(list2);
		  count2 = list1.get(i).get(list2.size()-1)+1;
		  list2 = new  ArrayList<Integer>();
	}
	  
	  for (int i = 0; i <n; i++) {
		
			
			
			
			sum = sum+ list1.get(i).get(list1.get(i).size()-1);
			
		
		System.out.println();
	}
	  
	  
    return sum;
  }
}