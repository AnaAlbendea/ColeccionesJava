package tests;

import listas.Lista;
import listas.ListaArray;
import listas.ListaEnlazada;

public class Test01 {
	public static void main(String[] args) {
		Lista lista = new ListaArray();
		testLista(lista);
		System.out.println("---------------");
		Lista lista2 = new ListaEnlazada();
		testLista(lista2);
	}
	
	public static void testLista(Lista lista) {
		System.out.println(lista.size());
		
		System.out.println(lista.find(0));
		System.out.println(lista.find(-1));
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.find(i));
		}
	}
}
