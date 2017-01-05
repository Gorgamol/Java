
public class Ticket {
	private String datum;
	private int personen;
	private Preis preis;
	private String strecke;
	
	public Ticket() {
		preis = new Preis();
	}
	
	public void setDatum(String datum) {this.datum = datum;}
	
	public void setPersonen(int personen) {this.personen = personen;}

	public void setStrecke(String strecke) {this.strecke = strecke;}
	
	public String toString() {
		String s = "\n\n --------------------------------------- ";
		s += "\n| [TICKET] - Datum [22.22.1234]\t\t|";
		s += "\n|---------------------------------------|";
		s += "\n| Personen: " + this.personen + "\t\t\t\t|";
		s += "\n| " + this.strecke + "\t|";
		s += "\n| Preis: 2222 € \t\t\t|";
		s += "\n --------------------------------------- ";
		return s;
	}
}
