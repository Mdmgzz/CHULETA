package ejemplos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Map<String, Integer> productos = new LinkedHashMap();
		int opcion;
		String codigo = "";
		int stock = 0;

		Scanner sc = new Scanner(System.in);

		menu();

		System.out.println("Elija una opción");
		opcion = sc.nextInt();
		sc.nextLine();

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				System.out.println("Introduzca código del producto");
				codigo = sc.nextLine();
				System.out.println("Introduzca el stock del producto");
				stock = sc.nextInt();
				sc.nextLine();
				productos.put(codigo, stock);

				break;
			case 2:
				System.out.println("Introduzca el código del producto a eliminar");
				codigo = sc.nextLine();
				productos.remove(codigo);
				break;
			case 3:
				System.out.println("Introduzca el código del producto");
				codigo = sc.nextLine();
				System.out.println("Introduzca el stock a añadir:");
				stock = sc.nextInt();
				sc.nextLine();
				productos.replace(codigo, productos.get(codigo) + stock);
				break;
			case 4:
				System.out.println("Introduzca el código del producto");
				codigo = sc.nextLine();
				System.out.println("Introduzca el stock a quitar:");
				stock = sc.nextInt();
				sc.nextLine();
				productos.replace(codigo, productos.get(codigo) - stock);
				break;
			case 5:
				System.out.println(productos);
				break;
			default:
				System.out.println("Opción errónea");
			}

			menu();
			System.out.println("Elija una opción");
			opcion = sc.nextInt();
			sc.nextLine();
		}

	}

	private static void menu() {
		System.out.println("PRODUCTOS");
		System.out.println("===================");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Añadir stock");
		System.out.println("4. Eliminar stock");
		System.out.println("5. Listar productos");
		System.out.println("0. Salir");
		System.out.println();
	}

}
