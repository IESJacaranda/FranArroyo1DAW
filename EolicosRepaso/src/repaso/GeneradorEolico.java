package repaso;

import java.time.LocalDate;

public class GeneradorEolico extends Generador implements Monetizable {
	private int numaspas;
	public GeneradorEolico(LocalDate fechafuncionamiento, String localidad, double potencia,int numaspas) {
		super(fechafuncionamiento, localidad, potencia);
		this.numaspas=numaspas;
	}
	public int getNumaspas() {
		return numaspas;
	}
	public void setNumaspas(int numaspas) {
		this.numaspas = numaspas;
	}
	@Override
	public String toString() {
		return super.toString()+" y es de tipo EOLICO y tiene " + numaspas +" de aspas";
	}
	@Override
	public double Dinero(double precioenergia) {
		double dinerogenerado=numaspas*super.getPotencia()*numaspas;
		return dinerogenerado;
	}

}
