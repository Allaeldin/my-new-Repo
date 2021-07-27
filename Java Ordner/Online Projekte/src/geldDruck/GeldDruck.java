package geldDruck;

import java.util.Scanner;

public class GeldDruck {

	
	public final static int FUENFHUNDERTWERT =500;
	public final static int ZWEIHUNDERTWERT = 200;
	public final static int HUNDERTERWERT = 100;
	public final static int FUENFZIGERWERT = 50;
	public final static int ZWANZIGERWERT = 20;
	public final static int ZEHNERWERT = 10;
	public final static int FUNFWERT = 5;
	
	int fuenfhunder =0;
	int zweihunder=0;
	int hunderter = 0;
	int fuenfziger = 0;
	int zwanziger = 0;
	int zehner = 0;	
	int funf =0;
	int ausgezahlt =  0;
	public void druckeGeld() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen ganzzahligen Betrag  ein");
		
		int auszahlBetrag = scanner.nextInt();
		fuenfhunder =auszahlBetrag/FUENFHUNDERTWERT;
		ausgezahlt+=fuenfhunder*FUENFHUNDERTWERT;
		zweihunder = (auszahlBetrag-ausgezahlt)/ZWEIHUNDERTWERT;
		ausgezahlt+=zweihunder*ZWEIHUNDERTWERT;
		
		hunderter = (auszahlBetrag-ausgezahlt) / HUNDERTERWERT;
		
		ausgezahlt += hunderter * HUNDERTERWERT;
		System.out.println(ausgezahlt);
		fuenfziger = (auszahlBetrag - ausgezahlt) / FUENFZIGERWERT;
		System.out.println(fuenfziger);
		ausgezahlt += fuenfziger * FUENFZIGERWERT;
		zwanziger = (auszahlBetrag - ausgezahlt) / ZWANZIGERWERT;
		ausgezahlt += zwanziger * ZWANZIGERWERT;
		zehner = (auszahlBetrag - ausgezahlt) / ZEHNERWERT;
		
		ausgezahlt += zehner * ZEHNERWERT;
		
		funf =  (auszahlBetrag-ausgezahlt)/FUNFWERT;
		
		System.out.println();
		System.out.println("Sie erhalten:");
		System.out.println("\t"+fuenfhunder+" x 500€");
		System.out.println("\t"+zweihunder+" x 200 €");
		System.out.println("\t" + hunderter + " x 100 €");
		System.out.println("\t" + fuenfziger + " x 50 €");
		System.out.println("\t" + zwanziger + " x 20 €");
		System.out.println("\t" + zehner + " x 10 €");
		System.out.println("\t" + funf + "X 5 €");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
