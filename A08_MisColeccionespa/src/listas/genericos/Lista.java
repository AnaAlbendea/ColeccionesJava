package listas.genericos;

public interface Lista<T> extends Iterable<T>{

	void add(T s);
	void remove(T s);
	void remove(int pos);
	T find(int pos);
	int size();
}
