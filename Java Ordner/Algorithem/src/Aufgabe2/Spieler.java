package Aufgabe2;
public class Spieler implements Comparable<Spieler> {
	 
    private String name;
    private int groe�e;
 
    public Spieler(String name, int groe�e) {
        this.name = name;
        this.groe�e = groe�e;
    }
 
    public String getName() {
        return name;
    }
 
    public int getGroe�e() {
        return groe�e;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setGroe�e(int groe�e) {
        this.groe�e = groe�e;
    }

	@Override
	public int compareTo(Spieler o) {
	
		if(groe�e >  o.groe�e)
		return 1;
		if (groe�e < o.groe�e) 
			return -1;
		if(groe�e == o.groe�e)
			return 0;
	
		
		
		return 0;
	}

	@Override
	public String toString() {
		return "Spielername=" + name + "\n Groe�e=" + groe�e ;
	}
	
	

}