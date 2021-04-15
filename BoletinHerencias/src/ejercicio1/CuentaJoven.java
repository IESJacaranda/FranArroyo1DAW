package ejercicio1;

public class CuentaJoven extends Cuenta{
	private double bonificacion;


	public CuentaJoven(String nombre, int edad, String dni, double dinero, String numcuenta, Persona persona,double bonificacion) {
		super(nombre, edad, dni, dinero, numcuenta, persona);
		this.bonificacion=bonificacion;
	}
	public CuentaJoven() {
		super();
		this.bonificacion=bonificacion;
	}
	

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
	public Boolean esTitularValido() {
		boolean mayoredad=false;
		if (persona.getEdad()>18 && persona.getEdad()<25) {
			mayoredad=true;
		}
		return mayoredad;
	}
	
	
	
	
}
