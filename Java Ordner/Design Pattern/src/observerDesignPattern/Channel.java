package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements SubjectYouTube{
	
	
	private String title;
	private List<ObserverYouTube> obsetverList ;
	
	

	public Channel() {
		
		this.obsetverList = new ArrayList<>();
	}

	@Override
	public void subscriber(ObserverYouTube observer) {
		
		obsetverList.add(observer);
		
	}

	@Override
	public void unsubscribe(ObserverYouTube observer) {
		
		obsetverList.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		for (ObserverYouTube observerYouTube : obsetverList) {
			
			observerYouTube.update(this.title);
			
		}
		
	}

	public  String getTitle() {
		return title;
	}

	public void Upload(String title) {
		this.title = title;
		notifySubscribers();
		
	}

	

	
	

}
