
public abstract class Mitarbeiter {
	private String name;
	private String vorname;
	private int gehalt;
	
	public Mitarbeiter(String name, String vorname, int gehalt) {
		this.name = name;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}
	
	public String getName() {return this.name;}
	public String getVorname() {return this.vorname;}
	public int getGehalt() {return this.gehalt;}
	
	public abstract String toString();
	public abstract boolean equals();

}
