package ejercicio1;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exceptions{
		// TODO Auto-generated method stub
		//Creo el empleado pepe y le asigno la contrasena null
		Empleado pepe=new Empleado("Pepe", 43, "M", "9 a 15", "123unpasitoPalanteMaria", null);
		//Como puede que de una excepcion hago un try/catch para capturar en caso de excepcion
		//Como la contrasena si cumple los requisitos, no lanza ninguna excepcion
		try {
			pepe.setContrasena("123MARiaaaaa");
		} catch (Exception e) {
			String pruebanueva;
			pruebanueva=sc.nextLine();
			try {
				pepe.setContrasena(pruebanueva);
			} catch (Exception e1) {
				System.out.println("Se te acabaron los intentos");
			}
		}
		//En este caso no cumple los requisitos. Asi que no te va a dejar
		Empleado antonio=new Empleado("Antonio", 43, "M", "9 a 15", "Elsatascado", null);
		try {
			pepe.setContrasena("Macarena");
		} catch (Exception e) {
			String pruebanueva;
			System.out.println("La contrasena no cumple con los requisitos , tiene 1 intento mas.");
			pruebanueva=sc.nextLine();
			try {
				pepe.setContrasena(pruebanueva);
			} catch (Exception e1) {
				System.out.println("Se te acabaron los intentos");
			}
		}
		//Aqui compruebo si ambos son iguales, mediante el hascode. Como ambos tienen el mismo id , devolvera TRUE, da igual que los demas
		//Atributos sean distintos, porque en el metedo de generacion del HASCODE en la clase empleado solo se genera a partir del id porque asi
		//Se lo he indicado yo
		Profesor JM=new Profesor("Jose Manuel", 20, "H", "8-15", "1231231", "123UNDOStres", "Informatica", "Programacion", "Primero");
		Profesor JM1=new Profesor("Jose Maria", 25, "M", "8-12", "1231231", "123UNDOStre23s", "Informatica", "Programacion", "Segundo");
		System.out.println(JM.equals(JM1));
		//Aqui voy  a comprobar que los de direccion , solo pueden elegir las tres opciones validas
		Direccion ildefonso=new Direccion("Ildefonso", 12, "V", "2-14", "1231231", "PerisCCOO111",
				"Matematicas", "Integrales", "Cuarto ESO", "Brenes", null);
		try {
			ildefonso.setCompetencias("Secrettaaria");
		} catch (Exception e) {
			String pruebanueva="";
			System.out.println("Tiene un intento mas para escribirlo bien");
			pruebanueva=sc.nextLine();
			try {
				ildefonso.setCompetencias(pruebanueva);
			} catch (Exception e1) {
				System.out.println("Se te acabaron los intentos");
			}
		}
		//Como no esta bien escrito , te lo vuelve a pedir e intento uan vez que pueda hacerlo.
		
		//Esto te imprime los datos profesionales de este nuevo objeto
		Empleado JMZ=new Profesor("Jose Manuelzz", 20, "H", "8-15", "12312331", "123UNDOStresAS", "Informatica", "Programacion", "Primero");

		System.out.println(JMZ);
		//Esto lso datos generales de JM
		System.out.println((Empleado)JM);
	}

		
}
