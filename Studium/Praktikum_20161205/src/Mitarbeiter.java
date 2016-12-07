
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
	
	public boolean equals(Mitarbeiter ma) {
		if(this.name == ma.getName() && this.vorname == ma.getVorname()) {
			return true;
		}
		return false;
	}
		
	
	public abstract String toString();
}
