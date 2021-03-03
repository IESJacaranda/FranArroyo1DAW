package ejercicio5;

public class Equipo {
	// Atributos
	private String nombreEquipo;
	private String nombreEstadio;
	private String ciudad;
	// Constructor
	public Equipo(String nombreEquipo, String nombreEstadio, String ciudad) {
		this.nombreEquipo = nombreEquipo;
		this.nombreEstadio = nombreEstadio;
		this.ciudad = ciudad;
	}

	// Métodos get
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	// Métodos set
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	@Override
	public String toString() {
		return "El"+nombreEquipo+"juega en el estadio "+nombreEstadio+" de la ciudad "+ciudad;
	}
	
	public boolean equals(Equipo otroEquipo) {
		boolean eselmismo = false;
		if (this.nombreEquipo.equals(otroEquipo.nombreEquipo)) {
			eselmismo = true;
		}
		return eselmismo;
	}

	@Override
	public int hashCode() {
		final int numero = 31;
		int resultado = 1;
		resultado = numero* resultado + ((ciudad == null) ? 0 : ciudad.hashCode());
		resultado = numero * resultado + ((nombreEquipo == null) ? 0 : nombreEquipo.hashCode());
		resultado = numero * resultado + ((nombreEstadio == null) ? 0 : nombreEstadio.hashCode());
		return resultado;
	}

	
	
}