package clases;

import java.util.ArrayList;
import java.util.List;

public class Centro {
	
	private String nombre;
	private List<Curso>cursos;
	private String tipo;
	private String codCentro;
	
	public Centro(String tipo, String codCentro, String nombre) {
		this.nombre = nombre;
		this.cursos = new ArrayList<Curso>();
		this.tipo = tipo.contains("Centro") ? "Privado" : "Público";
		this.codCentro = codCentro;
	}
	
	public Centro() {}
	
	public void addCurso(Curso curso, Materia ma) {
		if(!this.cursos.contains(curso)) {
			cursos.add(curso);
		}else {
			this.cursos.get(this.cursos.indexOf(curso)).addMateria(ma);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCodCentro() {
		return codCentro;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCentro == null) ? 0 : codCentro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Centro))
			return false;
		Centro other = (Centro) obj;
		if (codCentro == null) {
			if (other.codCentro != null)
				return false;
		} else if (!codCentro.equals(other.codCentro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Centro: " + nombre );
		
		for(Curso i: cursos) {
			sb.append(i.toString()+" ");
		}
		
		return sb.toString();
	}

	
	
}

