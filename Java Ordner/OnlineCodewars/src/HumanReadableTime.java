
public class HumanReadableTime {

//	Write a function, which takes a non-negative integer (seconds) as input and
//	returns the time in a human-readable format (HH:MM:SS)
//
//	HH = hours, padded to 2 digits, range: 00 - 99
//	MM = minutes, padded to 2 digits, range: 00 - 59
//	SS = seconds, padded to 2 digits, range: 00 - 59
//	The maximum time never exceeds 359999 (99:59:59)

	public static void main(String... args) {
		
		
		
		System.out.println(HumanReadableTime.makeReadable(359999));

	}

	public static String makeReadable(int seconds) {
		// Do something
		int hour = 60*60;
		int minute = 60;
		int rest;
		
		int hours = seconds/hour;
		rest = seconds%hour;
		int minutes =     rest/minute;
		int second = rest% minute;
		if (hours> 99 || hours < 0 ||  minutes >59 || minutes < 0|| second>59 || second < 0) {
			return null;
			
		}
		
		if (seconds == 0) {
			
			return "00:00:00";
		}
		

		
		return  String.valueOf(hours)+":"+String.valueOf(minutes)+":"+String.valueOf(second);
	}
}