package simulacro;

public class EmpleadoBase extends Empleado implements SueldoActualizable {
	private String tipoempleado;
	private final double INCREMENTOSUELDOANUAL=2.5;

//Cosntructor vacio
	public EmpleadoBase() {
		super();
	}
	//Constructor heredado de la clase Emplado y los atributos propios de la clase
	public EmpleadoBase(String dni, String nombre, double sueldo, String tipoempleado) {
		super(dni, nombre, sueldo);
		this.tipoempleado=tipoempleado;
	}

	public String getTipoempleado() {
		return tipoempleado;
	}
//Modificacion del set para comprobar que es ADMINISTRATIVO/OPERARIO O CONTABLE. 
	public void setTipoempleado(String tipoempleado) throws Exception {
		tipoempleado=tipoempleado.toUpperCase();
		if (tipoempleado.equals("ADMINISTRATIVO") || tipoempleado.equals("OPERARIO") || tipoempleado.equals("CONTABLE")) {
			this.tipoempleado = tipoempleado;
		}else {
			throw new Exception("Solo puedes poner ADMINISTRATIVO/OPERARIO/CONTABLE");
		}
		
	}
	@Override
	public void setSueldo(double sueldo) throws Exception {
		if (tipoempleado.equals("ADMINISTRATIVO")) {
			sueldo=1150;
			this.sueldo=sueldo;
		}
		else if (tipoempleado.equals("OPERARIO")) {
				sueldo=1100;
				this.sueldo=sueldo;
		}
		else if (tipoempleado.equals("CONTABLE")) {
			sueldo=1350;
			this.sueldo=sueldo;
		}
		else {
		throw new Exception("El sueldo debe ser mayor o igual a 1300");
		}
	}
	/*
	 * Heredamos el metodo de la interfaz SueldoActualizable donde declararemos el metodo y sus datos de entrada
	 */
	@Override
	public double ActualizarSueldo(int anosenempresa) {
		anosenempresa*=INCREMENTOSUELDOANUAL;
		double incremento=(sueldo*anosenempresa)/100;
		sueldo=sueldo+incremento;
		return sueldo;
	}
}
