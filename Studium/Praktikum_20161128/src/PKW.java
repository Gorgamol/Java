
public class PKW extends Fahrzeug{

	public PKW(String kennzeichen, double km, double kmTemp, boolean vermietet) {
		super(kennzeichen, km, kmTemp, vermietet);
	}

	public double getNutzlast() {return 0;}
}
