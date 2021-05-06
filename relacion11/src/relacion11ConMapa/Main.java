package relacion11ConMapa;

import relacion11ConMapa.exception.AlumnoContenidoException;

public class Main {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("12345678L", "Lucas");
		Alumno a2 = new Alumno("18885678L", "Marta");
		Equipo eq = new Equipo("M5");
		try {
			eq.addAlumnos(a1);
			eq.addAlumnos(a2);
		} catch (AlumnoContenidoException e) {
			System.out.println(e.getMessage());
		}
		
		
		eq.muestraAlumnos();
		System.out.println(eq.toString());
	}

}
