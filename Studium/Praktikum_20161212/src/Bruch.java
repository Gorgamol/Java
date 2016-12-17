
public class Bruch {
	private double zähler;
	private double nenner;
	private double bruch;
	
	public Bruch(double zähler, double nenner) {
		this.zähler = zähler;
		this.nenner = nenner;
		this.bruch = zähler / nenner;
	}
	
	public double getBruch() {return this.bruch;}
	public double getZähler() {return this.zähler;}
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
		return "Bruch [" + this.zähler + "/" + this.nenner + "] = " + this.bruch;
	}
	
	public boolean equals(Bruch b) {
		if(b != null) {
			if(this.zähler == b.getZähler() && this.nenner == b.getNenner()) {
				return true;
			}
		}
		return false;
	}

}
