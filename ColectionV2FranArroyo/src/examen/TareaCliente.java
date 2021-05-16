package examen;

public class TareaCliente extends Tarea{
	private String nombrecliente;
	private String localidad;
	public TareaCliente(String descripcion, Prioridad prioridad,String nombrecliente,String localidad) {
		super(descripcion,prioridad);
		this.localidad=localidad;
		this.nombrecliente=nombrecliente;
		
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	@Override
	public String toString() {
		return super.toString()+" TareaCliente de " + nombrecliente + " de " + localidad;
	}

}
