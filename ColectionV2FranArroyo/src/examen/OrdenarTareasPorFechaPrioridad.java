package examen;

import java.util.Comparator;

public class OrdenarTareasPorFechaPrioridad implements Comparator<Tarea>{

	@Override
	public int compare(Tarea t1, Tarea t2) {
		int resul = 0;
		if(t1.getPrioridad().getNumhoras() < t2.getPrioridad().getNumhoras()) {
			resul = -1;
		}else if(t1.getPrioridad().getNumhoras() > t2.getPrioridad().getNumhoras()){
			resul = 1; 
			}
		return resul;
	}
}
