package relacion11.ejercicio5;

public abstract class Persona {
	
	int edad;
	String nombre;
	
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	abstract Mensaje enviar(Persona persona, String text) throws Exception;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
