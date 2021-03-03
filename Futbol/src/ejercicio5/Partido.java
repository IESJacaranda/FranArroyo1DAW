package ejercicio5;

public class Partido {

	// Constantes
	private static final int MIN_JORNADA = 1;
	private static final int MAX_JORNADA = 38;
	private static final char SEPARADOR = '-';
	
	
	// Atributos
	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private char resultadoQuiniela;
	private boolean yaJugado;

	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws Exception {
		if (equipoLocal.equals(equipoVisitante))
			throw new Exception("Estos equipos son iguales");
		setJornada(jornada);
		setEquipoLocal(equipoLocal);
		setEquipoVisitante(equipoVisitante);
		yaJugado = false;
	}

	public int getJornada() {
		return jornada;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesLocal() throws Exception {
		if ( !yaJugado)
			throw new Exception("El partido todavia no se ha jugado");
		return golesLocal;
	}

	public int getGolesVisitante() throws Exception {
		if ( !yaJugado)
			throw new Exception("El partido todavia no se ha jugado");
		return golesVisitante;
	}

	public char getResultadoQuiniela() throws Exception {
		if ( !yaJugado)
			throw new Exception("El partido todavía no se ha jugado");
		return resultadoQuiniela;
	}
	
	private void setJornada(int nuevaJornada) throws Exception {
		if (nuevaJornada < MIN_JORNADA || nuevaJornada > MAX_JORNADA) {
			throw new Exception("Imposible la jornada debe estar entre la 1 y la 38.");
		}
		this.jornada = nuevaJornada;
	}

	private void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	private void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	@Override
	public String toString() {
		
		String cadena;

		
		if (this.yaJugado == false) {
			cadena = "Partido entre equipo local " + this.equipoLocal.getNombreEquipo() + " y equipo visitante "
					+ this.equipoVisitante.getNombreEquipo() + " todavía no se ha jugado.";
			;
		} else {
			cadena = "Partido entre equipo local " + this.equipoLocal.getNombreEquipo() + " y el equipo visitante "
					+ this.equipoVisitante.getNombreEquipo() + " jugado en el estadio "
					+ this.equipoLocal.getNombreEstadio() + " de la ciudad " + this.equipoLocal.getCiudad()
					+ " ha finalizado con " + this.golesLocal + " goles del equipo local y " + this.golesVisitante
					+ " goles del equipo visitante. Resultado quiniela= " + this.resultadoQuiniela;
		}
		return cadena;
	}

	public void ponerResultado(String cadenaEntrada) throws Exception {

		int posicionGuion;
	
		
		posicionGuion= cadenaEntrada.indexOf(SEPARADOR);
		
		if (posicionGuion <0){
			throw new Exception("Error. El formato del resultado es incorrecto.");
		}

		
		try {
			setGolesLocal(Integer.parseInt(cadenaEntrada.substring(0, posicionGuion)));
			setGolesVisitante(Integer.parseInt(cadenaEntrada.substring(posicionGuion +1)));

		} catch (NumberFormatException e) {
			throw new Exception("Error. El formato del resultado es incorrecto");
		}
		
		this.yaJugado = true;

		if (this.golesLocal > this.golesVisitante) {

			this.resultadoQuiniela = '1';
		} else {
			if (this.golesLocal < this.golesVisitante) {
				this.resultadoQuiniela = '2';
			} else {
				this.resultadoQuiniela = 'X';
			}
		}

	}

	private void setGolesVisitante(int golesVisitante) throws Exception {
		if ( golesVisitante < 0)
			throw new Exception("Error, goles visitante incorrecto");
		this.golesVisitante= golesVisitante;
		
	}


	private void setGolesLocal(int golesLocal) throws Exception {
		if ( golesLocal < 0)
			throw new Exception("Error, goles local incorrecto");
		this.golesLocal= golesLocal;
		
	}
}