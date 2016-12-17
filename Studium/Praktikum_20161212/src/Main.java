
public class Main {

	public static void main(String[] args) {
		Fuhrpark fahrzeuge = new Fuhrpark();
		
		Fahrzeug bus1 = new Bus("1234 AS", 55);
		Fahrzeug bus2 = new Bus("3942 SP", 200);
		Fahrzeug lkw1 = new LKW("4502 AÜ", 2000);
		Fahrzeug lkw2 = new LKW("0420 GV", 200000);
		
		fahrzeuge.addFahrzeug(bus1);
		fahrzeuge.addFahrzeug(bus2);
		fahrzeuge.addFahrzeug(lkw1);
		fahrzeuge.addFahrzeug(lkw2);
		
		System.out.println(fahrzeuge.toString());
		

	}

}
