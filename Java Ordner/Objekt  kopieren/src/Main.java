
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Adresse adresse1 = new Adresse("Herrenstraße", 32," Harsefeld", 21698);
		Adresse adresse2 = new Adresse("Bansenstraße", 7, "Hamburg", 21075);

		Student student1 = new Student("Alla", 31, 623864, adresse1);
 
		Student student2 = student1.clone();
	
		student2.getAdresse().setStadt("Hamburg");
		

		System.out.println(student1.getAdresse().getStadt());
		System.out.println(student2.getAdresse().getStadt());
		
		
		
		
		
		
		
		
		
	}

}
