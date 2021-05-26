package ejercicio;

public class TareaYaEnListaException extends Exception {
	public TareaYaEnListaException() {
		super("Esta tarea ya esta añadida");
	}

}
