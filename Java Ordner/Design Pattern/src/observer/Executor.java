package observer;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student malik = new Student("Malik");
		Student sami = new Student("Sami");
		Student rami = new Student("Rami");
		Student mohamed = new Student("Mohamed");
		
		Course javaCourse = new Course("Java Course");

		javaCourse.subscribe(mohamed);
		javaCourse.subscribe(sami);
		javaCourse.subscribe(rami);
		javaCourse.subscribe(malik);
		
		javaCourse.setAvaibility(false);
		
		
		
		
		
		
		
	}

}
