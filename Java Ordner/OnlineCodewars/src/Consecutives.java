import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {

//	
//	You are given a list/array which contains only integers (positive and negative). 
//	Your job is to sum only the numbers that are the same and consecutive. The result should be one list.
//
//	Extra credit if you solve it in one line. 
//	You can assume there is never an empty list/array and there will always be an integer.

//	[1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]
//
//			"""So as you can see sum of consecutives 1 is 1 
//			sum of 3 consecutives 4 is 12 
//			sum of 0... and sum of 2 
//			consecutives 3 is 6 ..."""
//
//			[1,1,7,7,3] # should return [2,14,3]
//			[-5,-5,7,7,12,0] # should return [-10,14,12,0]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { -5,-5,7,7,12,0 };
		List<Integer> d;
		d = Consecutives.sumConsecutives(Arrays.asList(a));

		for (Integer i : d) {
			System.out.print(i + "  ");
		}

	}

	public static List<Integer> sumConsecutives(List<Integer> s) {
	
		List<Integer> list = new ArrayList<>();
	
		int count = 1;
		int zaeler =1;
	
		
	
		for (int i = 0; i < s.size()-1 ; i++) {
			
			zaeler ++;
            if (s.get(i) == s.get(i+1)) {
            	count ++;
			  
			
				
			}
            
            if (s.get(i)!= s.get(i+1) ) {
				
            	list.add((s.get(i)*count));
            	count =1;
            		
			}
            
            if ((zaeler)==s.size() ) {
				list.add((s.get(i+1)*count));
			}
            
			}
	

		return list;
	}

}























