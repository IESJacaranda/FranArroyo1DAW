package ejercicio1;

import java.util.HashSet;

public class City {
	private int city_id;
	private String city;
	private HashSet<Adress> direcciones;
	
	public City(int city_id, String city, HashSet<Adress> direcciones) {
		super();
		this.city_id = city_id;
		this.city = city;
		this.direcciones = new HashSet<Adress>();
	}
	public int getCity_id() {
		return city_id;
	}

	public String getCity() {
		return city;
	}

	public HashSet<Adress> getDirecciones() {
		return direcciones;
	}
	public void addCiudad(Adress a) throws Exception {
		if (direcciones.contains(a)){
			throw new Exception("Esta calle ya existe");
		}else {
			this.direcciones.add(a);
		}
	}

}
