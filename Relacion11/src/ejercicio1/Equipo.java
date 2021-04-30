package ejercicio1;

import java.util.HashSet;

public class Equipo {
	private String nombrequipo;
	private HashSet<Alumno> alumnos;
	
	public Equipo() {
		super();
	}

	public String getNombrequipo() {
		return nombrequipo;
	}
	public void setNombrequipo(String nombrequipo) {
		this.nombrequipo = nombrequipo;
	}
	public HashSet<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(HashSet<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public void InicializarHashSet() {
		alumnos=new HashSet<Alumno>();
	}
	public String AddAlumno(Alumno o) throws Exception {
		String verificacion="";
		if (o instanceof Alumno && !alumnos.contains(o)) {
			alumnos.add(o);
			verificacion="Roonie Cooleman esta orgulloso de ti";
		}else {
			throw new Exception("La liaste conxa e tumadre");
		}
		return verificacion;
		
	}
	public String MostrarListaAlumnos(Equipo o) {0
		for(Equipo o: alumnos){
			System.out.println(alum);
			}
		return "";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumnos == null) ? 0 : alumnos.hashCode());
		result = prime * result + ((nombrequipo == null) ? 0 : nombrequipo.hashCode());
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
		Equipo other = (Equipo) obj;
		if (alumnos == null) {
			if (other.alumnos != null)
				return false;
		} else if (!alumnos.equals(other.alumnos))
			return false;
		if (nombrequipo == null) {
			if (other.nombrequipo != null)
				return false;
		} else if (!nombrequipo.equals(other.nombrequipo))
			return false;
		return true;
	}
	
}
