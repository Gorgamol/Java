import java.util.ArrayList;
import java.util.HashMap;

public class CharCollection {
	ArrayList<Character> collection;
	
	CharCollection(char... cc) {
		collection = new ArrayList<Character>();
		for(int i = 0; i < cc.length; ++i) {
			collection.add(Character.toUpperCase(cc[i]));
		}
	}
	
	CharCollection(String s) {
		collection = new ArrayList<Character>();
		for(int i = 0; i < s.length(); ++i) {
			collection.add(Character.toUpperCase(s.charAt(i)));
		}
	}
	
	public int size() {
		return this.collection.size();
	}
	
	public int count(char c) {
		int count = 0;
		for(int i = 0; i < this.collection.size(); ++i) {
			if(this.collection.get(i).equals(Character.toUpperCase(c))) {
				++count;
			}
		}
		return count;
	}
	
	public int different() {
		ArrayList<Character> different = new ArrayList<Character>();
		int n = 0;
		for(int i = 0; i < this.collection.size(); ++i) {
			for(int j = 0; j < this.collection.size(); ++j) {
				if(this.collection.get(i).equals(this.collection.get(j)) && !this.contains(this.collection.get(j), different)) {
					different.add(this.collection.get(j));
					++n;
				}
			}
		}
		return n;
	}
	
	public boolean contains(char c, ArrayList<Character> cList) {
		for(int i = 0; i < cList.size(); ++i) {
			if(cList.get(i).equals(c)) {
				return true;
			}
		}
		return false;
	}
	
	public char top() {
		if(this.collection.isEmpty()) {
			return '0';
		}
		HashMap<Integer, Character> top = new HashMap<Integer, Character>();
		int count = 0;
		for(int i = 0; i < this.collection.size(); ++i) {
			for(int j = 0; j < this.collection.size(); ++j) {
				if(this.collection.get(i).equals(this.collection.get(j))) {
					++count;
				}
			}
			if
			top.put(count, this.collection.get(i));
		}
	
		return 'w'; //DING VERNÜNFTIG MACHEN, HASHMAP SUCKT
	}
	
	public String toString() {
		String s = "(";
		for(int i = 0; i < this.collection.size(); ++i) {
			if(i < this.collection.size() - 1) {
				s += " " + this.collection.get(i) + ",";
			} else {
				s += " " + this.collection.get(i) + ")";
			}
		}
		return s;
	}
}
