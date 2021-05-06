package relacion11ConMapa;

public class Alumno {
	
	private String nombre;
	private String dni;
	
	public Alumno(String dni, String nombre) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Alumno() {}

	@Override
	public String toString() {
		return "Nombre del alumno: " + nombre + ", con dni " + dni;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales = true;
		}else if (obj instanceof Alumno){
			if(this.nombre == ((Alumno)obj).nombre && this.dni == ((Alumno)obj).dni){
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
