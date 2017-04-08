package blatt2;

import java.lang.Iterable;
import java.util.Iterator;

public class LinkedList<E> implements List<E> {  // generic
	
	private int getZeiger;
	private int nextZeiger;
	
	private class Wrapper { // local class
		E e;
		Wrapper succ;
		
		Wrapper(E e){
			this.e = e;
			succ = null;
		}
	}
	
	Wrapper first;
	Wrapper last;
	int size;
	
	LinkedList(){
		first = null;
		last = null;
		size = 0;
		getZeiger = 0;
		nextZeiger = 0;
	}
	
	public boolean add(E e) {
		Wrapper w = new Wrapper(e);
		if (size == 0){
			first = w;
			last = w;
		} else {
			last.succ = w;
			last = w;
		}
		size++;
		return true;
	}

	public E get(int index) {
		Wrapper wRun;
		if (index < 0 || index >= size){
			throw new IndexOutOfBoundsException();
		}
		wRun = this.first;
		for (int iRun = 0; iRun < index; iRun++){
			++getZeiger;
			wRun = wRun.succ;
			System.out.println("Zeigerfortschaltung get(): " + getZeiger);
		}
		return wRun.e;
	}

	public int size() {
		return size;
	}

	public Iterator<E> iterator() {  // anonymous class
		return new Iterator<E>(){
			Wrapper next = first;
			Wrapper current;

			public boolean hasNext() {
				return next != null;
			}

			public E next() {
				current = next;
				if (next != null){
					next = next.succ;
					++nextZeiger;
				}
				System.out.println("Zeigerfortschaltung get(): " + nextZeiger);
				return current.e;
			}

			public void remove() {
				throw new UnsupportedOperationException();	
			}
		};
	}
}
