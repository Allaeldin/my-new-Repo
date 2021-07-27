public class BouncingBall {
	
	public static void main(String...args) {
		int s =BouncingBall.bouncingBall(5, 0.66, 1.5);
		System.out.println(s);
		
	}
	
	public static int bouncingBall(double h, double bounce, double window) {
		
		double
		result;
		int count=1 ;
		
		if (h<0|| bounce<0 || bounce >1 || window>h) {
			return -1;
		}
		
		result = h * bounce;
	
		
		while (result>window) {
			
		if (result>window) {
			count+=2;
			
		}
		result = result * bounce;

	
		}
	    // your code
      return count;
	}
}