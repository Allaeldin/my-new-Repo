package beispiel7_2;

public class Dienstwagen extends Fahrzeug implements PrivateNutzung{
	private String dienstnehmer;
	private double privatfahrten =0 ;
	private double summe =0;
	
	public Dienstwagen(int nummer, String dienstnehmer) {
		super(nummer);
		this.dienstnehmer = dienstnehmer;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String nummerString = String.valueOf(nummer);
		String kilometerstandString = String.valueOf(super.getKilometerstand());
		return nummerString+" "+this.dienstnehmer+" "+kilometerstandString;
	}

	@Override
	public void fahrePrivat(double anzahlKilometer) {
		this.privatfahrten =anzahlKilometer;
		
	}

	@Override
	public double getSummePrivatfahrten() {
		this.summe += privatfahrten;
		return summe;
	}
	
	
	

}
