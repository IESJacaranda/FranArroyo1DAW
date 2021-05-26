package clases;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	
	private String nombre;
	private Set<Materia>materias;
	
	public Curso(String nombre) {
		this.nombre = nombre;
		this.materias = new HashSet<Materia>();
	}
	
	public Curso() {}
	
	public void addMateria(Materia m) {
		if(!this.materias.contains(m)) {
			this.materias.add(m);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Set<Materia> getMaterias() {
		return materias;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Curso))
			return false;
		Curso other = (Curso) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Curso: " + nombre);
		
		for(Materia i: materias) {
			sb.append(i.toString()+" ");
		}
		
		return sb.toString();
	}
	
	

}
