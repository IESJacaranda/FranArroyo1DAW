package galaxia;

public class Personaje {
	//Atributos del personaje
	public String nombre;
	public int anopelicula;
	public double peso;
	public double altura;
	public String especie;
	public double poder;

	//Constructor de personaje
	public Personaje(String nombre, int anopelicula, double peso, double altura, String especie,double poder) {
		this.nombre = nombre;
		this.anopelicula = anopelicula;
		this.peso = peso;
		this.altura = altura;
		this.especie = especie;
		this.poder=poder;
	}
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnopelicula() {
		return anopelicula;
	}
	public void setAnopelicula(int anopelicula) {
		this.anopelicula = anopelicula;
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
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public double getPoder() {
		return poder;
	}
	public void setPoder(double poder) {
		this.poder = poder;
	}
	public void Compararpeli() {
		if (this.anopelicula>anopelicula) {
			
		}
	}
	
}
