package Aufgabe2;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String...args) {
		
		ArrayList<Spieler> spielerList = new ArrayList<>();
		spielerList.add(new Spieler("walid", 0));
		spielerList.add(new Spieler("Ali", 20));
		spielerList.add(new Spieler("Mohamed", 165));
		spielerList.add(new Spieler("Khaled", 16));
		spielerList.add(new Spieler("Mohamed", 105));
		
		List<Spieler> list = Main.sortiere(spielerList);
		Main.ausgabe(list);
		
		
	}
	
	
	
	public static List<Spieler> sortiere(List<Spieler> list){
		
		Spieler tempSpieler ;
		
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = 0; j <list.size()-1; j++) {
				
				if((list.get(j).compareTo(list.get(j+1))) > 0    )  {
					tempSpieler = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tempSpieler);
					
					
				}
				
				
			}
			
		}
		
		
		
		return list;
	}

	
	
	public static void ausgabe(List<Spieler> spielers) {
		
		for (Spieler spieler : spielers) {
			System.out.println(spieler);
		}
		
		
	}
	
}
