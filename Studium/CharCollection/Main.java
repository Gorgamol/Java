
public class Main {

	public static void main(String[] args) {
		CharCollection s1 = new CharCollection('A','B','c');
		CharCollection s2 = new CharCollection("aBCksjdlalaaa");
		
		System.out.println(s1.toString() + "\n" + s2.toString());
		System.out.println(s2.different());
	}

}
