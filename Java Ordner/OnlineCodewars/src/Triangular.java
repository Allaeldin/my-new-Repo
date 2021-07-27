public class Triangular {
	
	public static void main(String...args) {
		int a =Triangular.triangular(2);
		System.out.println(a);
	}
	
	
    public static int triangular(int n) {
    	
    	int i =0;
    	int sum =0;
    	
    	if (n==0 || n<0) {
    		return 0;
			
		}
    	
    	while (i<=n) {
			
    		sum = sum+i;
    		i++;
    		
		}
    return sum;
    }
}