package listas.genericos;

import java.util.Iterator;

public class ListaArray<T> implements Lista<T> {

	private Object[] almacen;
	private int cant;
	
	public ListaArray(int cant) {
		almacen = new Object[cant];
	}
	
	public ListaArray() {
		this(10);
	}
	
	public void add(T s) {
		if (cant == almacen.length)
			redimensionar();
		almacen[cant++] = s;
	}
	
	private void redimensionar() {
		Object[] aux = new Object[almacen.length * 2];
		for (int i = 0; i < almacen.length; i++) {
			aux[i] = almacen[i];
		}
		almacen = aux;
	}

	@Override
	public void remove(T s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T find(int pos) {
		if (pos < 0 || pos > cant)
			return null;
		return (T)almacen[pos];
	}

	@Override
	public int size() {
		return cant;
	}

	@Override
	public Iterator<T> iterator() {
		return new Itr();
	}

	private class Itr implements Iterator<T> {

		private int proximo = 0; 
		
		@Override
		public boolean hasNext() {
			return proximo < cant;
		}

		@Override
		public T next() {
			return (T)almacen[proximo++];
		}
		
	}
}
