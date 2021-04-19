package ejercicio1;

public class Titular {
	private String nombre;
	private int edad;
	private String dni;
	
	
	public Titular() {
		super();
	}
	
	public Titular(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Titular de la cuenta:  "+ nombre + " su edad es " + edad + "y su dni es" + dni;
	}
	
}
