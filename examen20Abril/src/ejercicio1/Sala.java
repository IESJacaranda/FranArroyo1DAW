package ejercicio1;
//Lo pongo abstracto ya que creo la sala general y apartir de esta se crean las demas salas con sus caracteristicas
//especificas
public abstract class Sala extends Instalacion{

	private int aforo;
	TIPOSALAS tiposala;
/*
 * Constructor que hereda de hotel.
 */
	public Sala( int aforo, TIPOSALAS tiposala) {
		this.aforo = aforo;
		this.tiposala = tiposala;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public TIPOSALAS getTiposala() {
		return tiposala;
	}

	public void setTiposala(TIPOSALAS tiposala) {
		this.tiposala = tiposala;
	}

	//Codigo unico de Sala
	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 65;
		result = prime * result + aforo;
		result = prime * result + ((tiposala == null) ? 0 : tiposala.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Sala [aforo=" + aforo + ", tiposala=" + tiposala + "]";
	}

	
	
	
}
