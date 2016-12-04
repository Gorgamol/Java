
public class LKW extends Fahrzeug {
	private double nutzlast;	
	
	public LKW(String kennzeichen, double km, double kmTemp, boolean vermietet, double nutzlast) {
		super(kennzeichen, km, kmTemp, vermietet);
		this.nutzlast = nutzlast;
	}

	public double getNutzlast() {return this.nutzlast;}
}
