
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
		int temp = 0;
		if(wurf_1 == 1 && wurf_2 == 2) {
			temp = 1000;
			this.punkte += temp;
		} else if(wurf_1 == wurf_2) {
			temp = wurf_1 * 100;
			this.punkte += temp;
		} else if(!(wurf_1 == 1 && wurf_2 == 2) && !(wurf_1 == wurf_2)) {
			if(wurf_1 > wurf_2) {
				temp = 10 * wurf_1 + wurf_2;
				this.punkte += temp;
			} else if(wurf_2 > wurf_1) {
				temp = 10 * wurf_2 + wurf_1;
				this.punkte += temp;
			}
		}
		System.out.println(this.getSpielerName() + " bekommt " + temp + " Punkte!");
	}

}
