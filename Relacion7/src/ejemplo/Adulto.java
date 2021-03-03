package ejemplo;

public class Adulto extends Persona {
	private boolean CarnetConducir;
	public Adulto() {
	super();	
	}
	public Adulto(String nombre,int edad,double altura,double peso) {
		super(nombre, edad, altura, peso);
	}

	@Override
	public void obtenerHabitos() {
		System.out.println("Pagar facturas, trabajar, hacer deporte, ver la tv");
	}
	public void Conducir() {
		if (CarnetConducir) {
			System.out.println("Esta conduciendo");
		}
		else {
			System.out.println("Va andado");
		}
	}
	
}
