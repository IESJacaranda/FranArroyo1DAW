package ejercicio1;
/*
 * Clase padre de todas las demas por lo tanto no extienden de ninguna clase.
 * Aqui van declaradas especificamente los atributos generales y comunes de todos lso hijos (Profesor,Administracion y Direccion)
 */
public class Empleado {
	private String nombre;
	private int edad;
	private String genero;
	private String horario;
	private String codigoid;
	private String contrasena;
	
/*
 * Genero el constructor de la clase.
 */
	public Empleado(String nombre, int edad, String genero, String horario, String codigoid, String contrasena) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.horario = horario;
		this.codigoid = codigoid;
		this.contrasena = contrasena;
	}
/*
 * Getters y Setters
 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCodigoid() {
		return codigoid;
	}

	public void setCodigoid(String codigoid) {
		this.codigoid = codigoid;
	}

	public String getContrasena() {
		return contrasena;
	}
/*
 * Aqui se comprueba que la contrasena es valida cumpliendo los requisitos indicados en el enunciado
 * En caso de que no lo cumplan, esto lanzara una excepcion que sera manejada en el main.
 */
	public void setContrasena(String contrasena) throws Exception{
		int nummayusculas=0;
		int numnumeros=0;
		char caracter;
		if (contrasena.length()<10) {
			throw new Exception("La contrasena debe tener 10 caracteres");
		}
		for (int i=0;contrasena.length()>i;i++) {
			caracter=contrasena.charAt(i);
			if (Character.isDigit(caracter)) {
				numnumeros++;
			}
			if (Character.isUpperCase(caracter)) {
				nummayusculas++;
			}
		}
		if (nummayusculas<2 || numnumeros<3) {
			throw new Exception("La contrasena debe tener minimo dos mayusculas y tres numeros para ser valida");		}
		else {
			this.contrasena=contrasena;
		}
	}
/*
 * Como indica , el codigoid debe ser unico en cada empleado , por lo tanto genero el hascode
 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoid == null) ? 0 : codigoid.hashCode());
		return result;
	}
/*
 * El metodo equals para compararlos
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (codigoid == null) {
			if (other.codigoid != null)
				return false;
		} else if (!codigoid.equals(other.codigoid))
			return false;
		return true;
	}
/*
 * toString para mostrar los datos generales de todos.
 */
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", horario=" + horario
				+ ", codigoid=" + codigoid + ", contrasena=" + contrasena + "]";
	}

	
	
	
}
