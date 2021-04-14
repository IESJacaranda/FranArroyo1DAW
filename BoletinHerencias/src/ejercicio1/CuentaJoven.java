package ejercicio1;

public class CuentaJoven extends Cuenta{
	private double bonificacion;

	public CuentaJoven() {
		super();
	} 
	public CuentaJoven(String nombre, int edad, String dni, double dinero, String numcuenta, Persona persona,double bonificacion) {
		super(nombre, edad, dni, dinero, numcuenta, persona);
		this.bonificacion=bonificacion;
	}


	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	
	
	
}
