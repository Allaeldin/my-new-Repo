package classenSortieren;

public class Person implements Comparable<Person> {
String name;
String vorname;
int alter;
int  telNr;
long plz;



public Person(String name, String vorname, int alter, int telNr, long plz) {
	super();
	this.name = name;
	this.vorname = vorname;
	this.alter = alter;
	this.telNr = telNr;
	this.plz = plz;
}



public String getVorname() {
	return vorname;
}



public void setVorname(String vorname) {
	this.vorname = vorname;
}



public int getAlter() {
	return alter;
}



public void setAlter(int alter) {
	this.alter = alter;
}



@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
	return vorname.compareTo(o.vorname);
}



}
