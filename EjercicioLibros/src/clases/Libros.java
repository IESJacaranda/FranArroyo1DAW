package clases;


public class Libros {
	
	private String titulo;
	private String ean;
	private String editorial;
	private boolean digital;
	
	public Libros(String titulo, String ean, String editorial, String digital) {
		super();
		this.titulo = titulo;
		this.ean = ean;
		this.editorial = editorial;
		if(digital=="N") {
			this.digital= false;
		}else {
			this.digital =true;
		}
	}
	
	public Libros() {}

	public String getTitulo() {
		return titulo;
	}

	public String getEan() {
		return ean;
	}

	public String getEditorial() {
		return editorial;
	}

	public boolean isDigital() {
		return digital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ean == null) ? 0 : ean.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Libros))
			return false;
		Libros other = (Libros) obj;
		if (ean == null) {
			if (other.ean != null)
				return false;
		} else if (!ean.equals(other.ean))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro " + titulo + ", ean " + ean + ", editorial " + editorial + ", digital " + ((digital==true) ? "S" : "N");
	}
	
	

}
