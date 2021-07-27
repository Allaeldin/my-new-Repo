
public class HashTableBeispiel {
	
	
	
	
	public static  void caculateIndex(String name) {
		
		Character character1 = name.charAt(0);
		Character character2 = name.charAt(1);
		Character character3 = name.charAt(2);
		
		System.out.println(character1+" "+character2+ " "+character3);
		
		int ascii1 = (int) character1;
		int ascii2 = (int) character2;
		int ascii3 = (int) character3;
		int summe = ascii1 + ascii2 + ascii3;
		int index = summe %11;
		System.out.println("Der Index : "+index);
		
		
		
	}
	
	
	
	
	public static void main(String...args) {
		
		HashTableBeispiel.caculateIndex("Leo");
		
		
		
	}
	
	
	
	

}
