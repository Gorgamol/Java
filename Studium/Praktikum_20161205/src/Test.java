
public class Test {

	public static void main(String[] args) {
		
		/*
		for (int z = 3, j = 14; z < 11 && j > z+1; j=j-2){
			System.out.print(z+j + " ");
			z--;
		}*/
		
		int summe = 0;
		
		for(int k = 1; k <= 10; ++k) {
			summe += (2*k) - 1;
			System.out.println("Schleifendurchlauf: " + k + "\nSumme = " + summe);
		}
		

	}

}
