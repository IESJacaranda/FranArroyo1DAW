package pakete;

public class Animales implements Animal {
	private String nombre;
	private int edad;
	private String estilocomida;
	
	
	
	public Animales(String nombre, int edad, String estilocomida) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estilocomida = estilocomida;
	}

	@Override
	public String getNombreCientifico() {
		this.nombre=nombre;
		return nombre;
	}

	@Override
	public int getMaximaEdad() {
		this.edad=edad;
		return edad;
	}

	@Override
	public String getEstiloComida() {
		this.estilocomida=estilocomida;
		return estilocomida;
	}

	@Override
	public String getTipoAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

}
