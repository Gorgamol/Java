import java.util.ArrayList;

public class MitarbeiterVerwaltung {
	private ArrayList<Mitarbeiter> maList;
	
	public MitarbeiterVerwaltung() {
		this.maList = new ArrayList<Mitarbeiter>();
	}
	
	public void einfügen(Mitarbeiter ma) {
		this.maList.add(ma);
	}
	
	public void löschen(Mitarbeiter ma) {
		for(int i = 0; i < this.maList.size(); ++i) {
			if(this.maList.get(i).equals(ma)) {
				this.maList.remove(i);
			}
		}
	}
	
	public boolean istEnthalten(Mitarbeiter ma) {
		for(int i = 0; i < this.maList.size(); ++i) {
			if(this.maList.get(i).equals(ma)) {
				return true;
			}
		}
		return false;
	}
	
	public void listeMitarbeiter(){
		for(int i = 0; i < this.maList.size(); ++i) {
			if(this.maList.get(i) instanceof Ausbilder) {
				System.out.println(((Ausbilder)this.maList.get(i)).toString());
			} else if(this.maList.get(i) instanceof Auszubildender) {
				System.out.println(((Auszubildender)this.maList.get(i)).toString());
			} else if(this.maList.get(i) instanceof Aushilfe) {
				System.out.println(((Aushilfe)this.maList.get(i)).toString());
			}
		}
	}
	
	public void listeAusbilder() {
		for(int i = 0; i < this.maList.size(); ++i) {
			if(this.maList.get(i) instanceof Ausbilder) {
				System.out.println(((Ausbilder)this.maList.get(i)).toString());
			}
		}
	}
	
	public void listeAuszubildende() {
		for(int i = 0; i < this.maList.size(); ++i) {
			if(this.maList.get(i) instanceof Auszubildender) {
				System.out.println(((Auszubildender)this.maList.get(i)).toString());
			}
		}
	}
	
	public void listeAushilfen() {
		for(int i = 0; i < this.maList.size(); ++i) {
			if(this.maList.get(i) instanceof Aushilfe) {
				System.out.println(((Aushilfe)this.maList.get(i)).toString());
			}
		}
	}

}
