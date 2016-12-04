
public class LKW extends Fahrzeug {
	private double nutzlast;	
	
	public LKW(String kennzeichen, double km, double kmTemp, boolean vermietet, double nutzlast) {
		super(kennzeichen, km, kmTemp, vermietet);
		this.nutzlast = nutzlast;
	}

	public double getLkwNutzlast() {return this.nutzlast;}
	
	public double rechnungsBetrag(int mietdauer) {
		if(this.getLkwNutzlast() < 1800) {
			return mietdauer * 50;
		} else {
			return mietdauer * 80;
		}
	}
	
	public boolean inspektionFällig() {
		if(this.getKmTemp() >= 20000) {
			return true;
		} else {
			return false;
		}
	}
	
}
