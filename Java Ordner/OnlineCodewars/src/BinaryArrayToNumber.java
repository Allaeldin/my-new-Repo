import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
	
	public static void main(String...args) {
		List<Integer> list1 = Arrays.asList(0,1,1,0);
		List<Integer> list2 = Arrays.asList(-5,23,1);
		int  s =BinaryArrayToNumber.ConvertBinaryArrayToInt(list1);
		System.out.println(s);
	}
	

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
    	int count_total =0;
    	int count0 =0;
    	int count1 =1;
    	int count2 =1;
    	int count3 =1;
    	List<Integer> list = Arrays.asList(0,0,0,0);
    	while (!list.equals(binary)) {
    		
    		if (count3 <1  ) {
				list.set(3, 0);
				count3 =1;
			}else if(count3 == 1) {
				list.set(3, 1);
				count3 = 0;
				
		
				
			}
    		
    		if (count2 <2  ) {
				list.set(2, 0);
			}else if(count2>=2 && count2<4) {
				list.set(2, 1);
			}else {
				
				count2 =0;
			}
    		if (count1 <4  ) {
				list.set(1, 0);
			}else if(count1 >=4 && count1<8) {
				list.set(1, 1);
			}else {
				
				count1 =0;
			}
    		
    		if (count0<8  ) {
				list.set(0, 0);
			}else if (count0>=8 && count0<16) {
				list.set(0, 1);
			}else {
				count0 =0;
			}
    		
    		System.out.print(list.get(0)+" "+list.get(1)+" "+list.get(2)+" "+list.get(3));
    		System.out.println();
    		count_total++;
    		count0++;
    		count1++;
    		count2++;
    		
			
		}
    	return count_total;
    			
    	
    	
    }
}