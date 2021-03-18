package ejercicio5;

import java.util.Scanner;

public class Main {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Equipos
		Equipo equipo1 = new Equipo("Betis", "Benito Villamarín", "Sevilla");
		Equipo equipo2 = new Equipo("Sevilla F.C", "Sánchez Pizjuan", "Sevilla");
		Equipo equipo3 = new Equipo("Real Madrid", "Santiago Bernabeu", "Madrid");
		Equipo equipo4 = new Equipo("Cádiz", "Carranza", "Cádiz");
		crearPartido1(equipo1, equipo2);
		crearPartidos2y3(equipo1, equipo2, equipo3, equipo4);
	}
	private static void crearPartidos2y3(Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4) {
		Partido partido2;
		Partido partido3;
		int jornada;
		boolean hayError=false;
		do {
			try {	
				jornada=solicitarInt("Introduzca la jornada para partido: ");
				partido2 = new Partido(jornada, equipo1, equipo3);
				partido2.ponerResultado("0-0");
				jornada=solicitarInt("Introduzca la jornada para partido: ");
				partido3 = new Partido(jornada, equipo2, equipo4);
				partido3.ponerResultado("0-1");
				System.out.println(partido2);
				System.out.println(partido3);
				hayError = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				hayError = true;
			}
		} while (hayError);
	}
	private static void crearPartido1(Equipo equipo1, Equipo equipo2) {
		Partido partido1;
		int jornada;
		try {
			jornada=solicitarInt("Introduzca la jornada: ");
			partido1 = new Partido(jornada, equipo1, equipo2);
			System.out.println("Se ha creado el primer partido.");
			System.out.println("Estableciendo resultado...");
			partido1.ponerResultado("0-2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static int solicitarInt(String msg){
		int numero;
		System.out.println(msg);
		numero=Integer.parseInt(teclado.nextLine());	
		return numero;
	}
}