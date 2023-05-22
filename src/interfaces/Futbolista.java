package interfaces;

public class Futbolista implements Comparable<Futbolista>{

	private int numCamiseta = 0;
	private String nombre = "";
	private int edad = 0;
	private int numGoles = 0;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		String cadena = "Número camiseta" + numCamiseta + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n"
				+ "Número de goles: " + numGoles;
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Futbolista f = (Futbolista) obj;
		
		if (this.numCamiseta == f.numCamiseta && this.nombre.equals(f.nombre)) {
			iguales = true;
		}
		
		return iguales;
	}

	public int compareTo(Futbolista o) {
		int res = 0;
		
		res = this.numCamiseta - o.numCamiseta;
		if(res == 0) {
			res = this.nombre.compareTo(o.nombre);
		}
		
		return res;
	}

}
