
public class Raviolita {

	final double PI = 3.141592;
	private double u;
	private double h;

	public Raviolita() {
		setU(31.41);
		setH(11.6);
	}
	
	public Raviolita(double umfang, double hoehe) {
		setU(umfang);
		setH(hoehe);
	}
	
	public double getU() {
		return u;
	}

	public void setU(double u) {
		this.u = u;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	public double durchmesserBoden() {
		return (this.getU()/PI);
	}
	
	public double flächeBoden() {
		return (PI*((this.durchmesserBoden()/2)*(this.durchmesserBoden()/2)));
	}
	
	public double flächeMantel() {
		return (this.getU() * this.getH());
	}
	
	public double flächeGesamt() {
		return (2*this.flächeBoden()+this.flächeMantel());
	}
	
	public double volumenDose() {
		return (this.flächeBoden() * this.getH());
	}
	
	public String toString() {
		String _s = "\n" + this.getClass().getName();
		_s += "\nDurchmesser Boden: " + this.durchmesserBoden();
		_s += "\nFläche Boden: " + this.flächeBoden();
		_s += "\nFläche Mantel: " + this.flächeMantel();
		_s += "\nFläche Gesamt: " + this.flächeGesamt();
		_s += "\nVolumen Doese: " + this.volumenDose();
		return _s;
	}
	
	
	public static void main(String[] args) {
		Raviolita ravi_1 = new Raviolita();
		Raviolita ravi_2 = new Raviolita(31.41,11.6);
		System.out.println(ravi_1.toString());
		System.out.println(ravi_2.toString());
	}
}
