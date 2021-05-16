package examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Empresa {
	private LinkedList <Tarea> tareasEnProgreso;
	private ArrayList <Tarea> tareasComnpletadas;
	
	public Empresa() {
		this.tareasEnProgreso = new LinkedList<Tarea>();
		this.tareasComnpletadas = new ArrayList<Tarea>();
	}
	public boolean AddTareaEmpresa(String descripcion,String departamento,Prioridad prioridad) {
		boolean anadido=false;
		TareaEmpresa t1=new TareaEmpresa(descripcion,departamento,prioridad);
		if(tareasEnProgreso.contains(t1)) {
			anadido=false;
		}else {
			tareasEnProgreso.add(t1);
			anadido=true;
		}
		return anadido;
	}
	public boolean AddTareaCliente(String descripcion,Prioridad prioridad,String nombrecliente, String localidad) {
		boolean anadido=false;
		TareaCliente t1=new TareaCliente(descripcion,prioridad,nombrecliente, localidad);
		if(tareasEnProgreso.contains(t1)) {
			anadido=false;
		}else {
			tareasEnProgreso.add(t1);
			anadido=true;
		}
		return anadido;
	}
	//Metodo solo para comprobar que se anaden, no tomar en cuenta.
	public String imprimirListaTareas() {
		StringBuilder sb=new StringBuilder();
		for (Tarea t1 : tareasEnProgreso ) {
			sb.append(t1+"\n");
		}
		return sb.toString();
	}
	//Metodo para ordenar por fecha de alta
	public String mostrarTareasFechaAlta() {
		StringBuilder sb=new StringBuilder();
		Collections.sort(tareasEnProgreso,new OrdenarTareasPorFechaAlta());
		for (Tarea t1 : tareasEnProgreso ) {
			sb.append(t1+"\n");
		}
		return sb.toString();
	}
	//Este metodo me da un null pointer y no se porque.
	public String mostrarTareasPrioridad() {
		StringBuilder sb=new StringBuilder();
		Collections.sort(tareasEnProgreso,new OrdenarTareasPorFechaPrioridad());
		for (Tarea t1 : tareasEnProgreso ) {
			sb.append(t1+"\n");
		}
		return sb.toString();
	}
	//Otro nullpointer , nada mas tenga una tarea en la lista , peta
	public String numTareasPendientes() {
		int contadorAlta=0,contadorMedia=0,contadorBaja=0;
		for(Tarea t: tareasEnProgreso) {
			if(t.getPrioridad().equals(Prioridad.ALTA)){
				contadorAlta++;
			}else if(t.getPrioridad().equals(Prioridad.MEDIA)) {
				contadorMedia++;
			}else {
				contadorBaja++;
			}
		}
		return "Numero de tareas Altas"+contadorAlta+"Numero de tareas Media"+contadorMedia+"Numero de tareas Baja";
	}
}
