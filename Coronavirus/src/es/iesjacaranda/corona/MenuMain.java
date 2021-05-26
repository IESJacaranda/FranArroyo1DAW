package es.iesjacaranda.corona;
import java.util.Scanner;
public class MenuMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eleccion=0;
		do {
			System.out.println(MostrarMenu());
			System.out.println("Introduce la opcion deseada");
			eleccion=Integer.parseInt(sc.nextLine());
			switch (eleccion) {
			case 1:
				
				break;
			case 2:
				int dia;
				String mes;
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				System.out.println("Eleccion Incorrecta, si desea salir pulsa 7");
			}
		}while (eleccion!=7);
	}
	public static String MostrarMenu() {
		String MENU="1.Mostrar mejor Dia\n"
				+ "2.Mostrar mejor dia apartir de\n"
				+ "3.Mostrar peor dia\n"
				+ "4.Mostrar peor dia apartir de \n"
				+ "5.Numero de contagiados/muertes/altas en un dia\n"
				+ "6.Mostrar media de contagiados muertes y curados\n"
				+ "7.Salir";
		return MENU;
	}
}
