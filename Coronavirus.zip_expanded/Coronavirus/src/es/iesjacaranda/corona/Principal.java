package es.iesjacaranda.corona;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Principal {

	public static void main(String[] args) {
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
		System.out.println("No existe el fichero ");
		}
		catch(IOException e){
		System.out.println( e.getMessage());
		}
		
		Gson gson = new Gson();
		
		LecturaJson l = gson.fromJson(resul.toString(), LecturaJson.class);
		
		for (ClaseMetrica aux : l.getDatos().getMetrica()) {
			for (Informacion inf : aux.getDatos())
				System.out.println(inf);
		}
		System.out.println("hola");
		

	}

}
