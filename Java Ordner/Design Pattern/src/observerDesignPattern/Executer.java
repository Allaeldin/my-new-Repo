package observerDesignPattern;

public class Executer {

	public static void main(String[] args) {
		
		Student rami = new Student("Rami");
		Student ali= new Student("Ali");
		Student sami= new Student("Sami");
		Student malik = new Student("Malik");
	
		
		Course javaCourse = new Course("Java");
		
		javaCourse.subscribe(rami);
		javaCourse.subscribe(ali);
		javaCourse.subscribe(sami);
		javaCourse.subscribe(malik);
		//javaCourse.unsubscribe(malik);
		
		
//		
//		if ((javaCourse.getObserverslList().size()%2)==0) {
//			
//			javaCourse.setAvaiblity(true);
//		}else {
//			javaCourse.setAvaiblity(false);
//		}
//		
		
		Channel teluscoChannel  =  new Channel();
		Subscribers sub1 = new  Subscribers("Alla");
		Subscribers sub2 = new  Subscribers("Surish");
		Subscribers sub3 = new  Subscribers("Mahish");
		Subscribers sub4 = new  Subscribers("Navin");
		Subscribers sub5 = new  Subscribers("Ali");
		teluscoChannel.subscriber(sub5);
		teluscoChannel.subscriber(sub4);
		teluscoChannel.subscriber(sub3);
		teluscoChannel.subscriber(sub2);
		teluscoChannel.subscriber(sub1);
		teluscoChannel.Upload("How to learn Programming");

	}

}
