package ejercicio1;

/*Ejercicio 1:
A partir de la clase cuenta vamos a definir ahora una “Cuenta Joven”, 
para ello vamos a crear unanueva clase CuantaJoven que deriva de la anterior. 
Cuando se crea esta nueva clase, además deltitular y la cantidad se debe 
guardar una bonificación que estará expresada en tanto por ciento
.Construye los siguientes métodos para la clase:
	•Un constructor.
	•Los setters y getters para el nuevo atributo.
	•En esta ocasión los titulares de este tipo de cuenta 
	tienen que ser mayor de edad., por lotanto hay que crear 
	un método  esTitularValido()  que devuelve verdadero si el 
	titular esmayor de edad pero menor de 25 años y falso en caso 
	contrario.
	•Además la retirada de dinero sólo se podrá hacer si el
	titular es válido.•El método mostrar() debe devolver el 
	mensaje de “Cuenta Joven” y la bonificación de lacuenta.*/
public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	public Persona() {
		super();
	}
	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	

}
