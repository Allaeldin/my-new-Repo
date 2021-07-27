package allgemeine_Sortiere_Aufgabe;

public class Film implements Comparable<Film> {

	private String title;
	private int erscheinungsJahr;
	private double rating;
	
	public Film(String title, int erscheinungsJahr,double rating) {
		this.title = title;
		this.erscheinungsJahr = erscheinungsJahr;
		this.rating = rating;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title+"  "+this.erscheinungsJahr+" "+this.rating;
	}

	@Override
	public int compareTo(Film o) {
		// TODO Auto-generated method stub
		if (this.erscheinungsJahr> o.erscheinungsJahr) {
			
			return -1;
			
		}else if (this.erscheinungsJahr< o.erscheinungsJahr) {
			return 1;
		}else {
			
			return 0;
		}
		
		
	}
}