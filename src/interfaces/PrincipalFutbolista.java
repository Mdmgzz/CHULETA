package interfaces;

import java.util.Arrays;
import java.util.TreeSet;

public class PrincipalFutbolista {

	public static void main(String[] args) {
		TreeSet<Futbolista> futbolistas = new TreeSet();
		futbolistas.add(new Futbolista(3, "Paco", 40, 50));
		futbolistas.add(new Futbolista(2, "Pepe", 30, 10));
		futbolistas.add(new Futbolista(3, "Pedro", 20, 5));
		futbolistas.add(new Futbolista(1, "Alicia", 20, 5));
		futbolistas.add(new Futbolista(5, "María", 20, 5));
		

		for(Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}

}
