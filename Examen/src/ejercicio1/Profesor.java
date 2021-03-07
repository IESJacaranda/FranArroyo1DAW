package ejercicio1;
/*
 * Extiendo de la clase empleado, el profesor.
 * 	y asigno los atributos especificos de esta clase.
 */
public class Profesor extends Empleado{
	private String departamento;
	private String modulo;
	private String curso;
	/*
	 * Genero el constructor
	 */
	public Profesor(String nombre, int edad, String genero, String horario, String codigoid, String contrasena,
			String departamento, String modulo, String curso) {
		super(nombre, edad, genero, horario, codigoid, contrasena);
		this.departamento = departamento;
		this.modulo = modulo;
		this.curso = curso;
	}

/*
 * Getters y setters
 */
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		
		this.departamento = departamento;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

/*
 * Genero el toString con la informacion especifica del profesor.
 */
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", modulo=" + modulo + ", curso=" + curso + "]";
	}
	
}