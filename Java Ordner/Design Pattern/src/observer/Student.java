package observer;

public class Student implements Observer {
	
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(this.name+" has new Notification "+message);
		
	}

}
