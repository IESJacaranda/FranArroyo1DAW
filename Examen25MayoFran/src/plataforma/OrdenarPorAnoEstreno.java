package plataforma;

import java.util.Comparator;
//Ordeno con comparator porque no se hacerlo con comparable
public class OrdenarPorAnoEstreno implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		int result=0;
		if (o1.getAnoestreno()>o2.getAnoestreno()) {
			result=-1;
		}
		else if(o1.getAnoestreno()<o2.getAnoestreno()) {
			result=1;
		}
		else if (o1.getAnoestreno()==o2.getAnoestreno()) {
			result=0;
		}
		return result;
	}


}
