package listas.genericos;

import java.util.Iterator;

public class ListaEnlazada<T> implements Lista<T> {

	private Nodo primero = null;
	private Nodo ultimo = null;
	private int cant = 0;
	
	@Override
	public void add(T s) {
		Nodo nuevo = new Nodo(s);
		if (primero == null)
			primero = nuevo;
		else
			ultimo.sig = nuevo;
		
		ultimo = nuevo;
		cant++;
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
		if (pos < 0 || pos >= cant)
			return null;
		Nodo aux = primero;
		for (int i = 0; i < pos; i++)
			aux = aux.sig;
		return aux.dato;
	}

	@Override
	public int size() {
		return cant;
	}

	private class Nodo {
		T dato;
		Nodo sig;

		Nodo(T dato){
			this.dato = dato;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator<T> {

		private Nodo proximo = primero;
		
		@Override
		public boolean hasNext() {
			return proximo != null;
		}

		@Override
		public T next() {
			T elemento = proximo.dato;
			proximo = proximo.sig;
			return elemento;
		}
		
	}
}
