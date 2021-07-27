public class Film {
	
	private String title;
	private int erscheinungsJahr;
	private double rat;
	
	public double getRat() {
		return rat;
	}

	public void setRat(double rat) {
		this.rat = rat;
	}

	public Film(String title, int erscheinungsJahr, double rating) {
		this.title = title;
		this.erscheinungsJahr = erscheinungsJahr;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getErscheinungsJahr() {
		return erscheinungsJahr;
	}
	public void setErscheinungsJahr(int erscheinungsJahr) {
		this.erscheinungsJahr = erscheinungsJahr;
	}
	
	

}