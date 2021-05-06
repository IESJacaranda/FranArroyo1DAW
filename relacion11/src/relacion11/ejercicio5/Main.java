package relacion11.ejercicio5;

public class Main {

	public static void main(String[] args) {

		Buzon b = new Buzon();
		
		Persona p1 = new Alumno(14, "Lucas");
		Persona p2 = new Alumno(19, "Lola");
		
		Persona p3 = new Profesor(35, "Toni");
		Persona p4 = new Profesor(40, "Pilar");
		
		try {
			b.addMensaje(p1.enviar(p2, "estoy llegando"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b.addMensaje(p2.enviar(p3, "XD"));
			b.addMensaje(p3.enviar(p1, "compra tomates"));
			b.addMensaje(p4.enviar(p3, "tenemos que hablar"));
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		//Muestra todos los mensajes
		System.out.println(b.toString());
		
		//Muestra mensajes ordenados por fecha
		System.out.println(b.muestraOrdenadosPorNombre());
		
		//Borrar
		try {
			b.borraMensaje(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Buscar por frase
		try {
			b.encuentraMensajePorFrase("XD");
			b.encuentraMensajePorFrase("jiji");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
