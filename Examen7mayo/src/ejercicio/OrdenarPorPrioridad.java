package ejercicio;

import java.util.Comparator;

public class OrdenarPorPrioridad implements Comparator<Tarea> {
	@Override
	public int compare(Tarea o1, Tarea o2) {
		int result;
		if(o1.getPrioridad()==Prioridad.ALTA && (o2.getPrioridad()==Prioridad.MEDIA ||o2.getPrioridad()==Prioridad.BAJA)){
			result=1;
		}
		else if(o1.getPrioridad()==Prioridad.MEDIA && (o2.getPrioridad()==Prioridad.ALTA)) {
			result=-1;
		}
		else if(o1.getPrioridad()==Prioridad.BAJA && (o2.getPrioridad()==Prioridad.ALTA)) {
			result=-1;
		}
		else if(o1.getPrioridad()==Prioridad.BAJA && (o2.getPrioridad()==Prioridad.MEDIA)) {
			result=-1;
		}
		else if(o1.getPrioridad()==Prioridad.MEDIA && (o2.getPrioridad()==Prioridad.MEDIA)) {
			result=0;
		}
		else if(o1.getPrioridad()==Prioridad.ALTA && (o2.getPrioridad()==Prioridad.ALTA)) {
			result=0;
		}
		else if(o1.getPrioridad()==Prioridad.BAJA && (o2.getPrioridad()==Prioridad.BAJA)) {
			result=0;
		}
		else {
			result=0;
		}
		return result;
	}
}

