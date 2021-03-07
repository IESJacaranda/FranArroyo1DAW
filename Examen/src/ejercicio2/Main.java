package ejercicio2;

import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Comprobador p1=new Comprobador();
		p1.setCadenaabuscar("lago");
		p1.setCadenanormal("murcielago");
		System.out.println(p1.EstaLaPalabra("lagazao", "murcielago"));
	}

}
