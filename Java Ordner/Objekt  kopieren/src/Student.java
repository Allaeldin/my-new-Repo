
public class Student implements Cloneable {

	private String name;
	private int alter;
	private int matrikelnummer;
	private Adresse adresse;
	
	public Student(String name, int alter, int matrikelnummer, Adresse adresse) {
		super();
		this.name = name;
		this.alter = alter;
		this.matrikelnummer = matrikelnummer;
		this.adresse = adresse;
				
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public Student clone() {
		try {
			
			Student student  = (Student)super.clone();
			Adresse d = (Adresse) adresse.clone();
			student.adresse=d;
			return student; 
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
