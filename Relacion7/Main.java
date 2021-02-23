package control;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eleccion,codigo;
		Producto producto1=new Producto(1231, "Chorizo", 211);
		System.out.println(producto1.toString());
		Menu();
		eleccion=Integer.parseInt(sc.nextLine());
		System.out.println(producto1.getPrecio());
		switch (eleccion) {
		case 1:
			System.out.println("Introduce el codigo del producto");
			codigo=Integer.parseInt(sc.nextLine());
			break;
		case 2:
			System.out.println("Introduce el codigo del producto");
			codigo=Integer.parseInt(sc.nextLine());
			break;
		default:
			break;
		}
	}
	public static String Menu() {
		final String MENU="1.Consultar precio de producto\n"
				+ "2.Modificar producto"
				+ "";
		return MENU;
		
		
	}

}