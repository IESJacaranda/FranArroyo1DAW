package relacion11.ejercicio5;

public class Profesor extends Persona {

	public Profesor(int edad, String nombre) {
		super(edad, nombre);
	}

	@Override
	Mensaje enviar(Persona persona, String text) {
		return new Mensaje(text, persona);
	}

}
