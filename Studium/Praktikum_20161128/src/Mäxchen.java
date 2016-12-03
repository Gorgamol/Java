import java.util.Scanner;
import java.util.ArrayList;

public class Mäxchen {

	public static int würfeln() {
		return (int) ((Math.random() * 6) + 1);
	}
	
	public static void zwischenStand(ArrayList<Spieler> arr) {
		int temp = arr.get(0).getPunkte();
		int index = 0;
		
		for(int i = 0; i < arr.size(); ++i) {
			if(arr.get(i).getPunkte() > temp) {
				index = i;
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Der momentan führende Spieler ist " + arr.get(index).getSpielerName() + " mit " + arr.get(index).getPunkte() + " Punkten!");
	}
	
	public static void sieger(ArrayList<Spieler> arr) {
		int temp = arr.get(0).getPunkte();
		int index = 0;
		
		for(int i = 0; i < arr.size(); ++i) {
			if(arr.get(i).getPunkte() > temp) {
				index = i;
			}
		}
		System.out.println("\n\nDer Sieger des Spiels ist " + arr.get(index).getSpielerName() + " mit " + arr.get(index).getPunkte() + " Punkten!, Herzlichen Glückwunsch");	
	}
	
	public static void main(String[] args) {

		ArrayList<Spieler> spielerListe = new ArrayList<Spieler>();
		System.out.println("Hallo! Willkommen zum Spiel Mäxchen!");
		System.out.println(" > Bitte geben Sie die Anzahl der Spieler an:");
		Scanner sc = new Scanner(System.in);
		int spielerZahl = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < spielerZahl; ++i) {
			System.out.println("\n > Geben Sie den Namen von Spieler " + (i + 1) + " ein:");
			spielerListe.add(new Spieler("[" + sc.nextLine() + "]"));
		}
		sc.close();
		
		for(int i = 0; i < 10; ++i) {
			System.out.println("\n>>>>>>>>>>>>>>>>>>>>[RUNDE " + (i + 1) + "]<<<<<<<<<<<<<<<<<<<<");
			for(int j = 0; j < spielerListe.size(); ++j) {
				System.out.println(spielerListe.get(j).getSpielerName() + " ist an der Reihe!");
				spielerListe.get(j).setPunkte(würfeln(), würfeln());
			}
			zwischenStand(spielerListe);
		}
		sieger(spielerListe);
		
		
	}

}
