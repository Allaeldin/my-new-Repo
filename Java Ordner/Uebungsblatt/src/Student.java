
public class Student extends Person implements InAusbildung {
	
	
	String matrikelnummer;
	String studium;
	public Student(String name, String matrikelnummer, String studium) {
		super(name);
		this.matrikelnummer = matrikelnummer;
		this.studium =studium;	
	}

	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+ this.matrikelnummer;
	}





	@Override
	public String getAusbildung() {
		// TODO Auto-generated method stub
		return this.studium;
	}

}
