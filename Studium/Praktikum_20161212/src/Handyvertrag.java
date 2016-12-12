import java.util.ArrayList;
import java.util.Scanner;

public class Handyvertrag {
	private ArrayList<Angebot> angebote;
	
	public Handyvertrag() {
		angebote = new ArrayList<Angebot>();
	}
	
	public void einfügen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Basispreis des Angebots ein: ");
		double basispreis = Double.parseDouble(sc.nextLine());
		System.out.println("Bitte geben Sie den Freiminuten des Angebots ein: ");
		int minuten = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie den Preis für jede weiter Minute des Angebots ein: ");
		double preis_minute = Double.parseDouble(sc.nextLine());
		this.angebote.add(new Angebot(basispreis, preis_minute, minuten));
		sc.close();
	}
	
	public void einfügen(Angebot _a) {
		this.angebote.add(_a);
	}
	
	public String günstig(int minuten) {
		double preis = calculate(minuten, 0);
		int index = 0;
		
		for(int i = 0; i < angebote.size(); ++i) {
			if(preis > calculate(minuten, i)) {
				preis = calculate(minuten, i);
				index = i;
			}
		}
		return "Angebot " + (index + 1) + " - " + this.angebote.get(index).toString() + " | Preis - " + preis;
	}
	
	public void listeAngebote() {
		for(int i = 0; i < this.angebote.size(); ++i) {
			System.out.println(this.angebote.get(i).toString());
		}
	}
	
	private double calculate(int minuten, int index) {
		if(minuten <= this.angebote.get(index).getMinuten()) {
			return this.angebote.get(index).getBasispreis();
		} else {
			return this.angebote.get(index).getBasispreis() + (((double)(minuten - this.angebote.get(index).getMinuten())) * this.angebote.get(index).getPreis_min());
		}
	}
	
}
