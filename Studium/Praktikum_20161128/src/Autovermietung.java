import java.util.ArrayList;

public class Autovermietung {

	public static void main(String[] args) {
		ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
		fahrzeuge.add(new LKW("test", 2, 3, true, 4));
		fahrzeuge.add(new PKW("test2", 2, 2, false));



	}

}
