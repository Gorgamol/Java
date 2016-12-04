
public class PKW extends Fahrzeug{

	public PKW(String kennzeichen, double km, double kmTemp, boolean vermietet) {
		super(kennzeichen, km, kmTemp, vermietet);
	}
	
	public double rechnungsBetrag(int mietdauer) {
		return mietdauer * 30;
	}
	
	public boolean inspektionFällig() {
		if(this.getKmTemp() >= 30000) {
			return true;
		} else {
			return false;
		}
	}
}
