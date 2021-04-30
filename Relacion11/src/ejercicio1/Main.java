package ejercicio1;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main (String args[]) {
        int eleccion;

        do {
        	System.out.println(MostrarMenu());
            System.out.println("Introduce una opcion");
            eleccion=Integer.parseInt(sc.nextLine());
            Equipo equipo1=new Equipo();
            equipo1.setNombrequipo("Sevilla FC");
            equipo1.InicializarHashSet();
            Alumno al1=new Alumno("Pepe","212312312D");
            Alumno al2=new Alumno("Manuela","212312Z");
            Alumno al3=new Alumno("Inma","21232H");
            Alumno al4=new Alumno("Rodolfo","2123X");
            switch (eleccion) {
    		case 1:
    			try {
					System.out.println(equipo1.AddAlumno(al1));
				} catch (Exception e) {
					e.printStackTrace();
				}
    			break;
    		case 2:
    			break;
    		case 3:
    			break;
    		case 4:
    			break;
    		case 5:
    			break;
    		default:
    			
    		}			
		} while (eleccion!=6);

    }
	public static String MostrarMenu() {
		String MENU="1.Añadir alumno\n"
				+ "2.Borrar alumno\n"
				+ "3.Alumno pertece a que equipo\n"
				+ "4.Mostrar lista de personas del equipo\n"
				+ "5.Unificar equipos\n"
				+ "6.Salir";
		return MENU;
	}
}
