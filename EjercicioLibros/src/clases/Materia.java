package clases;



public class Materia {
	
	private String nombre;
	private Libros libro;
	
	public Materia(String nombre, Libros libro) {
		this.nombre = nombre;
		this.libro = libro;
	}
	
	public Materia() {}

	public String getNombre() {
		return nombre;
	}

	public Libros getLibro() {
		return libro;
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
		if (!(obj instanceof Materia))
			return false;
		Materia other = (Materia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Materia " + nombre + ", libro " + libro;
	}

	
	
}
