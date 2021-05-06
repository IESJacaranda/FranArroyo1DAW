package relacion11.ejercicio1ConHashSet;

import java.util.HashSet;
import java.util.Set;
import relacion11.ejercicio1.exception.AlumnoNoInvluidoException;
import relacion11.ejercicio1.exception.AlumnoYaIncluidoException;

public class Equipo {
	private String nombreEquipo;
	private Set<Alumno> alumnos;
	
	public Equipo(String nombreEquipo, Set<Alumno> alumnos) {
		this.nombreEquipo = nombreEquipo;
		this.alumnos = alumnos; 
	}

	//AÑADIR UN ALUMNO
	public void addAlumno(Alumno alumno) throws AlumnoYaIncluidoException {
		if(incluidoEnLista(alumno)) {
			throw new AlumnoYaIncluidoException();
		}
		alumnos.add(alumno);//COMO ES UN SET, NO SE INCLUIRÁ SI EL NOMBRE ESTÁ YA DENTRO
	}
			
	private boolean incluidoEnLista(Alumno alumno) {
		return alumnos.contains(alumno);
	}
	
	//BORRAR UN ALUMNO
	public void borraAlumno(Alumno alumno) throws AlumnoNoInvluidoException {
		if(!alumnos.remove(alumno)) {
			throw new AlumnoNoInvluidoException();
		}
	}
	
	//SABER SI UN ALUMNO PERTENECE A UN EQUIPO (SE BUSCARÁ EN TODOS LOS EQUIPOS)
	public Alumno perteneceAEquipo(Alumno alumno) {
		if(!incluidoEnLista(alumno)){
			alumno = null;
		}
		return alumno;
	}
	
	//MOSTRAR LISTA DE PERSONAS
	public String mostrarListaPersonas() {
		StringBuilder sb = new StringBuilder("Los alumnos del equipo son: \n");
		for(Alumno al: alumnos) {
			sb.append(al.getNombre() + "\n");
		}
		return sb.toString();
	}
	
	//UNIR Y MOSTRAR JUGADORES 
	public void uneEquipos(Equipo otroEquipo) {
		this.alumnos.addAll(otroEquipo.alumnos) ;
	}
	
	//MOSTRAR JUGADORES EN AMBOS EQUIPOS
	public void uneYMuestraJugadoresComunes(Equipo otro) {
		this.alumnos.retainAll(otro.alumnos);
	}
	
	//SETTERS & GETTERS
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
