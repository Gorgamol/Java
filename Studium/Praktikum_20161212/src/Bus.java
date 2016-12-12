
public class Bus extends Fahrzeug{
	private int sitzplätze;
	
	public Bus(String kennzeichen, int sitzplätze) {
		super(kennzeichen);
		this.sitzplätze = sitzplätze;
	}
	
	public double getSitzplätze() {return this.sitzplätze;}
	
	public double berechneSteuer() {
		return 800.00 + (this.getSitzplätze() * 5);
	}

	public boolean equals(Object o) {
		if(o instanceof Bus) {
			if(((Bus)o).getKennzeichen() == this.getKennzeichen()) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "Bus - [" + this.getKennzeichen() + "] | Nutzlast - [" + this.getSitzplätze() + "]";
	}
}
