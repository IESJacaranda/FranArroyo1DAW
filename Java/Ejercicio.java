package dale;
import java.util.Scanner;

public class ejerciciotocho {
	static Scanner sc=new Scanner(System.in);
	//Constante
	public static final Double PI = 3.14;
	

	public static void main(String[] args) {
		// Variables
		int eleccion;
		// Inicio
		System.out.println("1.Ejercicio 1/n 2.Ejercicio 2/n Ejercicio 3...");
		eleccion=Integer.parseInt(sc.nextLine());
		switch (eleccion) {
		case 1:
			System.out.println(numeroSolucionesEcuacionSegundoGrado(-1,7,-10));
			
			break;
		case 2:
			break;
		case 3:
			break;
		}
			
				
	}
	
	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		int numsoluciones = 0;
		if (((Math.pow(b, 2)))-(4*a*c)>0) {
			numsoluciones=1;
		}else {
			if (((Math.pow(b, 2)))-(4*a*c)==0) {
				numsoluciones=2;
			}
			if (((Math.pow(b, 2)))-(4*a*c)<0){
				numsoluciones=0;
			}
		
		}
		return numsoluciones;
	}
	
	public static Double solucionSumaEcuacionSegundoGrado(int a, int b, int c) {
		return null;
		
	}
	
	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
	return (double) 1;	
	}	
	
	public static Double areaCirculo(Double r) {
		return 1.2;
	}
	
	public static Double longitudCirculo(Double r) {
		return 1.2;
	}
	
	public static boolean esMultiplo(int a, int b) {
		return true;
	}
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		
		return 1;
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
				
		return 2;
	}
	
	public static int maximoComunDivisor(int a, int b) {
		return 1;
	}
	
	public static int minimoComunMultiplo(int a, int b) {
		return 1;
	}
	
	public static String binario(int num) {
		return "asd";
	}
	
	public static int decimal(String num) {
		return 1;
	}
}