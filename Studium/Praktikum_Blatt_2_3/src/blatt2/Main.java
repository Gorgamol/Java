package blatt2;

import java.awt.Point;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		if (args.length > 0){
			n = Integer.parseInt(args[0]);
		}
		
		List<Integer> aList = new LinkedList<Integer>();  //typisiert
		
		for (int i = 0; i < n; i++){
			aList.add(i*i);
		}
		
		/* Ausgabeschleife 1 fuer Integer-Liste aList */
		for (int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i));
		} 
		System.out.println("=======================");
		
//		for (int val: aList){
//			System.out.println(val);
//		}
//		System.out.println("=======================");
		
		List<String> bList = new LinkedList<String>();  // typisiert
		
		for (int i = 0; i < n; i++){
			bList.add("als String " + i * i);
		}
		/* Ausgabeschleife 2 fuer String-Liste bList */
		for (Iterator it = (Iterator) bList.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		
		System.out.println("=======================");
	}
}
