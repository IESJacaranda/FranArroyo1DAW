package repaso;

import java.time.LocalDate;

public abstract 
class  Generador {
	private int codigo;
	private LocalDate fechafuncionamiento;
	private String localidad;
	private double potencia;
	private static int codigoSeq=0;
	public Generador(LocalDate fechafuncionamiento, String localidad, double potencia) {
		this.codigo = codigoSeq;
		this.fechafuncionamiento = fechafuncionamiento;
		this.localidad = localidad;
		this.potencia = potencia;
		codigoSeq++;

	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getCodigo() {
		return codigo;
	}
	public LocalDate getFechafuncionamiento() {
		return fechafuncionamiento;
	}
	public String getLocalidad() {
		return localidad;
	}
	@Override
	public String toString() {
		return "El codigo del generador es" + codigo + " su fechafuncionamiento es " + fechafuncionamiento + ","
				+ " la localidad es: "
				+ localidad + "y su potencia es de: " + potencia;
	}
}	
