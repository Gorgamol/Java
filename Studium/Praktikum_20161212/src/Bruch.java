
public class Bruch {
	private double z�hler;
	private double nenner;
	private double bruch;
	
	public Bruch(double z�hler, double nenner) {
		this.z�hler = z�hler;
		this.nenner = nenner;
		this.bruch = z�hler / nenner;
	}
	
	public double getBruch() {return this.bruch;}
	public double getZ�hler() {return this.z�hler;}
	public double getNenner() {return this.nenner;}
	
	public double addiere(Bruch b) {
		return this.bruch + b.getBruch();
	}
	
	public double addiere(double a, double b) {
		return a + b;
	}
	
	public double subtrahiere(Bruch b) {
		return this.bruch - b.getBruch();
	}
	
	public double dividiere(Bruch b) {
		return this.bruch / b.getBruch();
	}
	
	public double multipliziere(Bruch b) {
		return this.bruch * b.getBruch();
	}
	
	public String toString() {
		return "Bruch [" + this.z�hler + "/" + this.nenner + "] = " + this.bruch;
	}
	
	public boolean equals(Bruch b) {
		if(b != null) {
			if(this.z�hler == b.getZ�hler() && this.nenner == b.getNenner()) {
				return true;
			}
		}
		return false;
	}

}
