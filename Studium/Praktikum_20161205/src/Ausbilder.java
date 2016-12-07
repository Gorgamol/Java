
public class Ausbilder extends Mitarbeiter {

	private int einstellungsjahr;
	private int urlaubstage;
	
	public Ausbilder(String name, String vorname, int gehalt, int jahr, int urlaubstage) {
		super(name, vorname, gehalt);
		 this.einstellungsjahr = jahr;
		 this.urlaubstage = urlaubstage;
	}
	
	public int getEinstellungsjahr() {return this.einstellungsjahr;}
	public int urlaubstage() {return this.urlaubstage;}
	
	public String toString() {
		String _s = this.getName() + " ";
		_s += this.getVorname();
		_s += ", Gehalt: " + this.getGehalt();
		_s += ", Einstellungsjahr: " + this.einstellungsjahr;
		_s += ", Urlaubstage: " + this.urlaubstage;
		return "Ausbilder";
	}
	
}
