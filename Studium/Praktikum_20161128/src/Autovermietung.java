import java.util.ArrayList;

public class Autovermietung {

	public static void main(String[] args) {
		ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
		fahrzeuge.add(new PKW("EMD BW 200", 50000, 10000, true));
		fahrzeuge.add(new PKW("AUR IV 52", 20000, 30000, false));
		fahrzeuge.add(new PKW("NOR JI 478", 100000, 5000, true));
		fahrzeuge.add(new LKW("EMD QF 1924", 75000, 40000, false, 1500));
		fahrzeuge.add(new LKW("AUR GL 23", 60000, 20000, false, 2000));
		fahrzeuge.add(new LKW("NOR PA 107", 45000, 25000, true, 2500));
		
		int lkwVerf�gbar = 0;
		int pkwVerf�gbar = 0;
		
		for(int i = 0; i < fahrzeuge.size(); ++i) {
			if(fahrzeuge.get(i) instanceof PKW && fahrzeuge.get(i).getVermietet() != true) {
				++pkwVerf�gbar;	
			} else if(fahrzeuge.get(i) instanceof LKW && fahrzeuge.get(i).getVermietet() != true) {
				++lkwVerf�gbar;
			}
		}
		
		System.out.println("Es sind " + pkwVerf�gbar + " PKW verf�gbar.\nEs sind " + lkwVerf�gbar + " LKW verf�gbar.");

	}

}
