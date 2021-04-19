package ejercicio1;

public class Cuenta {
	public Persona persona;
	private String numcuenta;
	private double dinero;


	public Cuenta() {
		super();
	}

	public Cuenta(String nombre, int edad, String dni, double dinero, String numcuenta,Persona persona) {
		this.persona=persona;
		this.numcuenta=numcuenta;
		this.dinero=dinero;
		
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
//	En esta ocasión los titulares de este tipo de cuenta 
//	tienen que ser mayor de edad., por lotanto hay que crear 
//	un método  esTitularValido()  que devuelve verdadero si el 
//	titular esmayor de edad pero menor de 25 años y falso en caso contrario.

	//Además la retirada de dinero sólo se podrá hacer si el
	//titular es válido.
	public double retirarDinero(double dinero,double cantidadaretirar) throws Exception {
			this.dinero=this.dinero-cantidadaretirar;

			return this.dinero-cantidadaretirar;
	}
	
}
