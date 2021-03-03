package tareaejemplo;

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	public Persona() {
		super();
	}
	public Persona(String nombre, int edad, double peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void NecesidadesBasicas() {
		System.out.println("Comer,Beber agua, dormir");
	}
	public void Acciones() {
		System.out.println("Andar");
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}
}
