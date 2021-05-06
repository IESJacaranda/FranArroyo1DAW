package relacion11.ejercicio1;
import java.util.ArrayList;
import java.util.List;
import relacion11.ejercicio1.exception.AlumnoNoInvluidoException;
import relacion11.ejercicio1.exception.AlumnoYaIncluidoException;

public class Equipo {
	private String nombreEquipo;
	private List<Alumno> alumnos;
	
	public Equipo(String nombreEquipo, List<Alumno> alumnos) {
		this.nombreEquipo = nombreEquipo;
		List<Alumno> alumnos1 = new ArrayList<Alumno>();
		alumnos1.addAll(alumnos);
		this.alumnos = alumnos1; 
	}

	//AÑADIR UN ALUMNO
	public void addAlumno(Alumno alumno) throws AlumnoYaIncluidoException {
		if(incluidoEnLista(alumno)) {
				throw new AlumnoYaIncluidoException();
		}else {
			alumnos.add(alumno);
		}
	}
			
	private boolean incluidoEnLista(Alumno alumno) {
		boolean incluido = false;
		for(Alumno i: alumnos) {
			if(i.equals(alumno)) {
				incluido = true;
			}
		}
		return incluido;
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
		for(Alumno i: alumnos) {
			sb.append(i.getNombre() + "\n");
		}
		return sb.toString();
	}
	
	//UNIR Y MOSTRAR JUGADORES 
	public void uneEquipos(Equipo otroEquipo) {
		this.alumnos.addAll(otroEquipo.alumnos) ;
		mostrarListaPersonas();
	}
	
	//MOSTRAR JUGADORES EN AMBOS EQUIPOS
	public void uneYMuestraJugadoresComunes(Equipo otro) {
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

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
