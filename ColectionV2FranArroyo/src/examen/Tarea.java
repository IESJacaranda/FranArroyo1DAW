package examen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Tarea implements Temporizable {
	static Integer codtarea=1;
	protected String descripcion;
	private LocalDate fechaalta;
	private LocalDate fecharesuelta;
	private Prioridad prioridad;

	public Tarea() {
		super();
	}
	public Tarea(String descripcion, Prioridad prioridad) {
		this.descripcion = descripcion;
		this.fechaalta = LocalDate.now();
		codtarea=+1;
		
	}
	public Prioridad getPrioridad() {
		return prioridad;
	}
	public int getCodtarea() {
		return codtarea;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public LocalDate getFechaalta() {
		return fechaalta;
	}
	public LocalDate getFecharesuelta() {
		return fecharesuelta;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaalta == null) ? 0 : fechaalta.hashCode());
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
		Tarea other = (Tarea) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaalta == null) {
			if (other.fechaalta != null)
				return false;
		} else if (!fechaalta.equals(other.fechaalta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "El codigo de la tarea es:" + codtarea + "su descripcion es" + descripcion + "con fechaalta=" + fechaalta;
	}
	
	@Override
	public long numdias(LocalDate fechaalta) {
		long aux = ChronoUnit.DAYS.between(LocalDate.now(),fechaalta);
		return aux;
	}

	
}
