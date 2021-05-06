package relacion11.ejercicio5;

public class Alumno extends Persona {

	public Alumno(int edad, String nombre) {
		super(edad, nombre);
	}

	@Override
	Mensaje enviar(Persona persona, String text) throws Exception {
		if(this.edad < 18 && !(persona instanceof Profesor)) {
			throw new Exception("Un alumno menor de edad solo puede enviar mensajes a profesores");
		}
		return new Mensaje(text, persona);
	}
	
}
