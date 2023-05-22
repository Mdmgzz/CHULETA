package ejemplos;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList();
		int numero;
		int indice = 0;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		while(numero != -1) {
			lista.add(numero);
			numero = sc.nextInt();
		}
		
		System.out.println(lista);
		
		for(int numeroLista : lista) {
			if(esPar(numeroLista)) {
				System.out.print(numeroLista + " ");
			}
			
		}
		System.out.println();
		
		while(indice < lista.size()) {
			if(lista.get(indice) % 3 == 0) {
				lista.remove(indice);
			} else {
				indice++;
			}
		}
		
		System.out.println(lista);
		
		lista.clear();
		
		if(lista.isEmpty()) {
			System.out.println("Lista vacía");
		}
	}

	public static boolean esPar(int numero) {
		boolean esPar = false;
		
		if(numero%2==0) {
			esPar = true;
		}
		return esPar;
	}
}