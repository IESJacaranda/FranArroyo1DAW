package ejercicioInterfaz;

public class Edificio implements Iedificio {
	private double largo;
	private double ancho;
	private int plantas;
	private int habitantes;


	public Edificio(double largo, double ancho, int plantas,int habitantes) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.plantas = plantas;
		this.habitantes=habitantes;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return ancho*largo*plantas;
	}

	@Override
	public double getPredioEdificio() {
		// TODO Auto-generated method stub
		return PRECIO_POR_METRO*getPredioEdificio();
	}
	
	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
}
