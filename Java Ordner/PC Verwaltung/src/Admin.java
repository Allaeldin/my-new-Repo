import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.kerberos.KerberosKey;

public class Admin {

   Map<PC, User> list;
   
   int size=0;

	public Admin() {
		super();
	list = new HashMap<>();
	}
	
	
	
	
	public boolean addUser(User user) {
		
		if(!list.isEmpty()) {
		
		if (size>3) {
			System.out.println("Der PC Pool ist voll");
			return false;
		}
		
		for(PC key: list.keySet()) {
			if (list.get(key)==null) {

				list.put(key, user);
				size++;
				
				
				//System.out.println(user.getUsername() +" wurde erfolgreich hinzugefügt");
				return true;
			}
			
		}
		
		}else {
			System.err.println("Der PC pool ist Leer .\nSie sollen mindesten einen PC einfügen");
			
			return false;
		}
		
		return false;
		
	}
	
	
	public void delete(User user) {
		
		for (PC entry :list.keySet()) {
			
			if(list.get(entry).equals(user)) {
				list.put(entry, null);
				size--;
				System.out.println("Der PC nummer :"+entry.getPcNummer() +" ist frei");
				
				
			}
		}
	}
	
	public void freiePCS() {
		int count =0;
		for(PC key:list.keySet()) {
			
			if(!list.isEmpty()&& list.get(key)==null) {
				count++;		
			}
			
		}
		
		if (count!=0 && count>1) {
			System.out.println(count+" PCs sind frei");
		}else if (count==1) {
			System.out.println(count+" PC ist  frei");
		
		}else {
			System.out.println("alle PCs sind besitzt");
		}
		
	}
	
	public void addPC(PC pc) {
		
		list.put(pc, null);
		
		
	}
	
	public void allePCausgeben() {
		
		for(PC pc:list.keySet()) {
			
			if (list.get(pc)!=null) {
				
		
			System.out.print( pc+"    ");
			System.out.println(list.get(pc));
			System.out.println();
			
		
				
			
			
		}
		
	}
	
	
	}
	
	
	public void pcInfo(PC pc) {
		
		if (list.get(pc)!=null && list.containsKey(pc)) {
			
			System.out.print(pc+" ");
			System.out.println(list.get(pc));
		}else if (!list.containsKey(pc)) {
	    System.out.println("Der "+pc.getPcNummer()+ " ist nicht registriert");
		}else {
			System.out.println(pc.getPcNummer()+" ist frei");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
