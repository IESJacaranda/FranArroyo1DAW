package plataforma;

public class Pelicula extends Producto{
	private int duracion;



	public Pelicula(String nombre, String tema, int anoestreno, int numvisualizaciones,int duracion) {
		super(nombre, tema, anoestreno, numvisualizaciones);
		this.duracion=duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return super.toString()+"Pelicula [duracion=" + duracion + "]";
	}
}
