
public class TriangleTester {
//	Implement a method that accepts 3 integer values a, b, c. The method should
//	return true if a triangle can be built with the sides of given length and false in any other case.
//
//			(In this case, all triangles must have surface greater than 0 to be accepted).

	public static boolean isTriangle(int a, int b, int c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return false;
		}
		if (a < (b+c) && b == c) {

			return  true;

		}

		if (b  < ( a+c) && a == c) {

			return true;

		}

		if (c < (b+a) && b == a) {

			return true;

		}
		if (a==b && b==c) {
			
			return true;
		}

		if (a>b && a>c) {
			if (a*a==(b*b+c*c)) {
			return true;	
			}
			
		}
		if (b>a && b>c) {
			if (b*b==(a*a+c*c)) {
			return true;	
			}
			
		}
		
		if (c>a && c>b) {
			if (c*c==(b*b+a*a)) {
			return true;	
			}
			
		}
		
		return false;
		
	}

}
