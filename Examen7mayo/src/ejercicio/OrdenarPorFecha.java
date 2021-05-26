package ejercicio;

import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<Tarea>{


	@Override
	public int compare(Tarea o1, Tarea o2) {
		int result;
		if(o1.getFechaalta().isAfter(o2.getFechaalta())){
			result=1;
		}
		else if(o1.getFechaalta().isBefore(o2.getFechaalta())) {
			result=-1;
		}
		else {
			result=0;
		}
		return result;
	}
}
