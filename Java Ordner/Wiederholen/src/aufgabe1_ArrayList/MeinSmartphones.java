package aufgabe1_ArrayList;

public class MeinSmartphones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Smartphone iPhone6 = new Smartphone();
		iPhone6.addKontakt(Kontakt.erstelle("Alla", "190890129"));
		iPhone6.addKontakt(Kontakt.erstelle("Sami", "017746321"));
		iPhone6.addKontakt(Kontakt.erstelle("Rami", "019906432"));
		iPhone6.addKontakt(Kontakt.erstelle("Adel", "018998953"));
		
		Kontakt alla = new Kontakt("Alla", "190890129");
		iPhone6.ausgabe();
		iPhone6.addKontakt(alla);
		iPhone6.findKontakt("Sami");
		
		
		
		
		
		
		

	}

}
