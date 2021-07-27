package observer2;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
	
	private String name;
	private String availibility;
	
	private List<Observer> observerlList ;
	
	
	public Course(String name) {
		
		this.name = name;
		observerlList = new ArrayList<>();
	}
	
	

	@Override
	public void subscribers(Observer obsever) {
		observerlList.add(obsever);
		
	}

	@Override
	public void unsubscribers(Observer obsever) {
		observerlList.remove(obsever);
		
	}

	@Override
	public void notifyAllSubcribers() {
		for (Observer observer : observerlList) {
			observer.update(availibility);
			
		}
		
	} 

	public void availablty(boolean available) {
		
		availibility = this.name +( available ? "  is Available" : "  is Not Available");
		
		
		notifyAllSubcribers();
	}
	
	
	
}
