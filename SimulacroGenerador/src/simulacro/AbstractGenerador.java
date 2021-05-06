package simulacro;


import java.time.LocalDateTime;

public abstract class AbstractGenerador implements IMonetizable, Comparable<AbstractGenerador>{
	
	protected static int CONTADOR_GENERADORES = 0;
	
	protected String codigo;
	protected LocalDateTime fecha;
	protected String localidad;
	protected double potencia;

	public AbstractGenerador(String localidad, double potencia) {
		super();
		this.codigo = codigo;
		this.fecha = LocalDateTime.now();
		this.localidad = localidad;
		this.potencia = potencia;
		
	}
	

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getCodigo() {
		return codigo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getLocalidad() {
		return localidad;
	}

	@Override
	public String toString() {
		return "Generador con código: " + getCodigo() + 
				"\nFecha comienzo de funcionamiento: " + getFecha()+ 
				".\nLocalidad: " + getLocalidad() +
				".\nPotencia: " + getPotencia() + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		long temp;
		temp = Double.doubleToLongBits(potencia);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractGenerador other = (AbstractGenerador) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (Double.doubleToLongBits(potencia) != Double.doubleToLongBits(other.potencia))
			return false;
		return true;
	}
	
	
	
	
	
}
