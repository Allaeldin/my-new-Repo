
public class DRoot {

//	Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
//
//	Examples
//	    16  -->  1 + 6 = 7
//	   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//	132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//	493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

	static int sum = 0;

	public static void main(String... agrs) {

//		System.out.println();
//		System.out.println(123%10);
//		int d = 13/10;
//		System.out.println(d);

		int f = DRoot.digital_root(171761);
		System.out.println(f);

	}

	public static int digital_root(int n) {
		int s;
		int r;
		
		sum = sum + (n % 10);
		r = sum;

		s = n / 10;

		if (n < 10 && sum < 10) {

			return sum;

		}
		if (n >= 10) {
			return digital_root(s);

		} else {

			sum = 0;
			return digital_root(r);
		}

	}
}