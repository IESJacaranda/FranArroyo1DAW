package ejercicioInterfaz;

public class Tienda implements LocalComercial {
	private double largo;
	private double ancho;
	private String actividad;
	private int cantidadProducto;
	
	public Tienda(double largo, double ancho, String actividad) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.actividad = actividad;
	}

	public String getActividadComercial() {
		this.actividad=actividad;
		return actividad;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return largo*ancho;
	}

	@Override
	public double getPredioEdificio() {
		// TODO Auto-generated method stub
		return getSuperficieEdificio()*PRECIO_METRO_LOCAL_COMERCIAL;
	}

}
