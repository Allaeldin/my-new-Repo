package observer2;

public class Student implements Observer {
	
	String name;
	
 public Student(String name) {
		this.name = name;
	}

	@Override
	public void update(String messsage) {
		
		System.out.println(this.name+ " has new notification  :"+ messsage);
		
	}

}
