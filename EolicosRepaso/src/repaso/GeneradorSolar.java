package repaso;

import java.time.LocalDate;

public class GeneradorSolar extends Generador implements Monetizable {
	private int numpaneles;
	private double m2;
	private Tipogenerador valor;
	public GeneradorSolar(LocalDate fechafuncionamiento, String localidad, double potencia, int numpaneles, double m2,Tipogenerador valor) {
		super(fechafuncionamiento, localidad, potencia);
		this.numpaneles=numpaneles;
		this.m2=m2;
		this.valor=valor;
	}
	public int getNumpaneles() {
		return numpaneles;
	}
	public void setNumpaneles(int numpaneles) {
		this.numpaneles = numpaneles;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public Tipogenerador getValor() {
		return valor;
	}
	public void setValor(Tipogenerador valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "y es de tipo SOLAR del tipo " + valor + " y su coeficiente es :"+numpaneles/m2;
	}
	@Override
	public double Dinero(double precioenergia) {
		double dinerogenerado;
		dinerogenerado=super.getPotencia()*numpaneles*precioenergia;
		return dinerogenerado;
	}

}
