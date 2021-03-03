package tareaejemplo;

public class Entrenador extends Persona{
	public Entrenador() {
		super();
	}
	public Entrenador(String nombre,int edad, double altura, double peso) {
		super(nombre, edad, altura, peso);
	}
	public void Acciones() {
		// TODO Auto-generated method stub
		System.out.println("Mandar");
	}
	@Override
	public void NecesidadesBasicas() {
	// TODO Auto-generated method stub
		System.out.println("Gritar al arbitro en cada jugada");
	}
	
}
