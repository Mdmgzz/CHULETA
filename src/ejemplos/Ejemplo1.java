package ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejemplo1 {

	// solución del ejemplo 1
	public static void main(String[] args) {
		// Creamos una colección de tipo ArrayList porque puede tener repetidos y sólo
		// almacenamos valores
		List<Integer> coleccion = new ArrayList<Integer>();

		// Variable donde almacenar los valores introducidos por teclado
		Integer numero;
		int indice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número a introducir en la colección: ");
		// Leemos un número
		numero = sc.nextInt();

		// Mientras el número introducido sea distinto de -1
		while (numero != -1) {
			// añadimos el número a la colección
			coleccion.add(numero);
			// Volvemos a pedir un número
			System.out.println("Introduzca un número a introducir en la colección: ");
			numero = sc.nextInt();
		}

		// Imprimimos la colección completa
		System.out.println("Lista completa: " + coleccion);

		// Imprimimos sólo los pares
		System.out.print("Pares: ");

		// Recorremos la colección con un for each
		for (Integer num : coleccion) {
			if (num % 2 == 0) { // sólo pintamos los números pares
				System.out.print(num + " ");
			}
		}
		System.out.println();

		// Recorremos la colección con un índice
		while (indice < coleccion.size()) {
			// Si la posición en la que nos encontramos es múltiplo de 3 lo eliminamos de la
			// colección
			if (coleccion.get(indice) % 3 == 0) {
				coleccion.remove(indice); // Se elimina de la colección
			} else {
				// Si no es múltiplo de 3 avanzamos a la siguiente posición
				indice++;
			}
		}

		System.out.println("Colección sin múltiplos de 3: " + coleccion);

		// Cerramos el Scanner
		sc.close();
	}

}
