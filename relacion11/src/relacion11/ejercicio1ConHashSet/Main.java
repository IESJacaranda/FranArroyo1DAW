package relacion11.ejercicio1ConHashSet;

import java.util.HashSet;
import java.util.Set;
import relacion11.ejercicio1.exception.AlumnoNoInvluidoException;
import relacion11.ejercicio1.exception.AlumnoYaIncluidoException;

public class Main {

	public static void main(String[] args) {
		
		//CREACIÓN DE ALUMNOS
		Alumno alumno1 = new Alumno("Luis", "30245342I");
		Alumno alumno2 = new Alumno("Marta", "30240042G");
		Alumno alumno3 = new Alumno("Matías", "30243342R");
		Alumno alumno4 = new Alumno("Sonia", "44245342L");
		Alumno alumno5 = new Alumno("Dionisio", "30777342P");
		
		Alumno alumno6 = new Alumno("Loli", "30788342P");
		Alumno alumno7 = new Alumno("Tomás", "31177342W");
		Alumno alumno8 = new Alumno("Sofía", "39677342D");
		Alumno alumno9 = new Alumno("Julián", "30887342C");
		
		Alumno alumno10 = new Alumno("María", "32227342C");
		Alumno alumno11 = new Alumno("Sócrates", "30999342F");
		
		//CREACIÓN DE LISTAS
		Set<Alumno> alumnos = new HashSet<>();
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		
		Set<Alumno> alumnos2 = new HashSet<>();
		alumnos2.add(alumno6);
		alumnos2.add(alumno7);
		alumnos2.add(alumno8);
		alumnos2.add(alumno9);
		
		//PRUEBA DE MÉTODOS DE ALUMNO
		//System.out.println(alumno1.toString());
		//System.out.println(alumno1.equals(alumno2));
		
		
		//CREACIÓN DE EQUIPOS Y USO DE MÉTODOS DE EQUIPO
		Equipo equipo1 = new Equipo("M5",alumnos);
		try {
			equipo1.addAlumno(alumno10);
			equipo1.addAlumno(alumno10); //Dará excepción
		} catch (AlumnoYaIncluidoException e) {
			System.out.println(e.getMessage());
			}
		
		try {
			equipo1.borraAlumno(alumno10);
		} catch (AlumnoNoInvluidoException e) {
			System.out.println(e.getMessage());
		}
		
		//SACARÁ SOLO AL ALUMNO 11 (SÓCRATES) PORQUE ES EL ÚNICO QUE ESTÁ EN AMBAS LISTAS USANDO uneYMuestraJugadoresComunes():
		Equipo equipo2 = new Equipo("2H",alumnos2);
		try {
			equipo2.addAlumno(alumno11);
		} catch (AlumnoYaIncluidoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(equipo2.mostrarListaPersonas());
		
		equipo1.uneEquipos(equipo2);
		
		try {
			equipo2.addAlumno(alumno1);
		} catch (AlumnoYaIncluidoException e) {
			System.out.println(e.getMessage());
		}
		equipo2.uneYMuestraJugadoresComunes(equipo1);
		System.out.println(equipo2.mostrarListaPersonas());
	}
}
