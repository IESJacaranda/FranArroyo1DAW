package es.iesjacaranda.corona;

import java.util.ArrayList;

public class ClaseMetrica {
	
	private ArrayList<Informacion> Datos;

	public ClaseMetrica() {
		this.Datos = new ArrayList<Informacion>();
	}

	
	public ClaseMetrica(ArrayList<Informacion> datos) {
		super();
		Datos = datos;
	}


	public ArrayList<Informacion> getDatos() {
		return Datos;
	}
	
	
}
