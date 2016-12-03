import java.util.Scanner;
import java.util.ArrayList;

public class Mäxchen {

	public static int würfeln() {
		return (int) ((Math.random() * 6) + 1);
	}
	
	public static void main(String[] args) {

		
		ArrayList<Spieler> spielerListe = new ArrayList<Spieler>();
		
		Scanner sc = new Scanner(System.in);		
		int spielerZahl = Integer.parseInt(sc.nextLine());
		String spielerName;
		for(int i = 0; i < spielerZahl; ++i) {
			spielerName = sc.nextLine();
			spielerListe.add(new Spieler("[" + spielerName + "]"));
		}
		sc.close();
		
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < spielerListe.size(); ++j) {
				System.out.println(spielerListe.get(j).getSpielerName() + " ist an der Reihe!");
				spielerListe.get(j).setPunkte(würfeln(), würfeln());
			}
		}

	}

}
