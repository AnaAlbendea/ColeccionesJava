package listas;

public interface Lista {

	void add(String s);
	void remove(String s);
	void remove(int pos);
	String find(int pos);
	int size();
}
