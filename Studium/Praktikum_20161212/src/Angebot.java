
public class Angebot {
	private double basispreis;
	private double preis_min;
	private int minuten;

	public Angebot() {
		this.basispreis = 0.0;
		this.preis_min = 0.0;
		this.minuten = 0;
	}
	
	public Angebot(double basispreis, double preis_min, int minuten) {
		this.basispreis = basispreis;
		this.preis_min = preis_min;
		this.minuten = minuten;
	}
	
	public double getBasispreis() {
		return basispreis;
	}
	
	public void setBasispreis(double basispreis) {
		this.basispreis = basispreis;
	}
	
	public double getPreis_min() {
		return preis_min;
	}
	
	public void setPreis_min(double preis_min) {
		this.preis_min = preis_min;
	}
	
	public int getMinuten() {
		return minuten;
	}
	
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}
	
	public String toString() {
		return "Angebot [basispreis=" + basispreis + ", preis_min=" + preis_min + ", minuten=" + minuten + "]";
	}
}
