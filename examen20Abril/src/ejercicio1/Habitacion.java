package ejercicio1;
//Lo pongo abstracto ya que creo la Habitacion general y apartir de esta se crean las demas habitaciones con sus caracteristicas
//especificas
public abstract class Habitacion extends Instalacion{
	TIPOHABITACION tipohabitacion;
	private int aforo;
	/*
	 * Constructor que hereda del hotel
	 */
	public Habitacion(int aforo, TIPOHABITACION tipohabitacion) {
		this.aforo = aforo;
		this.tipohabitacion = tipohabitacion;
	}
	/*
	 * Getters y Setters
	 */
	public TIPOHABITACION getTipohabitacion() {
		return tipohabitacion;
	}
	public void setTipohabitacion(TIPOHABITACION tipohabitacion) {
		this.tipohabitacion = tipohabitacion;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	//Codigo unico de habitacion
	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 65;
		result = prime * result + aforo;
		result = prime * result + ((tipohabitacion == null) ? 0 : tipohabitacion.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Habitacion [tipohabitacion=" + tipohabitacion + ", aforo=" + aforo + "]";
	}
	
}
