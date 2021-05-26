package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Empresa {
	/*
	 * Decido usar el LinkedList en tareasEnProgreso porque  van a ir eliminando por el medio, al principio etc ademas 
	 * de que van a estar saliendo y entrando estas tareas.
	 */
	private LinkedList <Tarea> tareasEnProgreso;
	/*
	 * En esta no importa el orden ni se va hacer nada, tan solo se van a ir añadiendo y a esta lista a medida que
	 * las tareas se completan.
	 */
	private ArrayList <Tarea> tareasComnpletadas;
	
	public Empresa(LinkedList<Tarea> tareasEnProgreso, ArrayList<Tarea> tareasComnpletadas) {
		super();
		this.tareasEnProgreso = new LinkedList<Tarea>();
		this.tareasComnpletadas = new ArrayList<Tarea>();
	}
	/*
	 * Esta es una de las formas:_(, voy a intentarlo de otra forma, si no c , pos esto
	 * es lo que hice.
	 */
	public boolean addTareaEmpresa(TareaEmpresa t1) throws TareaYaEnListaException {
		boolean anadido=false;
		if(tareasEnProgreso.contains(t1)) {
			throw new TareaYaEnListaException();
		}else {
			tareasEnProgreso.add(t1);
			anadido=true;
		}
		return anadido;
	}
	/*
	 * Asi es como lo pide el enunciado.
	 */
	public boolean addTareaEmpresa2(String decrip, Prioridad prioridad, String departamento) throws TareaYaEnListaException {
		boolean anadido=false;
		TareaEmpresa t1=new TareaEmpresa(decrip,prioridad,departamento);
		if(tareasEnProgreso.contains(t1)) {
			throw new TareaYaEnListaException();
		}else {
			tareasEnProgreso.add(t1);
			anadido=true;
		}
		return anadido;
	}
	/*
	 * Con este metodo anado tareas a clientes
	 */
	public boolean addTareaCliente(String   decrip,   Prioridad   prioridad,   String   cliente,   String   localidad) throws TareaYaEnListaException {
		boolean anadido=false;
		TareaCliente t1=new TareaCliente(decrip,prioridad,cliente ,localidad);
		if(tareasEnProgreso.contains(t1)) {
			throw new TareaYaEnListaException();
		}else {
			tareasEnProgreso.add(t1);
			anadido=true;
		}
		return anadido;
	}
	public String mostrarTareas() {
		StringBuilder sb=new StringBuilder();
		/*
		 * Ya lo arregle
		 */
		Collections.sort(tareasEnProgreso,new OrdenarPorFecha());
		for (Tarea t1 : tareasEnProgreso ) {
			sb.append(t1+"\n");
		}
		return sb.toString();
	}
	public String mostrarTareasPrioridad() {
		StringBuilder sb=new StringBuilder();
		/*
		 * Ya lo arregle
		 */
		Collections.sort(tareasEnProgreso,new OrdenarPorPrioridad());
		for (Tarea t1 : tareasEnProgreso ) {
			sb.append(t1+"\n");
		}
		return sb.toString();
	}
}
