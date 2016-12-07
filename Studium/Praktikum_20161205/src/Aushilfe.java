
public class Aushilfe extends Mitarbeiter {

	private int arbeitszeit;
	
	public Aushilfe(String name, String vorname, int gehalt, int arbeitszeit) {
		super(name, vorname, gehalt);
		this.arbeitszeit = arbeitszeit;
	}
	
	public int getArbeitszeit() {return this.arbeitszeit;}
	
	public String toString() {
		String _s = "Aushilfe";
		return _s;
	}
	
}
