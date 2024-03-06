package tests;

import listas.genericos.Lista;
import listas.genericos.ListaArray;
import listas.genericos.ListaEnlazada;

public class Test02Genericos {
	public static void main(String[] args) {
		
		Lista<Integer> numeros = new ListaArray<>();
		
		numeros.add(15);
		numeros.add(28);
		numeros.add(3);
		numeros.add(92);
		
		System.out.println(numeros.find(2));
		
		Lista<String> palabras = new ListaEnlazada<>();
		
		
	}
}
