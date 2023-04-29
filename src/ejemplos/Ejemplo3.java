package ejemplos;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejemplo3 {

	public static void main(String[] args) {
		// Como se van a almacenar pares de código y cantidad utilizamos un mapa.
		// Además, interesa que se nos muestre ordenado
		Map<String, Integer> repuestos = new TreeMap<String, Integer>();
		
		// Opción del menú
		int opc;
		
		// Código del producto
		String codigo;
		
		// Cantidad de stock
		int stock;
		
		Scanner sc = new Scanner(System.in);

		// Realizamos un menú para la gestión de los respuestos
		System.out.println("REPUESTOS DE AUTOMÓVIL");
		System.out.println("1. Alta de producto");
		System.out.println("2. Baja de producto");
		System.out.println("3. Añadir stock");
		System.out.println("4. Listar existencias");
		System.out.println("0. Salir");
		System.out.println();
		
		// Pedimos una opción
		System.out.println("Introduzca una opción:");
		opc = sc.nextInt();
		sc.nextLine();
		
		// Mientras la opción introducida sea distinta de 0
		while (opc != 0) {
			switch (opc) {
			case 1: // Añadimos un producto
				System.out.println("Introduzca el código del producto a añadir");
				codigo = sc.nextLine();
				repuestos.put(codigo, 0); // Se añade al mapa
				break;
			case 2: // Se elimina un producto
				System.out.println("Introduzca el código del producto a eliminar");
				codigo = sc.nextLine();
				repuestos.remove(codigo); // Se elimina el producto del mapa
				break;
			case 3: // Se añade cierta cantidad de stock
				System.out.println("Introduzca el código del producto al que añadir stock");
				codigo = sc.nextLine();
				System.out.println("Introduzca la cantidad de stock a añadir");
				stock = sc.nextInt();
				sc.nextLine();
				// Modificamos el valor para el código introducido
				repuestos.replace(codigo, stock + repuestos.get(codigo)); 
				break;
			case 4: // Se listan los productos
				System.out.println(repuestos);
				break;
			default:
				System.out.println("Opción introducida no correcta");
			}
			
			System.out.println(repuestos);
			System.out.println();
			
			// Se vuelve a pedir la opción
			System.out.println("Introduzca una opción:");
			opc = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
	}

}
