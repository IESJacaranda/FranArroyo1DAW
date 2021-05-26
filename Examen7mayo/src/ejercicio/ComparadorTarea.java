package ejercicio;

import java.time.LocalDateTime;

public class ComparadorTarea implements Comparable<Tarea>{
	/*
	 * Compara si las tareas son iguales
	 */
	public boolean compararTareas(Tarea t1,Tarea t2) {
		boolean result=false;
		if (t1.getDescripcion()==t2.getDescripcion() 
				&& t1.getFechaalta()==t2.getFechaalta()) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}

	@Override
	public int compareTo(Tarea o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
