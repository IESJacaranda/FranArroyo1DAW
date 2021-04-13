package ejercicio2;

public class Velero extends Barco {

	private int mastiles;
	
	public Velero(double eslora, int anyo, String matricula,int mastiles) {
		super(eslora, anyo, matricula);
		this.mastiles = mastiles;
	}

	public int getMastiles() {
		return mastiles;
	}

	public void setMastiles(int mastiles) {
		this.mastiles = mastiles;
	}

	

	
}