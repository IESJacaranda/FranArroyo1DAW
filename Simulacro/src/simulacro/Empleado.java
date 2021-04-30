package simulacro;

public abstract class Empleado {
	private String dni;
	private String nombre;
	protected double sueldo;
	
	public Empleado() {
		super();
	}

	public Empleado(String dni, String nombre, double sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {

		return sueldo;
	}
//Este metodo lanzara excepciones, aunque no en esta clase si no en las de Empleado 
	public void setSueldo(double sueldo) throws Exception {
		this.sueldo = sueldo;
	}
}
