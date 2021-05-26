package ejercicio1;
/*
 * Extendemos de la clase abstracta, por lo tanto hereda todo del padre de la clase y especificamos lo
 * que necesita. Asi con el resto de habitaciones y lo de las salas practicamente lo mismo
 */
public class HabitacionSimple extends Habitacion {


	private final int AFORO_MAXIMO=1;
	public final double FACTORSIMPLE=1;
	private int aforo;
	public HabitacionSimple(int aforo, TIPOHABITACION tipohabitacion) {
		super(aforo, tipohabitacion);
		this.aforo=AFORO_MAXIMO;
		this.tipohabitacion=TIPOHABITACION.SIMPLES;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

}