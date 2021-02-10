package cadenasjava;
import java.util.Scanner;
public class ejerprueba {
	static	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String nombre,cadenanueva;
//		char caracter,caracter2;
//		System.out.println("Introduce tu nombre de usuario");
//		nombre=sc.nextLine();
//		System.out.println("Introduce el caracter deseado");
//		caracter=sc.nextLine().charAt(0);
//		System.out.println("Introduce el caracter del nombre de usuario");
//		caracter2=sc.nextLine().charAt(0);
//		cadenanueva=nombre.replace(caracter,caracter2);
//		System.out.println(cadenanueva);
//		cadenanueva=cadenanueva.toUpperCase();
//		System.out.println(cadenanueva);
		String cadena1="choripan";
		String cadena2=sc.nextLine();
		System.out.println(cadena1==cadena2);
		System.out.println(cadena1.equals(cadena2));
	}

}
