package ejercicio;

import java.time.LocalDate;

public class TareaEmpresa extends Tarea{
	private String departamento;
	
	public TareaEmpresa(int codigotarea, String descripcion, LocalDate fechaalta, boolean resuelta) {
		super(codigotarea, descripcion, fechaalta, resuelta);
	}
	public TareaEmpresa(int codigotarea, String descripcion, LocalDate fechaalta, boolean resuelta,String departamento) {
		super(codigotarea, descripcion, fechaalta, resuelta);
		this.departamento=departamento;
	}
	public TareaEmpresa(String descripcion, Prioridad prioridad, String Departamento) {
		super();
	}
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "TareaEmpresa [departamento=" + departamento + "]";
	}

}
