package ejemplo;

public class Bebe extends Persona{
	public Bebe() {
		super();
	}
	public Bebe(String nombre,int edad, double altura, double peso) {
		super(nombre, edad, altura, peso);
	}
	@Override
	public void desplazarse() {
		// TODO Auto-generated method stub
		System.out.println("Esta gateando");
	}
	@Override
	public void obtenerHabitos() {
		// TODO Auto-generated method stub
		System.out.println("Jugar,aprender y comer");
	}
	
}
