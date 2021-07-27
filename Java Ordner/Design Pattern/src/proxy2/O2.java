package proxy2;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class O2 implements InternetServiceProvider {

	@Override
	public void serveSites(String url) {
		
		try {
			URI uri = new URL("https://"+url+".com").toURI();
			
		java.awt.Desktop.getDesktop().browse(uri);
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		
		
		
	}

}
