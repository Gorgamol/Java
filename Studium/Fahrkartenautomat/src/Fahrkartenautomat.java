import java.util.ArrayList;
import java.util.Scanner;

public class Fahrkartenautomat {
	private ArrayList<Datenbank> strecken;
	private String standort;
	private Ticket ticket;
	private Scanner sc;
	
	public Fahrkartenautomat(String standort) {
		this.standort = standort;
		strecken = new ArrayList<Datenbank>();
		strecken.add(new Datenbank("Norden", 5.0, 0.3));
		strecken.add(new Datenbank("Bremen", 10.0, 1.25));
		strecken.add(new Datenbank("Münster", 23.7, 2.4));
		strecken.add(new Datenbank("Köln", 78.3, 4.2));
		ticket = new Ticket();
		sc = new Scanner(System.in);
	}
	
	public void erstelleTicket() {
		System.out.println("Sie befinden sich am Fahrkartenautomaten in " + this.standort + "!");
		System.out.println("Bitte wählen Sie mittels Nummer aus, wo Sie hinfahren möchten:\n");
		for(int i = 0; i < strecken.size(); ++i) {
			System.out.println("[" + (i + 1) + "] " + this.strecken.get(i).getName());
		}
		
		this.ticket.setStrecke(this.strecken.get(sc.nextInt() - 1).toString(standort));
		
		System.out.println("\nBitte geben Sie die Anzahl der Personen an:");
		this.ticket.setPersonen(sc.nextInt());
		
		
		
	}
	
	public void druckeTicket() {
		System.out.println(this.ticket.toString());
	}
	
	// Klasse Main
	// Klasse Datenbank (Strecken)
	// Klasse Ticket - Strecke, datum, preis, personen... etc.. toString()
	// methoden: preiskalkulation, (ticketinformationen, streckenauswahl)

}
