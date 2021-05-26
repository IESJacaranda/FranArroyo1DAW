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
			cargarDatos("./archivos/gratuidadlibrosdetextoandalucia.csv");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

		public static void cargarDatos(String f) throws Exception {
			try (BufferedReader filtroLectura = new BufferedReader(new FileReader(f))){
				String line = "";
				ListaDeCentros c = new ListaDeCentros();
				
				while((line = filtroLectura.readLine())!= null) { 
					String values[] = line.split(",");
					if(values.length>=1) {
						Libros libros = new Libros(values[7],values[9],values[8],values[10]);
						Materia materias = new Materia(values[6],libros);
						Curso cursos = new Curso(values[5]);
						Centro centro = new Centro(values[2],values[3],values[4]);
						Localidad localidades = new Localidad(values[1]);
						Provincia provincias = new Provincia(values[0]);

						cursos.addMateria(materias);
						centro.addCurso(cursos, materias);
						localidades.addCentro(centro, cursos, materias);
						provincias.addLocalidad(localidades, centro, cursos, materias);
						c.addProvincia(provincias, localidades, centro, cursos, materias);
						
					}
				}
				//Esto imprime un archivo .json de 39 mb , no ejecutar bajo ningun concepto xddd
				
//				final Gson gson = new GsonBuilder().create();
//				final String resul = gson.toJson(c);				
//				FileWriter escritor = new FileWriter("./archivos/resul.json");
//				PrintWriter imprimir = new PrintWriter(escritor);
//				imprimir.println(resul);
//				escritor.close();
//				imprimir.close();

			}
		}
}
