package listas;

public class ListaEnlazada implements Lista {

	private Nodo primero;
	private Nodo ultimo;
	private int cant;
	
	@Override
	public void add(String s) {
		Nodo nuevo = new Nodo(s);
		if (primero == null)
			primero = nuevo;
		else
			ultimo.sig = nuevo;
		
		ultimo = nuevo;
		cant++;
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String find(int pos) {
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
		String dato;
		Nodo sig;

		Nodo(String dato){
			this.dato = dato;
		}
	}
}
