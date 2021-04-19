package ejercicio3;

import java.util.Date;

import ejercicio1.Persona;

public class EmpleadoFijo extends Persona {
	Date anoentrada;
	public EmpleadoFijo(String nombre, int edad, String dni,Date anoentrada) {
		super(nombre, edad, dni);
		this.anoentrada=anoentrada;
	}
	public Date getAnoentrada() {
		return anoentrada;
	}
	public void setAnoentrada(Date anoentrada) {
		this.anoentrada = anoentrada;
	}

}
