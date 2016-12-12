
public class LKW extends Fahrzeug{
	private double nutzlast;	
	
	public LKW(String kennzeichen, double nutzlast) {
		super(kennzeichen);
		this.nutzlast = nutzlast;
	}
	
	public double getNutzlast() {return this.nutzlast;}
	
	public double berechneSteuer() {
		return 500.00 + (this.getNutzlast() * 10);
	}

	public boolean equals(Object o) {
		if(o instanceof LKW) {
			if(((LKW)o).getKennzeichen() == this.getKennzeichen()) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "LKW - [" + this.getKennzeichen() + "] | Nutzlast - [" + this.getNutzlast() + "]";
	}
}
