package relacion11.ejercicio2;

public class Integer {
	
	private String nombre;
	private String dni;
	
	public Integer(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Integer() {}

	@Override
	public String toString() {
		return "Nombre del alumno: " + nombre + ", con dni " + dni;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales = true;
		}else if (obj instanceof Integer){
			if(this.nombre == ((Integer)obj).nombre && this.dni == ((Integer)obj).dni){
				sonIguales = true;
			}
		}
		return sonIguales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
