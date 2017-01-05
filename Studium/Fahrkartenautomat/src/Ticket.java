import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ticket {
	private String datum;
	private int personen;
	private double preis;
	private String strecke;
	Scanner sc;
	
	public Ticket() {
		sc = new Scanner(System.in);
	}
	
	public void setDatum(String datum) {this.datum = datum;}
	
	public void setPersonen(int personen) {this.personen = personen;}

	public void setStrecke(String strecke) {this.strecke = strecke;}
	
	public void setPreis(double preis) {this.preis = preis;}
	
	public void berechnePreis() {
		this.preis = (double) this.preis * this.personen;
		double kosten = this.preis;
		double geld = 0;
		System.out.println("\nIhr Ticket kostet " + this.preis + " €\nBitte werfen Sie das Geld ein:");
		do {
			geld = this.sc.nextDouble();
			kosten = kosten - geld;
			if(kosten <= 0) {
				break;
			} else {
				System.out.println("\nSie haben " + geld + " € eingeworfen.\n" + kosten + " € verbleibend!");
			}
		} while(kosten > 0);
		System.out.println("\nVielen Dank für die Bezahlung!");
		if(kosten < 0) {
			kosten = (double) kosten * (-1);
			System.out.println("Ihr Rückgeld beträgt " + kosten + " €");
		}
	}
	
	public String toString() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		
		String s = "\n\n --------------------------------------- ";
		s += "\n| [TICKET] - Datum [" + date.format(localDate) + "]\t\t|";
		s += "\n|---------------------------------------|";
		s += "\n| Personen: " + this.personen + "\t\t\t\t|";
		s += "\n| " + this.strecke + "\t|";
		s += "\n| Preis: " + this.preis + " € \t\t\t|";
		s += "\n --------------------------------------- ";
		return s;
	}
}
