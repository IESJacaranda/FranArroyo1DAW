package clases;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
	
	private String nombre;
	private List<Localidad> localidades; 
	
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.localidades = new ArrayList<Localidad>();
	}
	
	public Provincia() {}
	
	public void addLocalidad(Localidad local, Centro centro, Curso curso, Materia ma) {
		if(!this.localidades.contains(local)) {
			localidades.add(local);
		}else {
			this.localidades.get(this.localidades.indexOf(local)).addCentro(centro, curso, ma);;
		}
	}

	public String getNombre() {
		return nombre;
	}
	

	public List<Localidad> getLocalidades() {
		return localidades;
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
		if (!(obj instanceof Provincia))
			return false;
		Provincia other = (Provincia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Provincia: " + nombre);
		
		for(Localidad i: localidades) {
			sb.append(i.toString()+" ");
		}
		
		return sb.toString();
	}
	
	

}
