package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Localidad {
	
	private String nombre;
	private List<Centro>centros;
	
	public Localidad(String nombre){
		this.nombre = nombre;
		this.centros = new ArrayList<Centro>();
	}
	
	public Localidad() {}

	public String getNombre() {
		return nombre;
	}

	public List<Centro> getCentros() {
		return centros;
	}
	
	public void addCentro(Centro centro, Curso curso, Materia ma) {//se le pasa un String para obtener la posicion para luego 
		if(!centros.contains(centro)){
			centros.add(centro);                //poder cargar las listas definitivas leyendo el archivo
		}else {
			this.centros.get(this.centros.indexOf(centro)).addCurso(curso, ma);
		}
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
		if (!(obj instanceof Localidad))
			return false;
		Localidad other = (Localidad) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Localidad: " + nombre);
		
		for(Centro i: centros) {
			sb.append(i.toString()+" ");
		}
		
		return sb.toString();
	}

	
}
