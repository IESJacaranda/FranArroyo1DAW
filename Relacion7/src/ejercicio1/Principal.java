package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1=new Punto(2,3);
		Punto punto2=new Punto(2,3);
		Punto punto3=new Punto(2,3);
		Punto punto4=new Punto(2,3);
		Linea linea1=new Linea(punto1, punto2);
		Linea linea2=new Linea(punto3, punto4);
		System.out.println(linea1.PuntosIguales(linea2));

	}

}
