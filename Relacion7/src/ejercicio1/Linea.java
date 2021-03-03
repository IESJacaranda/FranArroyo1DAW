package ejercicio1;
public class Linea {
	Punto punto1;
	Punto punto2;

	/*
	 * Constructor
	 */
	public Linea(Punto punto1, Punto punto2) {
		super();
		this.punto1 = punto1;
		this.punto2 = punto2;
	}
	/*
	 * Metodo para comparar lineas
	 */
	public Punto getpunto1() {
		return punto1;
	}

	public Punto getpunto2() {
		return punto2;
	}
	public boolean CompararLinea(Linea linea1,Linea linea2) {
		boolean igualesono=false;
		if (linea1.equals(linea2)) {
			igualesono=true;
		}else {
			igualesono=false;
		}
		return igualesono;
	}
	public boolean PuntosIguales(Linea linea2) {
		boolean puntosoniguales=true;
		if (!punto1.equals(linea2.punto1) || !punto2.equals(linea2.punto2)) {
			puntosoniguales=false;
		}
		return puntosoniguales;
	}
}
