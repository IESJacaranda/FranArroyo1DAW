package relacion11.ejercicio1.exception;

public class AlumnoYaIncluidoException extends Exception {
	public AlumnoYaIncluidoException() {
		super("El alumno que desea introducir ya se encuentra en la lista");
	}

}
