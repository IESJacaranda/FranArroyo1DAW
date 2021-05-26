package ejercicio2;

public class Libro extends Asignatura {
	private String nombre;
	private String editorial;
	private String ean;
	private boolean digital;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public boolean isDigital() {
		return digital;
	}
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
}
