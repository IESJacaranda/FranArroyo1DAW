package es.iesjacaranda.corona;

import java.util.ArrayList;

public class ClaseDatos {
	private ArrayList<ClaseMetrica>  Metricas;

	public ClaseDatos() {
		super();
		this.Metricas = new ArrayList<ClaseMetrica>();
	}

	
	
	public ClaseDatos(ArrayList<ClaseMetrica> metrica) {
		super();
		Metricas = metrica;
	}



	public ArrayList<ClaseMetrica> getMetrica() {
		return Metricas;
	}
	
	
	
	

}
