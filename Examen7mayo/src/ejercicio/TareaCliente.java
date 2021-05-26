package ejercicio;

import java.time.LocalDate;

public class TareaCliente extends Tarea{
	private String nombrecliente;
	private String nombreCiudad;
	public TareaCliente(int codigotarea, String descripcion, LocalDate fechaalta, boolean resuelta,String nombrecliente,String nombreCiudad) {
		super(codigotarea, descripcion, fechaalta, resuelta);
		this.nombreCiudad=nombreCiudad;
		this.nombrecliente=nombrecliente;
	}
	public TareaCliente(String descripcion, Prioridad prioridad, String cliente,String localidad) {
		super();
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	

}
