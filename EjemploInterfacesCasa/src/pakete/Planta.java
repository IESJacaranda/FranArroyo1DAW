package pakete;

public class Planta implements Plantas {
	private String nombre;
	private int edad;
	private String color;
	private String tipoplanta;
	
	public Planta(String nombre, int edad, String color, String tipoplanta) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.tipoplanta = tipoplanta;
	}

	@Override
	public String getNombreCientifico() {
		this.nombre=nombre;
		return nombre;
	}

	@Override
	public int getMaximaEdad() {
		// TODO Auto-generated method stub
		this.edad=edad;
		return edad;
	}

	@Override
	public String getTipoPlanta() {
		// TODO Auto-generated method stub
		this.tipoplanta=tipoplanta;
		return tipoplanta;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		this.color=color;
		return color;
	}

	@Override
	public String toString() {
		return "Planta [nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", tipoplanta=" + tipoplanta + "]";
	}

}
