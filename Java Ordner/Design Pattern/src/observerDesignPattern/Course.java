package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
	
	private String name;
	private String avaibility;
	
	private List<Observer> observerslList ;
	
	public List<Observer> getObserverslList() {
		return observerslList;
	}

	

	public Course(String name) {
		this.name = name;
		
		observerslList = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		observerslList.add(observer);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		observerslList.remove(observer);
		
	}

	@Override
	public void notifyAllSubscribers() {
		for (Observer observer : observerslList) {
			
			observer.update(avaibility);
			
		}
		
	}
	
	public void setAvaiblity(boolean available) {
		
		avaibility = this.name +" Course"+ (available ? " is Available": " is Not Available");

		notifyAllSubscribers();
		
	}

}
