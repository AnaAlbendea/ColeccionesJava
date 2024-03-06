package tests;

import java.util.Iterator;

import listas.genericos.Lista;
import listas.genericos.ListaArray;
import listas.genericos.ListaEnlazada;

public class Test03ForEach {
	public static void main(String[] args) {
		
		Lista<String> l1 = new ListaArray<>();
		l1.add("uno");
		l1.add("dos");
		l1.add("tres");
		l1.add("cuatro");
		l1.add("cinco");
		
		for (String algo : l1) {
			System.out.println(algo);
		}
		
		System.out.println("----------------");
		
		Lista<String> l2 = new ListaEnlazada<String>();
		l2.add("uno");
		l2.add("dos");
		l2.add("tres");
		l2.add("cuatro");
		l2.add("cinco");
		
		for (String algo : l2) {
			System.out.println(algo);
		}
		
		//Recorre con iterator y prueba el método remove() de iterator
		Iterator<String> it = l2.iterator();
		while(it.hasNext()) {
			String el = it.next();
			System.out.println(el);
			if(el.equals("tres"))
				it.remove();  // falla porque no lo hemos sobreescrito y tiene
//			                     el comportamiento definido en la interfaz porque
//								es un método defaultº
			
		}
		
	}
}
