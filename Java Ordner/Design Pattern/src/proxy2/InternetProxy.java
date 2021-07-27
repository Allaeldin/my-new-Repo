package proxy2;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {
	
	
	List<String> blockedSeites = Arrays.asList("Youtube", "Google","BBC");
	
	
	

	@Override
	public void serveSites(String url) {
	if (blockedSeites.contains(url)) {
		
		System.out.println(" This Website is blocked");
		
	}else {
		
		new O2().serveSites(url);
		System.out.println(String.format("www.%s.com", url) );
		
		
		
	}
		
	}

}
