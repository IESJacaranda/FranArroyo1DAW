package ejercicio2;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int eleccion=0;
		do {
			System.out.println(MostrarMenu());
			eleccion=Integer.parseInt(sc.nextLine());
			switch (eleccion) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			default:
				break;
			}
		}while (eleccion>8);
	}
	public static String MostrarMenu() {
		final String MENU="1.Editorial mas usada por provincia\n"
				+ "2.Editorial mas usada llamado por provincia\n"
				+ "3.Editorial mas usada en una localidad\n"
				+ "4.Editorial mas usada en una materia\n"
				+ "5.Listado de todos los libros usados en todas las materias de un centro\n"
				+ "6.Listado de todos los libros usasdos en todas las materias de una localidad\n"
				+ "7.Listados de todos los libros usados en una materia de una localidad";
		return MENU;
	}

}
