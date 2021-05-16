package examen;

import java.util.Comparator;

public class OrdenarTareasPorFechaAlta implements Comparator<Tarea> {

	@Override
	public int compare(Tarea t1, Tarea t2) {
		int result=0;
		if(t1.getFechaalta().isAfter(t2.getFechaalta())){
			result=1;
		}
		else if(t1.getFechaalta().isBefore(t2.getFechaalta())) {
			result=-1;
		}
		else {
			t1.getDescripcion().compareTo(t2.getDescripcion());
		}
		return result;
	}

}
