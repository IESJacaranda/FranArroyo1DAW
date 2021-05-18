package clases;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCentros {
	
	private List<Provincia>provincias;
	
	public ListaDeCentros() {
		super();
		provincias = new ArrayList<Provincia>();
	}
	
	public void addProvincia(Provincia p, Localidad local, Centro centro, Curso curso, Materia ma) {
		if(!this.provincias.contains(p)) {
			provincias.add(p);
		}else {
			this.provincias.get(this.provincias.indexOf(p)).addLocalidad(local, centro, curso, ma);
		}
	}
	
	public List<Provincia> getProvincias() {
		return provincias;
	}
	
	

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((provincias == null) ? 0 : provincias.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ListaDeCentros))
			return false;
		ListaDeCentros other = (ListaDeCentros) obj;
		if (provincias == null) {
			if (other.provincias != null)
				return false;
		} else if (!provincias.equals(other.provincias))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Provincias: ");
		
		for(Provincia i: provincias) {
			sb.append("\t"+i.toString()+"\n");
		}
		
		return sb.toString();
	}
	
	public String toJson() {
		StringBuilder sb = new StringBuilder("Provincias: ");
		
		for(Provincia i: provincias) {
			sb.append(i.toString()+" ");
		}
		
		return sb.toString();
	}
	
}
