package ejercicio2;

import static ejercicio2.Alquiler.VALOR_FIJO;


public class Barco {

	protected double eslora;
	protected int ano;
	protected String matricula;

	public Barco(double eslora, int ano, String matricula) {
		this.ano = ano;
		this.matricula = matricula;
		this.eslora = eslora;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public int getAnyo() {
		return ano;
	}

	public void setAnyo(int anyo) {
		this.ano = anyo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}