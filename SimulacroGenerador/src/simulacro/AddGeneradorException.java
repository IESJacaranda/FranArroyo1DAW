package simulacro;

public class AddGeneradorException extends Exception {

	public AddGeneradorException() {
		super("No se puede añadir el generador porque no puede haber dos generadores iguales.");
	}
}
