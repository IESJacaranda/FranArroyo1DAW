package relacion11ConMapa;

import java.util.List;
import java.util.Map;

public class Equipo2 {
	
	Map<String, List<Alumno>>equipo;
	
	public Equipo2(Map<String, List<Alumno>>equipo) {
		this.equipo = equipo;
	}
	
	public void addAlumno(String nombre, Alumno al) {
		equipo.get(nombre).add(al);
	}

}
