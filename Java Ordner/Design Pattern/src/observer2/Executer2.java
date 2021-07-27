package observer2;

public class Executer2 {

	public static void main(String[] args) {
		
		Student malik = new Student("Malik");
		Student mohamed = new Student("Mohamed");
		Student rami = new Student("Rami");
		Student sami = new Student("Sami");
		
		
		
		Course java = new  Course("Java Course");
		
 java.subscribers(sami);
 java.subscribers(rami);
 java.subscribers(mohamed);
 java.subscribers(malik);
 
 
 java.availablty(false);;
 
	}

}
