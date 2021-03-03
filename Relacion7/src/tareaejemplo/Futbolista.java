package tareaejemplo;

public class Futbolista extends Persona{
	private String posicion;

	public Futbolista() {
		super();
		this.posicion=posicion;
	}
	public Futbolista(String nombre,int edad, double altura, double peso, String posicion) {
		super(nombre, edad, altura, peso);
	}
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public void Acciones() {
		// TODO Auto-generated method stub
		System.out.println("Corre");
	}
	@Override
	public String toString() {
		return "Futbolista [posicion=" + posicion + "]+nombre:"+getNombre()+"Y su peso"+getPeso()+"Y su altura"+getAltura();
	}
}
