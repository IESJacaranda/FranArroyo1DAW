package ejercicio6;
import java.util.Scanner;

import ejercicioalumnos.Clase;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. Realizar un programa que solicite una frase e informe de cuantas veces
//		aparecen cada una de las letras del abecedario en la frase (sólo se
//		mostrarán las letras que aparezcan al menos una vez).
//		Pista: Crear un array de contadores (entero) con tantos elementos como
//		letras del abecedario y un String con las letras del abecedario
		Scanner sc=new Scanner(System.in);
		String frase;
		System.out.println("Introduce una frase");
		frase=sc.nextLine();
		Letras letritas=new Letras();
		letritas.AddContadorLetras();
		System.out.println(letritas.toString());
		System.out.println(letritas.cuentaLetras(frase));


	}

}
