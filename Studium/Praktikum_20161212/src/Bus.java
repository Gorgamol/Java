
public class Bus extends Fahrzeug{
	private int sitzpl�tze;
	
	public Bus(String kennzeichen, int sitzpl�tze) {
		super(kennzeichen);
		this.sitzpl�tze = sitzpl�tze;
	}
	
	public double getSitzpl�tze() {return this.sitzpl�tze;}
	
	public double berechneSteuer() {
		return 800.00 + (this.getSitzpl�tze() * 5);
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
		return "Bus - [" + this.getKennzeichen() + "] | Nutzlast - [" + this.getSitzpl�tze() + "]";
	}
}
