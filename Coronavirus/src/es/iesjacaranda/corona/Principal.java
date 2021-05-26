package es.iesjacaranda.corona;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
public class Principal {
	static Scanner sc=new Scanner(System.in);

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
			for (Informacion inf : aux.getDatos()) {
				System.out.println(inf);
				String[] dia=inf.getPeriodo().split(" ", 2);
				System.out.println(dia[1]);
			}

		}
		int eleccion=0;
		do {
			System.out.println(MostrarMenu());
			System.out.println("Introduce la opcion deseada");
			eleccion=Integer.parseInt(sc.nextLine());
			switch (eleccion) {
			case 1:
//			long menor=0;
//			for (ClaseMetrica aux : l.getDatos().getMetrica()) {
//				for (Informacion inf : aux.getDatos())
//					if (menor<inf.getValor()) {
//						menor=inf.getValor();
//						System.out.println(menor);
//					}
//				}
//			System.out.println(menor);
				Coronavirus c=new Coronavirus();
				c.MostrarDia();
				break;
			case 2:
				int dia;
				String mes;
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				System.out.println("Eleccion Incorrecta, si desea salir pulsa 7");
			}
		}while (eleccion!=7);
	}
	public static String MostrarMenu() {
		String MENU="1.Mostrar mejor Dia\n"
				+ "2.Mostrar mejor dia apartir de\n"
				+ "3.Mostrar peor dia\n"
				+ "4.Mostrar peor dia apartir de \n"
				+ "5.Numero de contagiados/muertes/altas en un dia\n"
				+ "6.Mostrar media de contagiados muertes y curados\n"
				+ "7.Salir";
		return MENU;
	}
}



