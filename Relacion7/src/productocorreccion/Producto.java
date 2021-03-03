package productocorreccion;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precio;
	public static double IVA=20;

	
	public Producto() {}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static double getIva() {
		return IVA;
	}

	
	public Producto(String descripcion,double precio) {
		this.descripcion=descripcion;
		this.precio=precio;
	}
	@Override
	public int hashCode() {
		return this.descripcion.hashCode()+String.valueOf(this.precio).hashCode();

	}
	@Override
	public boolean equals(Object obj) {
		boolean soniguales=false;
		if(this==obj) {
			soniguales=true;
		}else if (obj!=null && obj instanceof Producto && ((Producto)obj).hashCode()==this.hashCode()) {
			soniguales=true;
		}
		
		return soniguales;
	}
	@Override
	public String toString() {
		
		return "{ Descripcion: "+ this.descripcion+ " y su precio "+this.precio+" Y su iva es "+IVA;
	}
}
	