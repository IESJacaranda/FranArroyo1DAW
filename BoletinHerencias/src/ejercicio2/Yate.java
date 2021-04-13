package ejercicio2;

public class Yate extends Barco {

	private int camarotes;
	private double potenciaCV;
	
	public Yate(double eslora, int anyo, String matricula, int camarotes, double potenciaCV) {
		super(eslora, anyo, matricula);
		this.camarotes = camarotes;
		this.potenciaCV = potenciaCV;
	}



	public double getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

}