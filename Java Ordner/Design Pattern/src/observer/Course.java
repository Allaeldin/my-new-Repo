package observer;

import java.util.ArrayList;
import java.util.List;





public class Course implements Subject {
String name;
String availability;
List<Observer> observerList;
public Course(String name) {
	
	this.name = name;
	observerList = new ArrayList<>();
}

@Override
public void subscribe(Observer observer) {
observerList.add(observer);
	
}

@Override
public void unsubscribe(Observer observer) {
observerList.remove(observer);
	
}

@Override
public void notifyallSubscribers() {
	for(Observer observer : observerList) {
		
		observer.update(availability);
		
		
	}
	
	
	
	
}


public void setAvaibility(boolean available) {
	
	availability = this.name + (available? " Available" :  " Not Available");
	
	notifyallSubscribers();
	
	
}












}
