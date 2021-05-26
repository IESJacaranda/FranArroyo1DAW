package ejercicio1;

import java.util.HashSet;



public class Country {
	private int country_id;
	private String country;
	private HashSet<City> ciudades;
	
	public Country(int country_id, String country, HashSet<City> ciudades) {
		super();
		this.country_id = country_id;
		this.country = country;
		this.ciudades = new HashSet<City>();
	}

	public int getCountry_id() {
		return country_id;
	}

	public String getCountry() {
		return country;
	}

	public HashSet<City> getCiudades() {
		return ciudades;
	}
	public void addCiudad(City c) throws Exception {
		if (ciudades.contains(c)){
			throw new Exception("Esta ciudad ya existe");
		}else {
			this.ciudades.add(c);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudades == null) ? 0 : ciudades.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + country_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (ciudades == null) {
			if (other.ciudades != null)
				return false;
		} else if (!ciudades.equals(other.ciudades))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (country_id != other.country_id)
			return false;
		return true;
	}
	
}
