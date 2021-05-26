package plataforma;

public abstract class Producto {
	private String nombre;
	private Tema tema;
	private int anoestreno;
	private int numvisualizaciones;
	private static int menorano=0;
	private int aux;
	private int opc;

	

	public Producto(String nombre, String tema, int anoestreno, int numvisualizaciones) {
		super();
		this.nombre = nombre;
		this.tema = Tema.valueOf(tema);
		this.anoestreno = anoestreno;
		this.numvisualizaciones = numvisualizaciones;
	}
	
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public int getAnoestreno() {
		return anoestreno;
	}
	public void setAnoestreno(int anoestreno) {
		this.anoestreno = anoestreno;
	}
	public int getNumvisualizaciones() {
		return numvisualizaciones;
	}
	public void setNumvisualizaciones(int numvisualizaciones) {
		this.numvisualizaciones = numvisualizaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDuracion(int duracion) {
		duracion = duracion;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tema=" + tema + ", anoestreno=" + anoestreno + ", numvisualizaciones="
				+ numvisualizaciones + ", aux=" + aux + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoestreno;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (anoestreno != other.anoestreno)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
