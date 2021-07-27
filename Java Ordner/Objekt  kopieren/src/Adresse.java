
public class Adresse implements Cloneable {
	
	private String strasse;
	private int hausNummer;
	private String stadt;
	
	private int plz;

	public Adresse(String strasse, int hausNummer, String stadt, int plz) {
		super();
		this.strasse = strasse;
		this.hausNummer = hausNummer;
		this.stadt = stadt;
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausNummer() {
		return hausNummer;
	}

	public void setHausNummer(int hausNummer) {
		this.hausNummer = hausNummer;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	
	@Override
	public Adresse clone() {
		
		try {
			return (Adresse)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	

}
