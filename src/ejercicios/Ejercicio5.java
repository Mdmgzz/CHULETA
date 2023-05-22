package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		HashMap<String, Double> productos = new HashMap<>();
		int opc;
		String nombre;
		double precio;
		Scanner sc = new Scanner(System.in);

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			case 1:// Dar de alta el producto
				System.out.println("Introduzca el nombre del producto:");
				nombre = sc.nextLine();
				
				System.out.println("Introduzca el precio del producto:");
				precio = sc.nextDouble();				
				sc.nextLine();
				
				if(!productos.containsKey(nombre)) {
					productos.put(nombre, precio);
				} else {
					System.out.println("El producto ya existe");
				}
				
				break;
			case 2:// Baja de producto
				System.out.println("Introduzca el nombre del producto:");
				nombre = sc.nextLine();
				
				if(productos.containsKey(nombre)) {
					productos.remove(nombre);
				} else {
					System.out.println("No existe el producto indicado.");
				}
				
				break;
			case 3: // Listar
				System.out.println(productos);
				break;
			case 0: // Salir
				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opc != 0);

	}

	private static void menu() {
		System.out.println("Seleccione una opción");
		System.out.println("1. Alta producto");
		System.out.println("2. Baja producto");
		System.out.println("3. Listar existencias");
		System.out.println("0. Salir");
	}
}
