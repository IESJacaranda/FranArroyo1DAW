package examen;

public class TareaEmpresa extends Tarea{
	private String departamento;

	public TareaEmpresa(String departamento,String descripcion, Prioridad prioridad) {
		super(descripcion, prioridad);
		this.departamento=departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return super.toString()+"TareaEmpresa del "+ departamento;
	}
}
