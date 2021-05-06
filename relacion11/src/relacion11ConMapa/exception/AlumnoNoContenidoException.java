package relacion11ConMapa.exception;

public class AlumnoNoContenidoException extends Exception {
	public AlumnoNoContenidoException() {
		super("El alumno no está contenido en la lista de alumnos.");
	}

}
