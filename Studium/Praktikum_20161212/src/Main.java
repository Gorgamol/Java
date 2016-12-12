
public class Main {

	public static void main(String[] args) {
		Handyvertrag hv = new Handyvertrag();
		
		Angebot angebot_1 = new Angebot(27.00, 0.14, 45);
		Angebot angebot_2 = new Angebot(30.00, 0.13, 50);
		Angebot angebot_3 = new Angebot(5.00, 0.30, 0);
		Angebot angebot_4 = new Angebot(10.00, 0.08, 20);
		
		hv.einfügen(angebot_1);
		hv.einfügen(angebot_2);
		hv.einfügen(angebot_3);
		hv.einfügen(angebot_4);
		
		hv.listeAngebote();
		
		System.out.println(hv.günstig(8888888));

	}

}
