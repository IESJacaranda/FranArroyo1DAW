package ejercicio3;

import java.sql.Date;

public class EmpleadoTemporal extends Empleado {
	Date fechaentrada;
	Date fechasalida;
	
	public EmpleadoTemporal(String nombre, int edad, String nif, Double sueldo) {
		super(nombre, edad, nif, sueldo);
		this.fechaentrada=fechaentrada;
		this.fechasalida=fechasalida;
	}
	
	public Date getFechaentrada() {
		return fechaentrada;
	}
	public void setFechaentrada(Date fechaentrada) {
		this.fechaentrada = fechaentrada;
	}
	public Date getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}
}
