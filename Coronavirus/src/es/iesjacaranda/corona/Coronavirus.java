package es.iesjacaranda.corona;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.google.gson.Gson;
	//gettersetterconstructorhashset
	//fechaconformato
public class Coronavirus {
	String fecha;
	private int contagiados;
	private int fallecidos;
	private int curados;
	public Coronavirus(String fecha, int contagiados, int fallecidos, int curados) {
		super();
		this.fecha = fecha;
		this.contagiados = contagiados;
		this.fallecidos = fallecidos;
		this.curados = curados;
	}
	
	public Coronavirus() {
		super();
	}

	ArrayList solucion=new ArrayList<Coronavirus>();

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getContagiados() {
		return contagiados;
	}
	public void setContagiados(int contagiados) {
		this.contagiados = contagiados;
	}
	public int getFallecidos() {
		return fallecidos;
	}
	public void setFallecidos(int fallecidos) {
		this.fallecidos = fallecidos;
	}

	public ArrayList getSolucion() {
		return solucion;
	}
	public int getCurados() {
		return curados;
	}
	public void setCurados(int curados) {
		this.curados = curados;
	}
	public ArrayList MostrarDia() {
		String linea;
		StringBuilder resul = new StringBuilder();
		try
		{
			FileReader flujoLectura=new FileReader("./ficheros/casos_diagnosticados_de_c.json");
			BufferedReader filtroLectura=new BufferedReader(flujoLectura);
			linea=filtroLectura.readLine();
			while ( linea!=null)
			{
				resul.append(linea);
				linea=filtroLectura.readLine();
			}
			filtroLectura.close();
			flujoLectura.close();
			}
		catch(FileNotFoundException e){
		}
		catch(IOException e){
		}
		Gson gson = new Gson();
		
		LecturaJson l = gson.fromJson(resul.toString(), LecturaJson.class);
		long menor=0;
		String dias="";
		for (ClaseMetrica aux : l.getDatos().getMetrica()) {
			for (Informacion inf : aux.getDatos()) {
				System.out.println(inf.getValor()-inf.getValor());
				if (menor<inf.getValor()) {
					menor=inf.getValor();
					String[] dia=inf.getPeriodo().split(" ", 2);
					Coronavirus c=new Coronavirus(dia[1], (int) inf.getValor(), 0, 0);
					solucion.add(c);
				}
			}
		}
		return solucion;
	}
}
