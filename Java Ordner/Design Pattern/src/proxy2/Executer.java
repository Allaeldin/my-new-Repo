package proxy2;

import java.util.Arrays;
import java.util.List;

public class Executer {

	public static void main(String[] args) {
		
		List<String> seites = Arrays.asList( "Twitter", "BBC","Facebook")	;
		
		InternetServiceProvider isProvider = new InternetProxy();
		// isProvider.serveSites("BBC");
		
		
		for (String seite : seites) {
			
			
		   isProvider.serveSites(seite);
			
			
		}
		
		
		
		
		
		
		
	}

}
