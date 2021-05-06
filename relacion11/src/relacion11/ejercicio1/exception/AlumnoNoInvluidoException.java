package relacion11.ejercicio1.exception;

public class AlumnoNoInvluidoException extends Exception {
	public AlumnoNoInvluidoException() {
		super("El alumno que desea borrar no se encuentra en la lista");
	}

}
