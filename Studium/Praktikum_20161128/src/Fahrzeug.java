
public abstract class Fahrzeug {
	private String kennzeichen;
	private double km;
	private double kmTemp;
	private boolean vermietet;
	
	public Fahrzeug(String kennzeichen, double km, double kmTemp, boolean vermietet) {
		this.kennzeichen = kennzeichen;
		this.km = km;
		this.kmTemp = kmTemp;
		this.vermietet = vermietet;
		System.out.println("Super()");
	}

	public String getKennzeichen(){return this.kennzeichen;}
	public double getKm(){return this.km;}
	public double getKmTemp(){return this.kmTemp;}
	public boolean getVermietet(){return this.vermietet;}
	
	public abstract double getNutzlast();
}
