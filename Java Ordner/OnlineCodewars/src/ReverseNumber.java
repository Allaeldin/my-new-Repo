import java.util.Iterator;

public class ReverseNumber {

//	Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)
//
//	Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.
//
//	Examples
//	 123 ->  321
//	-456 -> -654
//	1000 ->    1
	
	
	
	public static void main(String...args) {
		int s = ReverseNumber.reverse(-123);
		System.out.println(s);
	}
	
	
	
	
	
	
	
	
	public static int reverse(int number) {
		// code here
		int s = 1;
	if (number<0) {
		number = number * (-1);
		s = -1;
	}	
	String numString =	String.valueOf(number);
	
	StringBuilder build = new StringBuilder(numString);
	numString = build.reverse().toString();
	
	
	
	return (s * Integer.parseInt(numString));
	
	}

}
