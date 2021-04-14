package ejercicio2;



public abstract class Barco {

	protected double eslora;
	protected int ano;
	protected String matricula;
	public double VALOR_METROS=10;
	public double CONSTANTE_MULT=20;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double obtenerFactorMultiplicacion() {
		return eslora*VALOR_METROS*CONSTANTE_MULT;
	}
	
	
}