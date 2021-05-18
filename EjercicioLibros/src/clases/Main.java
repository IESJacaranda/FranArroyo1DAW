package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

	public static void main(String[] args) {
		try {
			cargarDatos(".\\ficheros\\gratuidadlibrosdetextoandalucia.csv");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public static void cargarDatos(String f) throws Exception {
			try (BufferedReader filtroLectura = new BufferedReader(new FileReader(f))){
				String linea = "";
				ListaDeCentros c = new ListaDeCentros();
				
				while((linea = filtroLectura.readLine())!= null) { 
					String values[] = linea.split(",");
					if(values.length>=1) {
						//MATERIAS
						Libros li = new Libros(values[7],values[9],values[8],values[10]);
						Materia ma = new Materia(values[6],li);
						
						//CURSO
						Curso curso = new Curso(values[5]);
						
						//CENTRO
						Centro centro = new Centro(values[2],values[3],values[4]);//tipo, codigo, nombre
						
						//LOCALIDAD
						Localidad local = new Localidad(values[1]);
						
						//PROVINCIA
						Provincia p = new Provincia(values[0]);
						
						
						//AÑADIR
						curso.addMateria(ma);
						centro.addCurso(curso, ma);
						local.addCentro(centro, curso, ma);
						p.addLocalidad(local, centro, curso, ma);
						c.addProvincia(p, local, centro, curso, ma);
						
					}
				}
				
				//GENERAR UN ARCHIVO JSON CUANDO COGEMOS DATOS DE OTRO TIPO DE ARCHIVO (CON TO DO YA CARGADO)
				
				final Gson gson = new GsonBuilder().setPrettyPrinting().create();
				final String resul = gson.toJson(c);

				
				FileWriter fw = new FileWriter(".\\ficheros\\resul.json");
				PrintWriter pw = new PrintWriter(fw);
				pw.println(resul);
				
				fw.close();
				pw.close();

			}
		}
}
