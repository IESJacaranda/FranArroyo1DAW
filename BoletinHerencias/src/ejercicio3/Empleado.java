package ejercicio3;

public abstract class Empleado {
	private String nombre;
	private int edad;
	private String nif;
	private Double sueldo;
	
	public Empleado(String nombre, int edad, String nif, Double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public Double CalcularSueldo(Double sueldo) {
		this.sueldo=sueldo;
		return sueldo;
	}
	
	
}
