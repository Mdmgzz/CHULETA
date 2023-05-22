package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> numeros = new TreeMap();
		TreeMap<Integer, Integer> estrellas = new TreeMap();
		
		int numero;
		int estrella;
		
		String seguir="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Quiere seguir introduciendo números? (S/N)");
		seguir = sc.nextLine();
		
		while(seguir.equalsIgnoreCase("s")) {
			System.out.println("Introduzca 5 números");
			for(int i=1; i<=5; i++) {
				numero = sc.nextInt();
				sc.nextLine();
				if(numeros.containsKey(numero)) {
					numeros.replace(numero, numeros.get(numero)+1);
				} else {
					numeros.put(numero, 1);
				}
			}
			
			System.out.println("Introduzca 2 estrellas");
			for(int i=1; i<=2; i++) {
				estrella = sc.nextInt();
				sc.nextLine();
				if(estrellas.containsKey(estrella)) {
					estrellas.replace(estrella, estrellas.get(estrella)+1);
				} else {
					estrellas.put(estrella, 1);
				}
			}
			
			System.out.println("¿Quiere seguir introduciendo números? (S/N)");
			seguir = sc.nextLine();
			
		}
		
		System.out.println("Números: " + numeros);
		System.out.println("Estrellas: " + estrellas);
	}

}
