
public class Radio {

	private boolean eingeschaltet;
	private int lautstaerke;
	private double frequenz;
	
	public Radio() {
		this.eingeschaltet = false;
		this.lautstaerke = 5;
		this.frequenz = 99.9;
	}
	
	public Radio(boolean istAn, int lautstaerke, double frequenz) {
		this.eingeschaltet = istAn;
		this.lautstaerke = lautstaerke;
		this.frequenz = frequenz;
	}
	
	public void lauter(int lautstaerke) {
		if(this.eingeschaltet == false) {
			System.out.println("Das Radio ist aus!");
			return;
		} else {
			this.lautstaerke += lautstaerke;
			if(this.lautstaerke > 10) {
				this.lautstaerke = 10;
			}
			System.out.println("Die Lautstärke wurde geändert auf: " + this.lautstaerke);
		}
	}
	
	public void leiser(int lautstaerke) {
		if(this.eingeschaltet == false) {
			System.out.println("Das Radio ist aus!");
			return;
		} else {
			this.lautstaerke -= lautstaerke;
			if(this.lautstaerke < 0) {
				this.lautstaerke = 0;
			}
			System.out.println("Die Lautstärke wurde geändert auf: " + this.lautstaerke);
		}
	}
	
	public void an() {
		if(this.eingeschaltet == true) {
			System.out.println("Das Radio ist bereits eingeschaltet!");
			return;
		} else {
			this.eingeschaltet = true;
			System.out.println("Das Radio wurde eingeschaltet!");
		}
	}
	
	public void aus() {
		if(this.eingeschaltet == false) {
			System.out.println("Das Radio ist bereits ausgeschaltet!");
			return;
		} else {
			this.eingeschaltet = false;
			System.out.println("Das Radio wurde ausgeschaltet!");
		}
	}
	
	public void waehleSender(double frequenz) {
		if(this.eingeschaltet == false) {
			System.out.println("Das Radio ist aus!");
			return;
		} else {
			this.frequenz = frequenz;
			if(this.frequenz > 110.0 || this.frequenz < 85.0) {
				this.frequenz = 99.9;
			}
			System.out.println("Die Frequenz wurde geändert auf: " + this.frequenz);
		}
	}
	
	public String toString() {
		if(this.eingeschaltet == true) {
			return "Radio an: Freq=" + this.frequenz + ", Laut=" + this.lautstaerke;
		} else {
			return "Radio aus: Freq=" + this.frequenz + ", Laut=" + this.lautstaerke;			 
		}

	}
	
	public static void main(String[] args) {
		Radio radio = new Radio(false, 5, 99.9);
		System.out.println(radio.toString());
		
		

	}

}
