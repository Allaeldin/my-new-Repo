
import java.util.ArrayList;

public class Receipt {
	
	
	ArrayList<ReceiptItem> list = new ArrayList<>();
	
	
	public boolean add(String produkt, int anzahl, double preis) {
		if (preis<=0) {
			System.err.println("Bitte geben Sie Preis großer als 0");
			return false;
		}
		ReceiptItem item = new ReceiptItem(produkt, anzahl, preis);
		list.add(item);
		return true;
		
		
	}
	
	
	
	
	public double rechnen() {
		
		double summe=0;
		
		for (int i = 0; i < list.size(); i++) {
			
		summe = summe +(list.get(i).getAnzahl() *	list.get(i).getPreis());
			
			
			
		}
		return summe;
		
		
		
	}
	
	
	public void print() {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------");
		System.out.println("Die Summe EUR: "+rechnen());
		System.out.println("------------");
		
	}

}
