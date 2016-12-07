
public class Auszubildender  extends Mitarbeiter {

	private String ausbildungsBeruf;
	private int ausbildungsJahr;
	
	public Auszubildender(String name, String vorname, int gehalt, String ausbildungsBeruf, int ausbildungsJahr) {
		super(name, vorname, gehalt);
		this.ausbildungsBeruf = ausbildungsBeruf;
		this.ausbildungsJahr = ausbildungsJahr;
	}
	
	public String getAusbildungsBeruf() {return this.ausbildungsBeruf;}
	public int getAusbildungsJahr() {return this.ausbildungsJahr;}
	
	public String toString() {
		String _s = "Auszubildender";
		return _s;
	}
	
}
