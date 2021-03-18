package ejercicio1;
/*
 * Clase hija de Profesor , en la que su abuelo es Empleado.
 * Indico los atributos de la clase.
 */
public class Direccion extends Profesor {

	private String ubicacion;
	private String competencias;
/*
 * Constructor
 */
	public Direccion(String nombre, int edad, String genero, String horario, String codigoid, String contrasena,
			String departamento, String modulo, String curso,String ubicacion,String competencias) {
		super(nombre, edad, genero, horario, codigoid, contrasena, departamento, modulo, curso);
		// TODO Auto-generated constructor stub
		this.ubicacion=ubicacion;
		this.competencias=competencias;
	}
	/*
	 * Getters y Setters
	 */
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getCompetencias() {
		return competencias;
	}
	/*
	 * En el setCompetencia compruebo que lo que se le indica cumple con las tres opciones disponibles
	 * En caso de que no , lanza una excepcion.
	 */
	public void setCompetencias(String competencias) throws Exception {
		if (competencias=="Secretaria"||competencias=="Jefe de estudio"
				||competencias=="Direccion") {
			throw new Exception("Solo puede ser 'Secretaria' , 'Jefe de estudio' o 'Direccion' ");
		}
		else {
			this.competencias=competencias;
		}	
	}
	/*
	 * ToString con los datos especificos de Direccion.
	 */
	@Override
	public String toString() {
		return "Direccion [ubicacion=" + ubicacion + ", competencias=" + competencias + "]";
	}
	
	

}
