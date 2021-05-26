package ejercicio1;

public class HabitacionDoble extends Habitacion{
	private final int AFORO_MAXIMO=2;
	private int aforo;
	
	public HabitacionDoble(int aforo, TIPOHABITACION tipohabitacion) {
		super(aforo, tipohabitacion);
		this.aforo=AFORO_MAXIMO;
		this.tipohabitacion=TIPOHABITACION.DOBLES;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

}
