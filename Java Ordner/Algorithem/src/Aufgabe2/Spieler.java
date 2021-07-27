package Aufgabe2;
public class Spieler implements Comparable<Spieler> {
	 
    private String name;
    private int groeﬂe;
 
    public Spieler(String name, int groeﬂe) {
        this.name = name;
        this.groeﬂe = groeﬂe;
    }
 
    public String getName() {
        return name;
    }
 
    public int getGroeﬂe() {
        return groeﬂe;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setGroeﬂe(int groeﬂe) {
        this.groeﬂe = groeﬂe;
    }

	@Override
	public int compareTo(Spieler o) {
	
		if(groeﬂe >  o.groeﬂe)
		return 1;
		if (groeﬂe < o.groeﬂe) 
			return -1;
		if(groeﬂe == o.groeﬂe)
			return 0;
	
		
		
		return 0;
	}

	@Override
	public String toString() {
		return "Spielername=" + name + "\n Groeﬂe=" + groeﬂe ;
	}
	
	

}