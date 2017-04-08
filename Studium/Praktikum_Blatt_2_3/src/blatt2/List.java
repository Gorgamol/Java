package blatt2;

public interface List<E> extends Iterable<E>{ // generic
	boolean add(E e);
	E get(int index);
	int size();
}
