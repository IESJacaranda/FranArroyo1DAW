package cafe;
import java.util.Scanner;
public class Principal {
	public final static String MENU="1.Servir cafe solo \n2.Servir leche \n3.Servir cafe con leche \n4.Consultar estado maquina \n5.Apagar maquina";

	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
private static void MostrarMenu() {
	System.out.println(MENU);
}
}
