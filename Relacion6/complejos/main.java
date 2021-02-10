package complejos;
import java.util.Scanner;
public class main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int eleccion;
		Complejo numero1 = new Complejo(3,0);
		Complejo numero2 = new Complejo(7,2);
		System.out.print(numero1+"-"+numero2+"=");
		numero1.suma(numero2);
		System.out.println(numero1);
		System.out.print(numero1+"+"+numero2+"=");
		numero1.resta(numero2);
		System.out.println(numero1);
		
	}
}