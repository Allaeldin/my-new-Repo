import java.util.ArrayList;
import java.util.Arrays;

public class DeadFish {
	
//	Write a simple parser that will parse and run Deadfish.
//
//	Deadfish has 4 commands, each 1 character long:
//
//	i increments the value (initially 0)
//	d decrements the value
//	s squares the value
//	o outputs the value into the return array
//	Invalid characters should be ignored.

//	Deadfish.parse("iiisdoso") =- new int[] {8, 64};
	
	
	public static void main(String...args) {
		System.out.println(Arrays.toString(DeadFish.parse("iiio")));
	}
	
	public static int[] parse(String data) {
        // Implement me! :)
		int zahl=0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < data.length(); i++) {
			
			if (data.charAt(i)=='i') {
				zahl++;
			}
			
			if (data.charAt(i)=='d') {
				zahl--;
			}

			if (data.charAt(i)=='s') {
				zahl = zahl * zahl;
			}
			
			

			if (data.charAt(i)=='o') {
				arrayList.add(zahl);
			}
			
			
		}
		int[] array = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
		
		return array;
    }
}



