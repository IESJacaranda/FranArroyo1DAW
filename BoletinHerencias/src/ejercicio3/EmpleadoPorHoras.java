package ejercicio3;

public class EmpleadoPorHoras extends Empleado {
	public final double PRECIOPORHORA=12.25;
	private int numhorastrabajadas;
	public EmpleadoPorHoras(String nombre, int edad, String nif, Double sueldo,int numhorastrabajadas) {
		super(nombre, edad, nif, sueldo);
		this.numhorastrabajadas=numhorastrabajadas;
	}
	
	public int getNumhorastrabajadas() {
		return numhorastrabajadas;
	}
	public void setNumhorastrabajadas(int numhorastrabajadas) {
		this.numhorastrabajadas = numhorastrabajadas;
	}

}
