package ejercicio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Tarea implements temporizable{
	//Atributos
	private int codigotarea;
	private String descripcion;
	private LocalDate fechaalta;
	private LocalDate fechasolucion;
	private boolean resuelta;
	Prioridad prioridad;


	//Constructor vacio
	public Tarea() {
		super();
	}

	public Tarea(int codigotarea, String descripcion, LocalDate fechaalta,boolean resuelta) {
		super();
		this.codigotarea = codigotarea;
		this.descripcion = descripcion;
		this.fechaalta = LocalDate.now();
		this.resuelta=false;
	}
	
	public int getCodigotarea() {
		return codigotarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFechaalta() {
		return fechaalta;
	}

	public LocalDate getFechasolucion() {
		return fechasolucion;
	}
	public Prioridad getPrioridad() {
		return prioridad;
	}
	
	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public void ResolverTarea(String descripcion,LocalDate fechaalta, LocalDate fechasolucion) {
		
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigotarea;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaalta == null) ? 0 : fechaalta.hashCode());
		result = prime * result + ((fechasolucion == null) ? 0 : fechasolucion.hashCode());
		result = prime * result + (resuelta ? 1231 : 1237);
		return result;
	}


	/*
 * Con este metodo implementado de la interfaz temporizable te da el dia que hay entre una fecha y otra
 */
	@Override
	public int numDias(Tarea t1) {
		
		int meses = (int)ChronoUnit.MONTHS.between(t1.getFechaalta(), LocalDate.now());
		int dias = (int) ChronoUnit.DAYS.between(t1.getFechaalta(), LocalDate.now());
		
		return meses*dias;
		
	}

	@Override
	public String toString() {
		return "Tarea [codigotarea=" + codigotarea + ", descripcion=" + descripcion + ", fechaalta=" + fechaalta
				+ ", fechasolucion=" + fechasolucion + ", resuelta=" + resuelta + ", prioridad=" + prioridad + "]";
	}

	
}
