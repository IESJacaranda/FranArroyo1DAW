package ejercicio1;

public class Cuenta extends Persona {
	private String numcuenta;
	private double dinero;
	public Cuenta() {
		super();
	}

	public Cuenta(String nombre, int edad, String dni,double dinero) {
		super(nombre, edad, dni);
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
//	En esta ocasión los titulares de este tipo de cuenta 
//	tienen que ser mayor de edad., por lotanto hay que crear 
//	un método  esTitularValido()  que devuelve verdadero si el 
//	titular esmayor de edad pero menor de 25 años y falso en caso contrario.
	public Boolean esValidoParaJoven(int edad) {
		boolean mayoredad=false;
		if (edad>18 && edad<25) {
			mayoredad=true;
		}
		return mayoredad;
	}
	
}
