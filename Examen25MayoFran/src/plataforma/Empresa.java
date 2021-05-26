package plataforma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;



public class Empresa {
	private String nombre;
	//Eligo Arraylist porque siempre se iran añadiendo al final los productos de la lista y no se iran metiendo por la mitad
	//o eliminando productos
	private ArrayList<Producto>listaproductos;
	public Empresa(String nombre) {

		this.nombre = nombre;
		this.listaproductos = new ArrayList<Producto>();
	}
	public void addPeliSerie(int opcion,String nombre,String tema,int anoestreno,int visualizaciones,int aux) throws Exception {
		if (opcion==1) {
			Pelicula p1=new Pelicula(nombre, tema, anoestreno, visualizaciones,aux);
			listaproductos.add(p1);
		}
		else if(opcion==2) {
			Serie s1=new Serie(nombre,tema,anoestreno,visualizaciones,aux);
			listaproductos.add(s1);
		}
		else {
			throw new Exception("Valor incorrecto porfavor use 1 o 2");
		}
	}
	public boolean SetDuracion(String cadena,int duracion) {
		boolean result=false;
		for (Producto p : listaproductos) {
			if (p.getNombre().equals(cadena))
			((Pelicula) p).setDuracion(duracion);
			result=true;
		}
		return result;
	}
//	setTema(cadena nombre, cadena tema): este método deberá asignar un nuevo tema al libro 
//	o películacuyo nombre se le pasa por argumento. Si el nombre no corresponde con ninguna
//	película o serie o alasignar el tema se lanza una exception se deberá devolver false, en caso 
//	contrario true.
	//DRAMA,COMEDIA,INTRIGA,CIENCIAFICCION
	public boolean setTema(String nombre, String tema) throws Exception {
		boolean result=false;
		for (Producto producto : listaproductos) {
			if (producto.getNombre().equals(nombre)) {
				if (tema.equals("DRAMA")||tema.equals("COMEDIA")||tema.equals("INTRIGA")
						||tema.equals("CIENCIAFICCION")) {
					producto.setTema(Tema.valueOf(tema));
					result=true;
				}else {
					throw new Exception("HAs asignado mal el tema");
				}
			}
		}
		return result;
	}
	public int menorAnno() {
		int menor=9999999;
		for (Producto producto : listaproductos) {
			if (producto.getAnoestreno()<menor) {
				menor=producto.getAnoestreno();
			}
		}
		return menor;
	}
	public String listarPelisSeriesPorAgno() {
		StringBuilder mensaje=new StringBuilder("");
		Collections.sort(listaproductos,new OrdenarPorAnoEstreno());
		for (Producto p1 : listaproductos) {
			mensaje.append(p1+"\n");
		}
		return mensaje.toString();
	}
	public String listarPelisSeriesPorNombre() {
		StringBuilder mensaje=new StringBuilder("");
		Collections.sort(listaproductos,new OrdenarPorAnoEstreno());
		for (Producto p1 : listaproductos) {
			mensaje.append(p1+"\n");
		}
		return mensaje.toString();
	}
//	addEpisodio(cadena nombreSerie, cadena nombreEpisodio, int pos): deberá asignar un 
//	nuevo episodio ala serie. Devolverá true si se puede añadir el episodio de la serie y 
//	false en caso contrario
	public boolean addEpisodio (String nombreserie,String nombreepisodio,int pos) {
		boolean result=false;
		for (Producto p : listaproductos) {
			if (p.getNombre().equals(nombreserie))
			((Serie) p).MeterEpisodio(nombreepisodio,pos);
			result=true;
		}		
		return result;
	}
	public boolean delEpisodio (String nombreserie,String nombreepisodio,int pos) {
		boolean result=false;
		for (Producto p : listaproductos) {
			if (p.getNombre().equals(nombreserie))
			((Serie) p).EliminarEpisodio(nombreepisodio, pos);
			result=true;
		}		
		return result;
	}
}
