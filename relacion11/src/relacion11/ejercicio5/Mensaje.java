package relacion11.ejercicio5;

import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{
	
	protected String text;
	protected LocalDateTime fecha;
	protected Persona remitente;
	protected int codigo;
	private static int CONTADOR = 1;
	
	public Mensaje(String text, Persona remitente) {
		this.text = text;
		this.remitente = remitente;
		this.fecha = LocalDateTime.now();
		this.codigo = CONTADOR;
		CONTADOR++;
	}

	@Override
	public String toString() {
		return "Mensaje " + this.codigo + " de "+this.remitente + "\n Texto: " + text + "\n Fecha y hora: " + fecha +"\n"
				+ "----------------------------------------------\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((remitente == null) ? 0 : remitente.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Mensaje))
			return false;
		Mensaje other = (Mensaje) obj;
		if (codigo != other.codigo)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (remitente == null) {
			if (other.remitente != null)
				return false;
		} else if (!remitente.equals(other.remitente))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public int compareTo(Mensaje o) {
		return this.remitente.getNombre().compareTo(o.remitente.getNombre());
	}

	public String getText() {
		return text;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public Persona getRemitente() {
		return remitente;
	}

	public int getCodigo() {
		return codigo;
	}

}
