package examen;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int eleccion=0;
		Empresa jaca=new Empresa();
		do {
			System.out.println(MostrarMenu());
			eleccion=Integer.parseInt(sc.nextLine());
			switch (eleccion) {
			case 1:
				System.out.println("Has decidido anadir Tarea empresa");
				System.out.println(jaca.AddTareaEmpresa("Informatica","Arreglar pcs",Prioridad.BAJA));
				System.out.println(jaca.AddTareaEmpresa("Recursos Humanos","Contratar analista",Prioridad.MEDIA));
				System.out.println(jaca.imprimirListaTareas());
				break;
			case 2:
				System.out.println("Has decidido anadir Tarea Cliente");
				System.out.println(jaca.AddTareaCliente("Eliminar clientes inactivos", Prioridad.BAJA, "Juan", "Sevilla"));
				break;
			case 3:
				System.out.println(jaca.mostrarTareasFechaAlta());
				break;
			case 4:
				//Null pointer
				//System.out.println(jaca.mostrarTareasPrioridad());
				break;
			case 5:
				System.out.println(jaca.numTareasPendientes());
				
				break;
			case 6:
				break;

			}
		} while (eleccion!=7);
	}
	public static String MostrarMenu() {
		final String MENU="1.Anadir Tarea Empresa \n"
				+ "2.Anadir Tarea Cliente\n"
				+ "3.Mostrar Tareas\n"
				+ "4.Mostrar Tareas por prioridad\n"
				+ "5.Num Tareas pendientes\n"
				+ "6.Resolver Tareas\n"
				+ "7.Salir";
		return MENU;
	}
}
