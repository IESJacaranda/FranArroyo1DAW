package ejercicio2;

import static ejercicio2.Alquiler.VALOR_FIJO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	
	private Cliente cliente;
	private Barco barco;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String posicionAmarre;
	public final static int VALOR_FIJO = 20;
	private double precio;
	
	public Alquiler(Cliente cliente, Barco barco, LocalDate fechaInicio, LocalDate fechaFin, String posicionAmarre) {
		this.cliente = cliente;
		this.barco = barco;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.posicionAmarre = posicionAmarre;
		this.precio = calcularAlquiler();
	}
	
	public Alquiler() {}
	
	
	public double calcularAlquiler() {
		int dias = (int) ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin.plusDays(1)); //plusDays(1) para incluir el último día
		double alquiler = dias*(this.barco.getEslora()*10)*(VALOR_FIJO);
		if(this.barco instanceof Yate) {
			Yate yate = (Yate) this.barco;
			alquiler += yate.getPotenciaCV() + yate.getCamarotes();
		}else if(this.barco instanceof Velero) {
			Velero velero = (Velero) this.barco;
			alquiler += velero.getMastiles();
		}else if(this.barco instanceof Deportivo) {
			Deportivo deportivo = (Deportivo)this.barco;
			alquiler += deportivo.getPotenciaCV();
		}
		return alquiler;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPosicionAmarre() {
		return posicionAmarre;
	}

	public void setPosicionAmarre(String posicionAmarre) {
		this.posicionAmarre = posicionAmarre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getValorFijo() {
		return VALOR_FIJO;
	}
	
}
