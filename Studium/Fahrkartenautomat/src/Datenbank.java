
public class Datenbank {
	private String streckenName;
	private double entfernung;
	private double dauer;
	
	public Datenbank(String name, double entfernung, double dauer) {
		this.streckenName = name;
		this.entfernung = entfernung;
		this.dauer = dauer;
	}
	
	public String getName() {return this.streckenName;}
	
	public String toString(String standort) {
		return "Von: " + standort + " - Nach: " + this.streckenName + "\t\t|\n| Entfernung: " + this.entfernung + " km\tDauer " + dauer + " Std";
	}

}
