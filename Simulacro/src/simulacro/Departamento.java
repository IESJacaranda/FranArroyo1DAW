package simulacro;

import java.util.ArrayList;
import java.util.Iterator;

public class Departamento {
	//La aplicación también deberá almacenar los departamentos de la empresa,
//de cada uno de losdepartamentos se debe guardar el nombre del departamento
//y un conjunto de empleados en la quesólo puede haber un jefe de departamento. 
//De cada departamento necesitaremos los siguientesmétodos:
	private String nombredepartamento;
	private ArrayList<EmpleadoBase> listaempelados = new ArrayList<EmpleadoBase>();
	private JefeEmpleado jefe;
	//Constructor para solo inicalizar el departamento con el nombre del departamento
	public Departamento(String nombredepartamento) {
		super();
		this.nombredepartamento = nombredepartamento;
	}
	//Este constructor no tiene mucho sentido
//	public Departamento(String nombredepartamento, ArrayList<EmpleadoBase> nombreArrayList, JefeEmpleado jefe) {
//		super();
//		this.nombredepartamento = nombredepartamento;
//		this.listaempelados=listaempelados;
//		this.jefe = jefe;
//	}
	public String getNombredepartamento() {
		return nombredepartamento;
	}
	public void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}
	public JefeEmpleado getJefe() {
		return jefe;
	}
	public void setJefe(JefeEmpleado jefe) {
		this.jefe = jefe;
	}
	public ArrayList<EmpleadoBase> getNombreArrayList() {
		return listaempelados;
	}
	//No c
	public boolean addEmpleado(EmpleadoBase empleado) throws Exception {
		boolean okay=false;
		if (listaempelados.contains(empleado)) {
			throw new Exception("Ese empleado ya esta :P");
		}
		else {
			listaempelados.add(empleado);
			okay=true;
		}
		return okay;
	}
	public double obtenerSueldos() {
		double sueldos=0;
		//El iterator y el for each funcionan parecido , pero el for each no puede recorrer y modificar a la vez
		//en este caso como solo consultar sueldos para almacenarlos en una variable no deberia haber problemas.
		Iterator<EmpleadoBase> iteradordeempelados = listaempelados.iterator();
		while(iteradordeempelados.hasNext()){
			EmpleadoBase o= ((Iterator<EmpleadoBase>) listaempelados).next();
			sueldos+=o.getSueldo();
		}
//		for (EmpleadoBase o: listaempelados){
//			sueldos+=o.getSueldo();
//		}
		return sueldos;
	}
	
	
	
}
