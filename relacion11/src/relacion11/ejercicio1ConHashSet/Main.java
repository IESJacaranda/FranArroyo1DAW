package relacion11.ejercicio1ConHashSet;

import java.util.HashSet;
import java.util.Set;
import relacion11.ejercicio1.exception.AlumnoNoInvluidoException;
import relacion11.ejercicio1.exception.AlumnoYaIncluidoException;

public class Main {

	public static void main(String[] args) {
		
		//CREACI�N DE ALUMNOS
		Alumno alumno1 = new Alumno("Luis", "30245342I");
		Alumno alumno2 = new Alumno("Marta", "30240042G");
		Alumno alumno3 = new Alumno("Mat�as", "30243342R");
		Alumno alumno4 = new Alumno("Sonia", "44245342L");
		Alumno alumno5 = new Alumno("Dionisio", "30777342P");
		
		Alumno alumno6 = new Alumno("Loli", "30788342P");
		Alumno alumno7 = new Alumno("Tom�s", "31177342W");
		Alumno alumno8 = new Alumno("Sof�a", "39677342D");
		Alumno alumno9 = new Alumno("Juli�n", "30887342C");
		
		Alumno alumno10 = new Alumno("Mar�a", "32227342C");
		Alumno alumno11 = new Alumno("S�crates", "30999342F");
		
		//CREACI�N DE LISTAS
		Set<Alumno> alumnos = new HashSet<>();
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		
		Set<Alumno> alumnos2 = new HashSet<>();
		alumnos2.add(alumno6);
		alumnos2.add(alumno7);
		alumnos2.add(alumno8);
		alumnos2.add(alumno9);
		
		//PRUEBA DE M�TODOS DE ALUMNO
		//System.out.println(alumno1.toString());
		//System.out.println(alumno1.equals(alumno2));
		
		
		//CREACI�N DE EQUIPOS Y USO DE M�TODOS DE EQUIPO
		Equipo equipo1 = new Equipo("M5",alumnos);
		try {
			equipo1.addAlumno(alumno10);
			equipo1.addAlumno(alumno10); //Dar� excepci�n
		} catch (AlumnoYaIncluidoException e) {
			System.out.println(e.getMessage());
			}
		
		try {
			equipo1.borraAlumno(alumno10);
		} catch (AlumnoNoInvluidoException e) {
			System.out.println(e.getMessage());
		}
		
		//SACAR� SOLO AL ALUMNO 11 (S�CRATES) PORQUE ES EL �NICO QUE EST� EN AMBAS LISTAS USANDO uneYMuestraJugadoresComunes():
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
