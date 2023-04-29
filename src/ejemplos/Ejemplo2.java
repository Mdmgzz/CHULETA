package ejemplos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejemplo2 {

	// Solución del ejemplo 2
	public static void main(String[] args) {
		// No puede tener repetidos, no importa el orden pero sí se van a eliminar
		// objetos, por ello decidimos usar HashSet
		Set<Integer> numeros = new HashSet<>();
		
		// Variables para el número aleatorio a generar y el número a eliminar
		int numAleatorio, numBuscar;
		
		Scanner sc = new Scanner(System.in);

		// Generamos 20 números aleatorios y los almacenamos en la colección
		for (int i = 1; i <= 20; i++) {
			numAleatorio = (int) (Math.random() * 100 + 1);
			numeros.add(numAleatorio);
		}

		// Pintamos la colección
		System.out.println(numeros);

		// Pedimos el número a eliminar
		System.out.println("Introduzca un valor a buscar:");
		numBuscar = sc.nextInt();

		// Si el elemento se encuentra se elimina
		if (numeros.remove(numBuscar)) {
			System.out.println("El número se encontraba en la colección");
		} else {
			// Se muestra un mensaje en caso de que el número no se encontrara en la colección
			System.out.println("El número no se encontraba en la colección");
		}

		// Volvemos a pintar la colección
		System.out.println(numeros);
		sc.close();
	}

}
