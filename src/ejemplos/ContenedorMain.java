package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class ContenedorMain {

	public static void main(String[] args) {
		Contenedor<Integer> caja = new Contenedor();
		
		caja.guardar(5);

		System.out.println(caja);
		
		caja.extraer();
		
		Contenedor<String> caja2 = new Contenedor<>();
		
		caja2.guardar("Perro");
		
		List<Integer> lista = new ArrayList<>();
	}

}
