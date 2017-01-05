
public class Datenbank {
	private String streckenName;
	private double entfernung;
	private double dauer;
	private double preis;
	
	public Datenbank(String name, double entfernung, double dauer, double preis) {
		this.streckenName = name;
		this.entfernung = entfernung;
		this.dauer = dauer;
		this.preis = preis;
	}
	
	public String getName() {return this.streckenName;}
	
	public double getPreis() {return this.preis;}
	
	public String toString(String standort) {
		return "Von: " + standort + " - Nach: " + this.streckenName + "\t\t|\n| Entfernung: " + this.entfernung + " km\tDauer " + dauer + " Std";
	}

}
