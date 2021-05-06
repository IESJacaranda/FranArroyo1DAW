package relacion11.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import relacion11.ejercicio1.exception.AlumnoNoInvluidoException;
import relacion11.ejercicio1.exception.AlumnoYaIncluidoException;

public class EquipoGenerico <T>{
	private String nombreEquipo;
	private List<T> alumnos;
	
	public EquipoGenerico(String nombreEquipo, List<T> alumnos) {
		this.nombreEquipo = nombreEquipo;
		this.alumnos = new ArrayList<T>(alumnos); 
	}

	//AÑADIR UN ALUMNO
	public void addAlumno(T alumno) throws AlumnoYaIncluidoException {
		if(incluidoEnLista(alumno)) {
				throw new AlumnoYaIncluidoException();
		}else {
			alumnos.add(alumno);
		}
	}
			
	private boolean incluidoEnLista(T alumno) {
		boolean incluido = false;
		for(T i: alumnos) {
			if(i.equals(alumno)) {
				incluido = true;
			}
		}
		return incluido;
	}
	
	//BORRAR UN ALUMNO
	public void borraAlumno(T alumno) throws AlumnoNoInvluidoException {
		if(!alumnos.remove(alumno)) {
			throw new AlumnoNoInvluidoException();
		}
	}
	
	//SABER SI UN ALUMNO PERTENECE A UN EQUIPO (SE BUSCARÁ EN TODOS LOS EQUIPOS)
	public T perteneceAEquipo(T alumno) {
		if(!incluidoEnLista(alumno)){
			alumno = null;
		}
		return alumno;
	}
	
	//MOSTRAR LISTA DE PERSONAS
	public String mostrarListaPersonas() {
		StringBuilder sb = new StringBuilder("Los alumnos del equipo son: \n");
		for(T i: alumnos) {
			sb.append(i + "\n");
		}
		return sb.toString();
	}
	
	//UNIR Y MOSTRAR JUGADORES 
	public void uneEquipos(EquipoGenerico<T> otroEquipo) {
		this.alumnos.addAll(otroEquipo.alumnos) ;
		mostrarListaPersonas();
	}
	
	//MOSTRAR JUGADORES EN AMBOS EQUIPOS--> Para que devolviera un equipo: Equipo<T>
	public void uneYMuestraJugadoresComunes(EquipoGenerico<T> otro) {
		//Equipo<T> union = new Equipo<T>("Unión",otro.alumnos);
		//union.getAlumnos().addAll(otro.getAlumnos());
		//union.getAlumnos().addAll(getAlumnos());
		this.alumnos.retainAll(otro.alumnos);
		mostrarListaPersonas();
	}
	
	//SETTERS & GETTERS
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public List<T> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<T> alumnos) {
		this.alumnos = alumnos;
	}

}
