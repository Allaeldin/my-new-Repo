
public class ReceiptItem {
	
	private  String produkt;
	private int anzahl;
	private double preis;
	
	
	public ReceiptItem(String produkt, int anzahl, double preis) {
		super();
		this.produkt = produkt;
		this.anzahl = anzahl;
		setPreis(preis);
	}


	public String getProdukt() {
		return produkt;
	}


	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}


	public int getAnzahl() {
		return anzahl;
	}


	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}


	public double getPreis() {
		return preis;
	}


	public void setPreis(double preis) {
		
		if (preis<0) {
			System.out.println("Der Preis kann nicht Nigativ werden");
			
		}else {
			
			this.preis = preis;
		}
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getProdukt()+"\n"+getAnzahl()+" X "+getPreis()+"\n";
		
	}
	
	
	

}
