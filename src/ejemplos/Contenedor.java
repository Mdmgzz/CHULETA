package ejemplos;

public class Contenedor<T> {
	private T objeto;

	public Contenedor() {
	}

	void guardar(T nuevo) {
		objeto = nuevo;
	}

	T extraer() {
		T res = objeto;
		objeto = null; // el contenedor vuelve a estar vacío
		return res;
	}

	@Override
	public String toString() {
		
		return objeto.toString();
	}
}
