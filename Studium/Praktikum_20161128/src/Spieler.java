
public class Spieler {
	private String spielerName;
	private int punkte;
	
	public Spieler(String spielerName) {
		this.spielerName = spielerName;
	}
	
	public String getSpielerName() {
		return spielerName;
	}
	
	public void setSpielerName(String spielerName) {
		this.spielerName = spielerName;
	}
	
	public int getPunkte() {
		return punkte;
	}
	
	public void setPunkte(int wurf_1, int wurf_2) {
		System.out.println(this.getSpielerName() + " hat eine [" + wurf_1 + "] und eine [" + wurf_2 + "] gewürfelt!");
		this.punkte = punkte;
	}

}
