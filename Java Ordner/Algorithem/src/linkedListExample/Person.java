package linkedListExample;

public class Person {
	
	String kindUser;
	String username;
	Person  nextPerson;
	
	
	
	public Person(String kindUser, String username) {
		super();
		this.kindUser = kindUser;
		this.username = username;
		nextPerson = null;
	}
	public String getKindUser() {
		return kindUser;
	}
	public void setKindUser(String kindUser) {
		this.kindUser = kindUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Person getNextPerson() {
		return nextPerson;
	}
	public void setNextPerson(Person nextPerson) {
		this.nextPerson = nextPerson;
	}
	

}
