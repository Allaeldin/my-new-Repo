
public class PC {

	private String pcNummer;
	
	

	public PC(String pcNummer) {
		super();
		this.pcNummer = pcNummer;
	}
	
	
	

	public String getPcNummer() {
		return pcNummer;
	}

	public void setPcNummer(String pcNummer) {
		this.pcNummer = pcNummer;
	}




	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		PC other = (PC)obj;
		return this.getPcNummer()==other.getPcNummer();
		
	}




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PC Nummer: "+getPcNummer();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
