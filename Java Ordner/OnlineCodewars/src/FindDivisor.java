import java.util.Iterator;

public class FindDivisor {

	
	//Count the number of divisors of a positive integer n.
//	Examples
//	numberOfDivisors(4)  == 3 // 1, 2, 4
//	numberOfDivisors(5)  == 2 // 1, 5
//	numberOfDivisors(12) == 6 // 1, 2, 3, 4, 6, 12
//	numberOfDivisors(30) == 8 // 1, 2, 3, 5, 6, 10, 15, 30
	
	public static void main(String...args) {
		long a = FindDivisor.numberOfDivisors(30);
		System.out.println(a);
	}
	
	public static long numberOfDivisors(int n) {
		// TODO please write your code below this comment
		int count =0;
		for (int i = 1; i <= n; i++) {
			if ((n%i)==0) {
				count++;
			}
			
			
		}
		
		return count;
	}
}
