
public class User {
	
	private String username;
	private String massnahme;
	private int alter;
	
	
	public User(String username, String massnahme, int alter) {
		super();
		this.username = username;
		this.massnahme = massnahme;
		this.alter = alter;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMassnahme() {
		return massnahme;
	}


	public void setMassnahme(String massnahme) {
		this.massnahme = massnahme;
	}


	public int getAlter() {
		return alter;
	}


	public void setAlter(int alter) {
		this.alter = alter;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Username: "+getUsername()+"\nAlter: "+getAlter()+"\nMaßnahme: "+getMassnahme();
	}

	
	
}
