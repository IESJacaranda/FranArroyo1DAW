package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//		.Realizar un programa que solicite por teclado números entre 1 y 1000
//		hasta   que   el   usuario   informe   de   que   ya   no   desea   introducir   másnúmeros.
//		Después debe mostrar:
//		•La media de los números leídos.•Cuántos números terminan en cada uno 
////		de los dígitos (0 .. 9).
//		•El dígito en el que más números terminan.
//		•En qué dígitos no ha terminado 
////		ningún número.Pista: crear un vector de contadores de 10 elementos
		System.out.println("Introduce numeros entre el 1 y el 1000");
		int numero;
		 int[] lista = new int[]{ 0,0,0,0,0,0,0,0,0,0}; 
		 int acumulador=0;
		 int numelementos=0;
		 double media;
		int pos=0;
		boolean salir=false;
		char c;
		do {
			numero=Integer.parseInt(sc.nextLine());
			if (numero<=1000 && numero>0) {
	            pos++;
	            System.out.println("¿Desea introducir algun numero? S/N'");
	            c=sc.nextLine().charAt(0);
	            if (c=='S') {
	            	salir=true;
	            }else if(c=='N') {
	            	salir=false;
	            }
			}
		}while(salir);
		media=acumulador/pos;
		System.out.println(media);
	}
	
}
