package ejercicio3;

public class Main {
	
 public static void main(String[] arg) throws Exception {
	Jarra jarra1 = new Jarra(10);
	Jarra jarra2 = new Jarra(12);
	jarra1.llena();
	jarra2.vacia();
	System.out.println("Jarra 1"+jarra1.toString());
 	System.out.println("Jarra 2"+jarra2.toString());
 	jarra2.llenaDesde(jarra1);
 	jarra1.llena();
 	jarra2.llenaDesde(jarra1);
 	jarra2.vacia();
 	jarra2.llenaDesde(jarra1);
 	jarra1.llena();
 	jarra2.llenaDesde(jarra1);
 	System.out.println("Jarra 1"+ jarra1.toString());
 	System.out.println("Jarra 2"+ jarra2.toString());
 	}
}
