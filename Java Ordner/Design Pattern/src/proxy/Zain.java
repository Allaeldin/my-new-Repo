package proxy;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class Zain implements InternetServerProvider {

	@Override
	public void serveSites(String url) {
		// TODO Auto-generated method stub
		try {
			URI uri = new URL("https://"+url+".com").toURI();
			
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
