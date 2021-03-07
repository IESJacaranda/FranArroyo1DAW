package ejercicio1;
/*
 * Los administrador son unos tipos de empleado, que no dan clase, por lo tanto no extienden de profesor
 * Especifico los atributos necesarios y propios de la clase
 */
public class Administracion extends Empleado {
	private String ubicacioncentro;
	private String telefono;
	private String arearesponsabilidad;
	/*
	 * Genero el constructor de la clase con todos sus datos
	 */
	public Administracion(String nombre, int edad, String genero, String horario, 
			String codigoid, String contrasena,String ubicacioncentro,String telefono,String arearesponsabilidad) {
		super(nombre, edad, genero, horario, codigoid, contrasena);
		this.telefono=telefono;
		this.arearesponsabilidad=arearesponsabilidad;
		this.ubicacioncentro=ubicacioncentro;
	}
	/*
	 * Getters  y Setters
	 */
	public String getUbicacioncentro() {
		return ubicacioncentro;
	}
	public void setUbicacioncentro(String ubicacioncentro) {
		this.ubicacioncentro = ubicacioncentro;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getArearesponsabilidad() {
		return arearesponsabilidad;
	}
	/*
	 * En el setArearesponsabilidad compruebo que sea especificamente uno de estos dos , tal y como
	 * indica el enunciado, lanzando una excepcion informando de que puede contener esa variable
	 * manejandola posteriormente el main
	 */
	public void setArearesponsabilidad(String arearesponsabilidad) throws Exception {
		if (arearesponsabilidad.equals("Gestion del alumnado")||
				arearesponsabilidad.equals("Gestion del profesorado")) {
			throw new Exception("Solo puede ser 'Gestion del alumnado' o 'Gestion del profesorado' ");
		}
		else {
			this.arearesponsabilidad=arearesponsabilidad;
		}
	}
	/*
	 * ToString con los atributos especifi
	 */
	@Override
	public String toString() {
		return "Administracion [ubicacioncentro=" + ubicacioncentro + ", telefono=" + telefono
				+ ", arearesponsabilidad=" + arearesponsabilidad + "]";
	}
	

}