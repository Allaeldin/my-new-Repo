public class Minimum{
	
//	
//	Task
//	Given a list of digits, return the smallest number that could be formed
//			from these digits, using the digits only once (ignore duplicates).
//
//	Notes:
//	Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
//	Explanation:
//		(13) is the minimum number could be formed from {1, 3, 1} , Without duplications
//
//		minValue({5, 7, 5, 9, 7})  ==> return (579)
//		minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
	
	public static void main(String...args) {
		String wString  = "bnnsnad";
		
		StringBuilder build = new StringBuilder(wString);
	System.out.println(wString.contains("n"));
	}

	public static int minValue(int[] values){
		
		String sString1 = "";
		String sString2 = "";
		for (int i = 0; i < values.length; i++) {
			String numberString1  =String.valueOf(values[i]);
			
			if (!sString1.contains(numberString1)) {
				
				sString1 = sString1 + numberString1;
			}
		}
		
		
	     
	
		return 0;
	}

}