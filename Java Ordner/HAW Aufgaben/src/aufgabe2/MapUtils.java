package aufgabe2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUtils {
	
	
	
//	m1 = {0=3,1=4, 2=5, 3=6}
//	m2 = {1=4, 2=5, 3=6, 4=4, 5=5}
	public static void main(String[] args) {
		
		
		Map<Integer,Integer> m1 = new HashMap<>();
		 Map<Integer, Integer> m2 = new HashMap<>();
		 Map<Integer, Integer> m3;
		 Map<Integer, Set<Integer>>m4;
		
		m1.put(0, 3);
		m1.put(1, 4);
		m1.put(2, 5);
		m1.put(3, 6);
		
//		m2.put(1, 4);
//		m2.put(2, 5);
//		m2.put(3, 6);
//		m2.put(4, 4);
//		m2.put(5, 5);
//		
//		m3 = MapUtils.intersect(m1, m2);
//		
//		System.out.print("{");
//		
//		for(Integer key : m3.keySet()) {
//			System.out.print(  key+ "="  + m3.get(key)+ " ,");
//			
//		}
//		System.out.println("}");
		
		
//		m1={0=3, 1=4, 2=5, 3=6}
//		m2={1=6, 2=12, 3=15, 4=5, 5=9}
//		liefert {1=[4, 6], 2=[5, 12], 3=[6, 15]}
	
		m2.put(1, 6);
		m2.put(2, 12);
		m2.put(3, 15);
		m2.put(4, 5);
		m2.put(5, 9);
		
		m4 = MapUtils.intersectJoinValues(m1, m2);
		System.out.print("{ ");
		
		for(Integer key : m4.keySet()) {
			System.out.print(key + "="+ m4.get(key)+",");
			
			
		}
		
		
		System.out.println("}");
		
		
		
		
	}
	
	
	
//	m1={0=3, 1=4, 2=5, 3=6}
//	m2={1=6, 2=12, 3=15, 4=5, 5=9}
//	liefert {1=[4, 6], 2=[5, 12], 3=[6, 15]}
	
	
	public static Map<Integer, Set<Integer>> intersectJoinValues(Map<Integer,Integer> m1, Map<Integer,Integer> m2){
		Map<Integer, Set<Integer>> m3 = new HashMap<>();
	
		
	    for(Integer key : m1.keySet()) {
	    	if (m1.get(key)!=null && m2.get(key)!=null) {
	    		Set<Integer> set = new HashSet<>();
	    		set.add(m1.get(key));
	    		set.add(m2.get(key));
	    		m3.put(key, set);
			}
	    	
	    	
	    }
		
		
		
		return m3;
	}
	
	
	public static Map<Integer,Integer> intersect(Map<Integer,Integer> m1, Map<Integer, Integer> m2){
		
		Map<Integer,Integer> m3 = new  HashMap<>();
		
		for (Integer keyM1 : m1.keySet()) {
			
		
			if (m2.get(keyM1) == m1.get(keyM1)) {
				
				m3.put(keyM1, m1.get(keyM1));
			}
			
			
			
			
		}
		
		return m3;
	}

}
