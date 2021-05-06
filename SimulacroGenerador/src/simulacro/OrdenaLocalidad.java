package simulacro;

import java.util.Comparator;

public class OrdenaLocalidad implements Comparator<AbstractGenerador>{

	@Override
	public int compare(AbstractGenerador o1, AbstractGenerador o2) {
		
		int aux = o1.getFecha().compareTo(o2.getFecha());
		
		if(o1.getLocalidad().equals(o2.getLocalidad())) {
			aux = o1.getLocalidad().compareTo(o2.getLocalidad());
		}
		
		return aux;
	}

}
