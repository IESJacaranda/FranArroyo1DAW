package plataforma;

import java.util.LinkedList;

public class Serie extends Producto{
	//Uso una linkedlist en episodios porque se deben eliminar, anadir nuevos etc por el medio de la lista, al
	//principio y final
	private LinkedList<Episodio>listaepisodios;
	private int numepisodios;
	public Serie(String nombre, String tema, int anoestreno, int numvisualizaciones,int numepisodios) {
		super(nombre, tema, anoestreno, numvisualizaciones);
		this.numepisodios=numepisodios;
		this.listaepisodios=new LinkedList<Episodio>();
	}
	@Override
	public String toString() {
		return super.toString()+"Serie [listaepisodios=" + listaepisodios + ", numepisodios=" + numepisodios + "]";
	}
	public void MeterEpisodio(String nombreeposido,int numepisodio) {
		Episodio e=new Episodio(nombreeposido, numepisodio);
		listaepisodios.add(e);
	}
	public void EliminarEpisodio(String nombreeposido,int numepisodio) {
		Episodio e=new Episodio(nombreeposido, numepisodio);
		listaepisodios.remove(e);
	}

}
