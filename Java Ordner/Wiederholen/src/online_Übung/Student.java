package online_Übung;

public class Student implements Comparable {
	
	String name;
    String vorname;
    int matrikelNr;
    int semester;
    
    public Student(String name, String vorname, int matrikelNr, int semester) {
		this.name = name;
		this.vorname = vorname;
		this.matrikelNr = matrikelNr;
		this.semester = semester;
	}
    
    
    
	@Override
	public int compareTo(Object  o) {
		int diff = 0;
		
		if (this.getClass() == o.getClass()) {
			
			diff = this.matrikelNr - ((Student) o).matrikelNr;
			
		}
		
		
		if (diff<0) {
			
			diff = -1;
		}
		
		
		if (diff>0) {
			
			diff =1;
		}
		
		return diff;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MatrikelNr: "+this.matrikelNr+ " "+this.name+" "+this.vorname+" Semester "+this.semester;
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return    ( this.compareTo(obj)==0);
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.matrikelNr;
	}
	
	
	
	

}
