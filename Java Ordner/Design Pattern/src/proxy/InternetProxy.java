package proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServerProvider {
	
	
	
	List<String > blockedSites = Arrays.asList("Google","Youtube","Facebook");
	
	
	
	
	
	

	@Override
	public void serveSites(String url) {
		
		// TODO Auto-generated method stub
		if (blockedSites.contains(url)) {
			internetLog(url);
		System.out.println("This Website is blocked!");	
		}else {
			
			System.out.println(String.format("https://%s.com", url));
			new Zain().serveSites(url);
		}
		
		
	}







	private void internetLog(String url) {
		System.out.printf("[%d]->%s requsted",System.currentTimeMillis(),url);
		System.out.println();
		
	}

}
