package observerDesignPattern;

public interface SubjectYouTube {
	
	void subscriber(ObserverYouTube observer);
	void unsubscribe(ObserverYouTube observer);
	void notifySubscribers();
	
	

}
