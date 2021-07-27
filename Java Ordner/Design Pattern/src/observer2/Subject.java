package observer2;

public interface Subject {
	
	
	
	void subscribers(Observer obsever);
	void unsubscribers(Observer obsever);
	
	void notifyAllSubcribers();

}
