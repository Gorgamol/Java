import java.util.ArrayList;

public class Fuhrpark {
	private ArrayList<Fahrzeug> fahrzeuge;
	
	public Fuhrpark() {
		fahrzeuge = new ArrayList<Fahrzeug>();
	}
	
	public void addFahrzeug(Fahrzeug f) {
		fahrzeuge.add(f);
	}
	
	public double berechneSteuer() {
		double steuer = 0.0;
		
		for(int i = 0; i < fahrzeuge.size(); ++i) {
			steuer += fahrzeuge.get(i).berechneSteuer();
		}
		
		return steuer;
	}
	
	public String toString() {
		if(fahrzeuge.isEmpty()) {
			return "Keine Fahrzeuge vorhanden!";
		}
		
		String s = "";
		for(int i = 0; i < fahrzeuge.size(); ++i) {
			if(fahrzeuge.get(i) instanceof Bus) {
				s += "[BUS]		|| Kennzeichen: " + fahrzeuge.get(i).getKennzeichen() + " | Steuer: " + fahrzeuge.get(i).berechneSteuer();
				s += " | Sitzplätze: " + ((Bus)fahrzeuge.get(i)).getSitzplätze() + "\n";
			} else if (fahrzeuge.get(i) instanceof LKW) {
				s += "[LKW]		|| Kennzeichen: " + fahrzeuge.get(i).getKennzeichen() + " | Steuer: " + fahrzeuge.get(i).berechneSteuer();
				s += " | Nutzlast: " + ((LKW)fahrzeuge.get(i)).getNutzlast() + "\n";
			}
		}
		return s;
	}

}
