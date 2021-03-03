package ejercicio1;

public class Punto {
	private double X;
	private double Y;
/*
 * Getters y Setters
 */

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}

	/*
	 * Metodo constructor. Segun el enunciado nos pide inicializarlo en 0
	 */
	public Punto(double X,double Y) {
			this.X = X;
			this.Y = Y;
		}
//	public boolean PuntosIguales(Linea linea1,Linea linea2) {
//		boolean puntosoniguales=false;
//		if (punto1.equals(punto2)) {
//			puntosoniguales=true;
//		}


	}

