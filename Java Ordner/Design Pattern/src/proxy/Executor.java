package proxy;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String > Sites = Arrays.asList("TWitter","Youtube","Facebook");
		
		InternetServerProvider isp = new InternetProxy();
		
		isp.serveSites("Twitter");
//		for (String site : Sites) {
//			
//			isp.serveSites(site);
//			
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
