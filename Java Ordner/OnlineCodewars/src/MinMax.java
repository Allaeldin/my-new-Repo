class MinMax {
	
	public static void main(String...agrs) {
	int[] s =	MinMax.minMax(new int[]{1,2,3,4,5});
	
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]+" ");
	}
	
	System.out.println();
	System.out.println(123%10);
	int d = 13/10;
	System.out.println(d);
	
	
	}
	
	
	
	
	
    public static int[] minMax(int[] arr) {
        // Your awesome code here
    	int max = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    	int[] array = new int[2];
    	for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
				
				
			} 
			
			if (min>arr[i]) {
				min = arr[i];
				
			}
		}
    	array[0] =min;
    	array[1]= max;
    	return array;
    }
}