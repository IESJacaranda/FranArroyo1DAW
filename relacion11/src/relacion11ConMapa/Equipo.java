package relacion11ConMapa;

import java.util.HashMap;
import java.util.Map;
import relacion11ConMapa.exception.AlumnoContenidoException;
import relacion11ConMapa.exception.AlumnoNoContenidoException;

public class Equipo {
	private Map<String, String>equipo;
	private String nombreEquipo;
	
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.equipo = new HashMap<>();
	}
	
	
	public void addAlumnos(Alumno alumno) throws AlumnoContenidoException {
		if(equipo.containsKey(alumno.getDni())) {
			throw new AlumnoContenidoException();
		}else {
		equipo.put(alumno.getDni(), alumno.getNombre());
		}
	}
	
	public void removeAlumno(Alumno alumno) throws AlumnoNoContenidoException {
		if(equipo.containsKey(alumno.getDni())) {
			throw new AlumnoNoContenidoException();
		}else {
			equipo.remove(alumno.getDni());
		}
	}
	
	public void esMiembroEquipo(Alumno alumno) {
		equipo.remove(alumno.getDni());//Con esta función, si no es correcto, devuelve null.
	}
	
	public void muestraAlumnos() {
		for(String i: equipo.keySet()) {
			System.out.println(equipo.get(i));//IMPRIME VALORES(paso key, recibo valores)
		}
		System.out.println(equipo.values());//IMPRIME VALORES
		System.out.println(equipo.keySet());//imprime keys
	}

	public Map<String, String> getEquipo() {
		return equipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
		result = prime * result + ((nombreEquipo == null) ? 0 : nombreEquipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Equipo))
			return false;
		Equipo other = (Equipo) obj;
		if (equipo == null) {
			if (other.equipo != null)
				return false;
		} else if (!equipo.equals(other.equipo))
			return false;
		if (nombreEquipo == null) {
			if (other.nombreEquipo != null)
				return false;
		} else if (!nombreEquipo.equals(other.nombreEquipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String patata = "";
		for(String i: equipo.values()) {//IMPRIMIR VALORES EN TOSTRING MAPA
			patata += i + " ";
		}
		patata.trim();
		patata.replaceAll(" ",", ");
		return "NombreEquipo " + nombreEquipo + ", alumnos del equipo: " + patata;
	}
	
	
	
}
