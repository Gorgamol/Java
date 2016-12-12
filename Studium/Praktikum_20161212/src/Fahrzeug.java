
public abstract class Fahrzeug {
	
	private String kennzeichen;
	
	public Fahrzeug(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	
	public String getKennzeichen() {return this.kennzeichen;}
	
	public abstract double berechneSteuer();
	
	public abstract boolean equals(Object o);
	
	public abstract String toString();
}
