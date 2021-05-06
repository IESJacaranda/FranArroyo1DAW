package relacion11.ejercicio4;

import java.time.LocalDateTime;

public class PaginaWeb {
	
	protected String nombre;
	protected LocalDateTime fechaHora;
	
	public PaginaWeb(String nombre) {
		this.nombre = nombre;
		this.fechaHora = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		return "PaginaWeb " + nombre + ", fecha y hora de consulta " + fechaHora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaHora == null) ? 0 : fechaHora.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PaginaWeb))
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		if (fechaHora == null) {
			if (other.fechaHora != null)
				return false;
		} else if (!fechaHora.equals(other.fechaHora))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	
}
