
public class Kata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Complete the solution so that it returns true if the first argument(string) passed
//		in ends with the 2nd argument (also a string).
		
		boolean result = Kata.solution("abc", "bc");
		System.out.println(result);
	}
	
	
	
	 public static boolean solution(String str, String ending) {
		 int counter = 0;
		 int zaeler =0;
		 for (int i = str.length()-1; i>= 0; i--) {  
			 
			 for (int j = ending.length()-1; j >=0; j--) {
			
				
				 if (str.charAt(i-zaeler)==ending.charAt(j)) {
					counter++;
					
				}
			
				 zaeler++;
				 
				 
				 
			}
			 break;
			
		}
		 if (counter==ending.length()) {
			 return true;
			
		}
		    return false;
		  }

}
