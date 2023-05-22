package ejercicios;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		Set<Integer> coleccion = new TreeSet<>();
		int numAleatorio;
		
		while(coleccion.size()<20) {
			numAleatorio = (int) (Math.random()*100+1);
			coleccion.add(numAleatorio);
		}
		
		System.out.println(coleccion);
	}

}
