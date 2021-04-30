package simulacro;

public class JefeEmpleado extends Empleado implements SueldoActualizable{
	private double antiguedad;
	private int numanosjefe;
	private final double INCREMENTOSUELDOANUAL=10;
	//Constructor vacio
	public JefeEmpleado() {
		super();
	}
	//Constructor heredado y atributos propios de la clase
	public JefeEmpleado(String dni, String nombre, double sueldo,double antiguedad,int numanosjefe) {
		super(dni, nombre, sueldo);
		this.antiguedad=antiguedad;
		this.numanosjefe=numanosjefe;
	}
	//Getters y Setters
	public double getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(double antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getNumanosjefe() {
		return numanosjefe;
	}
	public void setNumanosjefe(int numanosjefe) {
		this.numanosjefe = numanosjefe;
	}
	//Sobrescribo el metodo setSueldo de la clase Empleado para poder utilizar este metodo cuando cree el nuevo Jefe de 
	//Departamento.
	@Override
	public void setSueldo(double sueldo) throws Exception {
		if (sueldo>=1300) {
			this.sueldo=sueldo;
		}else {
		throw new Exception("El sueldo debe ser mayor o igual a 1300");
		}
	}
	@Override
	public double ActualizarSueldo(int anosenempresa) {
		anosenempresa*=INCREMENTOSUELDOANUAL;
		double incremento=(sueldo*anosenempresa)/100;
		sueldo=sueldo+incremento;
		return sueldo;
	}
}
