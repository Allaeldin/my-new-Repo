package klausurAufgaben;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Kontotabelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Map<Integer, Map<Integer, Integer>>> tabelleMap = new HashMap<>();

		Map<Integer, Map<Integer, Integer>> jahrBezeichnungK123 = new HashMap<>();
		Map<Integer, Map<Integer, Integer>> jahrBezeichnungK345 = new HashMap<>();
		Map<Integer, Map<Integer, Integer>> jahrBezeichnungK678 = new HashMap<>();
		Map<Integer, Integer> keyMonat2001 = new HashMap<>();
		keyMonat2001.put(1, 200);
		keyMonat2001.put(2, -3000);
		keyMonat2001.put(4, 100);
		keyMonat2001.put(7, 7000);

		Map<Integer, Integer> keyMonat2004 = new HashMap<>();

		keyMonat2004.put(2, 500);
		keyMonat2004.put(3, -2000);
		keyMonat2004.put(4, 3700);

		Map<Integer, Integer> keyMonat2012 = new HashMap<>();
		keyMonat2012.put(3, 4000);
		keyMonat2012.put(4, -100);
		keyMonat2012.put(7, -1000);
	
		Map<Integer, Integer> keyMonat2000 = new HashMap<>();
		keyMonat2000.put(2, 1000);
		keyMonat2000.put(4, -50);
		keyMonat2000.put(12, -50);
		Map<Integer, Integer> keyMonat200_1 = new HashMap<>();
		keyMonat200_1.put(2, 3443);
		keyMonat200_1.put(3, 1765);
		keyMonat200_1.put(4, 100);
		keyMonat200_1.put(8, -1000);
		Map<Integer, Integer> keyMonat20011 = new HashMap<>();
		keyMonat20011.put(3, 200);
		keyMonat20011.put(4, 100);
		keyMonat20011.put(5, 1000);
		keyMonat20011.put(6, -10000);
		Map<Integer, Integer> keyMonat2003 = new HashMap<>();
		keyMonat2003.put(2, 700);
		keyMonat2003.put(3, -700);
		keyMonat2003.put(4, 1000);
		keyMonat2003.put(11, -1000);
		Map<Integer, Integer> keyMonat200_4 = new HashMap<>();
		keyMonat200_4.put(1, 800);
		keyMonat200_4.put(2, 200);
		keyMonat200_4.put(5, 100);
		keyMonat200_4.put(7, 655);
		Map<Integer, Integer> keyMonat2006 = new HashMap<>();
		keyMonat2006.put(3, 900);
		keyMonat2006.put(7, 100);
		keyMonat2006.put(8, 10);

		jahrBezeichnungK123.put(2001, keyMonat2001);

		jahrBezeichnungK123.put(2004, keyMonat2004);
		jahrBezeichnungK123.put(2012, keyMonat2012);
		jahrBezeichnungK345.put(2000, keyMonat2000);
		jahrBezeichnungK345.put(2001, keyMonat200_1);
		jahrBezeichnungK345.put(2011, keyMonat20011);
		jahrBezeichnungK678.put(2003, keyMonat2003);
		jahrBezeichnungK678.put(2004, keyMonat200_4);
		jahrBezeichnungK678.put(2006, keyMonat2006);
		tabelleMap.put("k123", jahrBezeichnungK123);
		tabelleMap.put("k345", jahrBezeichnungK345);
		tabelleMap.put("k678", jahrBezeichnungK678);
//		Kontotabelle.konto_Mit_Umsatz_in(tabelleMap, 2004);
//		 Kontotabelle.konten_mit_umsatz_vor(tabelleMap, 2003);
//       Kontotabelle.umsatz_in_jahr(tabelleMap, 2004);
//		Kontotabelle.umsetze_fuer_konto(tabelleMap, jahrBezeichnungK345);
		
//		for (String string : Kontotabelle.konten_mit_umsatz(tabelleMap)) {
//			System.out.println(string);
//		}
		
		
		Kontotabelle.konto_mit_max_umsatz(tabelleMap);
	}
//	f
	public static void konto_mit_max_umsatz(Map<String, Map<Integer, Map<Integer, Integer>>> tab) {
		
		int summe =0;
		String[] array = new String[2];
		int index =0;
		int max = Integer.MIN_VALUE;
		for(String kontobezeichnung : tab.keySet() ) {
			
			for(Integer jahresbezeichnung : tab.get(kontobezeichnung).keySet() ) {
				
				for(Integer umsatzKey : tab.get(kontobezeichnung).get(jahresbezeichnung).keySet()) {
					
					int umsatzBetrag = tab.get(kontobezeichnung).get(jahresbezeichnung).get(umsatzKey);
					if (umsatzBetrag<0) {
						umsatzBetrag =umsatzBetrag*(-1);
						
					}
					
					summe =summe+umsatzBetrag;
					if (max<summe) {
						max = summe;
						array[0] = kontobezeichnung;
						array[1] = String.valueOf(max);
					}
					
					
				}
			}
			summe =0;
			
			
		}
		
		for (String string : array) {
			System.out.print(string+" ");
			
		}
		
	}
//	e
	public static String[] konten_mit_umsatz(Map<String, Map<Integer, Map<Integer, Integer>>> tab) {
		
		String[] array = new String[2];
		int summe = 0;
		
		for(String kontobezeichnung : tab.keySet() ) {
			
			for(Integer jahresbezeichnung : tab.get(kontobezeichnung).keySet() ) {
				
				for(Integer umsatzKey : tab.get(kontobezeichnung).get(jahresbezeichnung).keySet() ) {
					int umsatzBetrag = tab.get(kontobezeichnung).get(jahresbezeichnung).get(umsatzKey);
					if (umsatzBetrag<0) {
						umsatzBetrag = umsatzBetrag*(-1);
						
					}
					summe = summe +umsatzBetrag;
					
				}
				
			}
			
			String  summeString =String.valueOf(summe);
			summe =0;
			array[0]=kontobezeichnung;
			array[1] = summeString;
			
			
		}
		
		return array;
	}
//	d
	public static void umsetze_fuer_konto(Map<String, Map<Integer, Map<Integer, Integer>>> tab,Map<Integer, Map<Integer, Integer>>kto) {
		
		
		int summe = 0;
		for(Integer jahresbezeichnung : kto.keySet() ) {
			for(Integer umsatzKey: kto.get(jahresbezeichnung).keySet()) {
				int umsatzBetrag =  kto.get(jahresbezeichnung).get(umsatzKey);
				if (umsatzBetrag<0) {
					umsatzBetrag = umsatzBetrag*(-1);
				}
				summe = summe +umsatzBetrag;
				
				
			}
			
			
		}
		System.out.println(summe);
		
	}
//	c-
	public static void umsatz_in_jahr(Map<String, Map<Integer, Map<Integer, Integer>>> tab, int jahr) {
		int summe =0;
		
		for(String kontobezeichnung: tab.keySet() ) {
			
			for(Integer jahresbezeichnung:tab.get(kontobezeichnung).keySet() ) {
				
				if (jahresbezeichnung==jahr) {
					
					for(Integer umsatzKey: tab.get(kontobezeichnung).get(jahresbezeichnung).keySet()) {
						
						
						int umsatzBetrag = tab.get(kontobezeichnung).get(jahresbezeichnung).get(umsatzKey);
						if (umsatzBetrag<0) {
							umsatzBetrag = umsatzBetrag*(-1);
							
						}
						summe =summe+ umsatzBetrag;
						
						
						
					}
				}
				
				
				
			}
			
		}
		System.out.println(summe);
	}

//	b- 
	public static void konten_mit_umsatz_vor(Map<String, Map<Integer, Map<Integer, Integer>>> tab, int jahr) {

		Map<Integer, Set<String>> jahrUmsatz = new HashMap<>();
		Set<String> set = new HashSet<>();
		for (String kontobezeichnung : tab.keySet()) {

			for (Integer jahresbezeichnung : tab.get(kontobezeichnung).keySet()) {

				if (jahrUmsatz.containsKey(jahresbezeichnung)) {
					jahrUmsatz.get(jahresbezeichnung).add(kontobezeichnung);

				} else {
					jahrUmsatz.put(jahresbezeichnung, new HashSet<>());

					jahrUmsatz.get(jahresbezeichnung).add(kontobezeichnung);

				}

			}

		}

		for (Integer jahrbezeichnung : jahrUmsatz.keySet()) {
			if (jahrbezeichnung < jahr) {
				for (String kontobezeichnung : jahrUmsatz.get(jahrbezeichnung)) {

					set.add(kontobezeichnung);
				}

			}
		}

		System.out.println(set);

	}

//	a-
	public static void konto_Mit_Umsatz_in(Map<String, Map<Integer, Map<Integer, Integer>>> tab, int jahr) {

		Map<Integer, Set<String>> jahrUmsazt = new HashMap<>();

		for (String kotobezeichnung : tab.keySet()) {

			for (Integer jahrbezeichnung : tab.get(kotobezeichnung).keySet()) {

				if (jahrUmsazt.containsKey(jahrbezeichnung)) {
					jahrUmsazt.get(jahrbezeichnung).add(kotobezeichnung);
				} else {
					jahrUmsazt.put(jahrbezeichnung, new HashSet<>());
					jahrUmsazt.get(jahrbezeichnung).add(kotobezeichnung);
				}

			}

		}

		for (Integer key : jahrUmsazt.keySet()) {

			if (key == jahr) {
				System.out.println(jahrUmsazt.get(key));

			}

		}

	}

}
