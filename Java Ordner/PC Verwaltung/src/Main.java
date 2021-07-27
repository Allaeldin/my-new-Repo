
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PC pc1 = new PC("PC1");
		PC pc2 = new PC("PC2");
		PC pc3 = new PC("PC3");
		PC pc4 = new PC("PC4");
		PC pc5 = new PC("PC5");
		PC pc6 = new PC("PC6");
		
		User user1 = new User("Muller", "Primio", 20);
		User user2 = new User("Tomas", "Reha", 29);
		User user3 = new User("Lane", "Vario", 27);
		User user4 = new User("Laurar", "Primio", 33);
		User user5 = new User("Ali", "Primio", 31);
		User user6 = new User("Allar", "Primio", 31);
		
		
		Admin admin = new Admin();
		admin.addPC(pc1);
		admin.addPC(pc2);
		admin.addPC(pc5);
		admin.addPC(pc6);
		
		admin.addUser( user1);
		admin.addUser( user2);
		admin.addUser( user3);
		admin.addUser(user4);
	    System.out.println("------------------");
    	admin.allePCausgeben();
		System.out.println("------------------------");
		admin.delete(user4);
		
		admin.addUser(user5);
		
		admin.freiePCS();
		
		
		
	}

}
