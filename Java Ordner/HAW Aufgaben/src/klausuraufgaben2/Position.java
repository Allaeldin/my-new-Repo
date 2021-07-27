package klausuraufgaben2;

public class Position implements Comparable<Position> {
	
	
	private String produkt;
	private  int verkaufte_Anzahl;
	private  double einzelpreis;
	
	public Position(String produkt,int verkaufte_Anzahl,double einzelpreis) {
		
		this.produkt=produkt;
		this.verkaufte_Anzahl=verkaufte_Anzahl;
		this.einzelpreis =einzelpreis;
		
		
	}
	public String getProdukt() {
		return produkt;
	}
	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}
	public int getVerkaufte_Anzahl() {
		return verkaufte_Anzahl;
	}
	public void setVerkaufte_Anzahl(int verkaufte_Anzahl) {
		this.verkaufte_Anzahl = verkaufte_Anzahl;
	}
	public double getEinzelpreis() {
		return einzelpreis;
	}
	public void setEinzelpreis(double einzelpreis) {
		this.einzelpreis = einzelpreis;
	}

	public double getPreis() {
		
		
		return this.verkaufte_Anzahl*einzelpreis;
		
		
		
	}
	@Override
	public int compareTo(Position o) {
	     if (this.getPreis()>o.getPreis()) {
	    	 return 1;
			
		}
	     
	     if (this.getPreis()<o.getPreis()) {
	    	 return -1;
			
		}
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
	
		if (obj ==null) {
			return false;
			
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		if (this==obj) {
			return true;
			
		}
		
		Position other = (Position)obj;
		return this.produkt.equals(other.produkt) && this.verkaufte_Anzahl==other.verkaufte_Anzahl&&this.einzelpreis==other.einzelpreis;
	
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
