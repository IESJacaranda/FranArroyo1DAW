package ejercicio2;

public class Deportivo extends Barco {

	private double potenciaCV;
	
	public Deportivo(double eslora, int anyo, String matricula, double potenciaCV) {
		super(eslora, anyo, matricula);
		this.potenciaCV = potenciaCV;
	}

	public double getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	
	
}