package linkedListExample;

public class PersonnList {
	
	Person firstPerson;
	
	
	
	
	public PersonnList(Person firstPerson) {
		super();
		this.firstPerson = firstPerson;
		
	}
	
	
	public void add(Person newPerson) {
		
		Person lastPerson  = getLastPerson();
		lastPerson.setNextPerson(newPerson);
		
	}
	
	
	
	
	
	
	public Person getLastPerson() {
		
		Person currentPerson = firstPerson;
		
		while (currentPerson.nextPerson!= null) {
			currentPerson = currentPerson.nextPerson;
		}
		
		return currentPerson;
		
	}
	
	
	
	public boolean search(String name) {
		
		Person currentPerson  = firstPerson;
		int pos = 1;
		
		while (currentPerson.nextPerson != null) {
			
			if(currentPerson.username.equals(name)) {
				System.out.println("Person "+ name + " wurde gefunden  an der Position "+pos);
				return true;
			}else {
				currentPerson = currentPerson.nextPerson;
			}
			pos++;
			
		}
		return false;
		
		
	}
	
	public void ausgeben() {
		
		Person currentPerson = firstPerson;
		
		while (currentPerson.nextPerson!= null) {
			
			System.out.println(  currentPerson.kindUser +":" +  currentPerson.username);
			
			currentPerson = currentPerson.nextPerson;
			
		}
		
		
		
	}
	
	public void  remove(String name) {
		
	
		Person currentPerson = firstPerson;
		
		
		while(currentPerson.getNextPerson()!= null && !( currentPerson.getUsername().equals(name))) {
			
			
			if (currentPerson.getNextPerson().getUsername().equals(name)) {
				if (currentPerson.getNextPerson().getNextPerson() !=null) {
					
					currentPerson.setNextPerson(currentPerson.getNextPerson().getNextPerson());
					
				}else {
					
					currentPerson.setNextPerson(null);
				}
				
			}
			
			currentPerson = currentPerson.getNextPerson();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Person person1 = new Person("Admin", "laura");
		Person person2 = new Person("user", "Alla");
		Person person3 = new Person("user", "Mohamed");
		Person person4 = new Person("user", "Ali");
		Person person5 = new Person("user", "Ahmed");
		
	
		PersonnList list = new PersonnList(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		
		
		
		list.ausgeben();
		System.out.println("--------------------");
		list.remove("Alla");

		list.ausgeben();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	





	
	









































}
