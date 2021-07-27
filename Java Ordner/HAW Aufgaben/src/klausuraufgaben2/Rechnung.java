package klausuraufgaben2;

import java.util.ArrayList;
import java.util.List;

public class Rechnung implements Comparable<Rechnung>{
	
	
	List<Position> positionsList ;
	public static int nummer=0;
	
	public Rechnung() {
		
		positionsList = new  ArrayList<Position>();
		
		nummer +=1;
		
	}
	
	
	
	public double rechnungs_Betrag() {
		double summe=0;
		
		for(Position position : positionsList) {
			
			summe =summe+position.getPreis();
			
			
		}
		return summe;
		
	}



	@Override
	public int compareTo(Rechnung o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
