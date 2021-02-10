package banco;
import java.util.Scanner;
public class Principal {
	public final static String MENU="1.Hacer un reintegro,se pedirá la cantidad a retirar \n2.Hacer un ingreso \n3.Consultar saldo \n4.Salir";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eleccion;
		boolean finalizar=false;
		Cuenta cuenta=new Cuenta();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while (!finalizar) {
			MostrarMenu();
			eleccion=Integer.parseInt(sc.nextLine());
			switch (eleccion) {
			case 1:
				System.out.println("Que cantidad quiere retirar");
				double cantidadaretirar=Double.parseDouble(sc.nextLine());
				try {
					cuenta.hacereintegroo(cantidadaretirar);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("El valor retirado no se puede");
				}
				break;
			case 2:
				System.out.println("Que cantidad quiere retirar");
				double cantidadaingresar=Double.parseDouble(sc.nextLine());
				try {
					cuenta.haceringreso(cantidadaingresar);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("El valor retirado no se puede");
				}
				break;
			case 3:
				System.out.println(cuenta.getStatus());
				break;
			case 4:
				System.out.println(cuenta.getSaldo());
				finalizar=true;
				break;
			default:
				break;
			}
			}
			}
private static void MostrarMenu() {
	System.out.println(MENU);
}
	}
