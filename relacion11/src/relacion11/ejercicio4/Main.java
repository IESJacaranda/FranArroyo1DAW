package relacion11.ejercicio4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		int opc;
		Historial h = new Historial();
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca una opción:");
			switch(opc) {
			case 1:{
				String pag = leerCadena("Introduzca la url");
				PaginaWeb paginaWeb = new PaginaWeb(pag);
				try {
					h.addPagina(paginaWeb);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}break;
			case 2:{
				System.out.println(h.toString());
			}break;
			case 3:{
				LocalDate fecha = obtenerFecha();
				System.out.println(h.consultaHistorialDia(fecha));
			}break;
			case 4:{
				h.borraHistorial();
			}break;
			case 5:{
				System.out.println("Adiós");
			}break;
			default:
				System.out.println("Opción inválida");
			break;
			}
		}while(opc != 5);
	}

	public static void mostrarMenu() {
		System.out.println("1.- añadir nueva página web\n"+
							"2.- consultar historial\n"+
							"3.- consultar historial de un día concreto\n"+
							"4.- borrar historial\n"+
							"5.- salir");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
	
	private static LocalDate obtenerFecha() {

		System.out.println("Introduzca la fecha paso a paso. Introduzca día: ");
		int day = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca mes: ");
		int month = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca año: ");
		int year = Integer.parseInt(teclado.nextLine());
		
		return LocalDate.of(year, month, day);
	}
}
