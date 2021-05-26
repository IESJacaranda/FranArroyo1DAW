package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File archivo = new File ("ListaDeTodo.txt");
	    String lectura;
	    String direcciones="";
	  /*
	   * Asi se lee un archivo
	    */
//	    FileReader lector = new FileReader("address2.txt");
//	    BufferedReader buffer = new BufferedReader(lector);
//	    while ((cadena = buffer.readLine())!=null) {
//	    	   System.out.println(cadena);
//	    	}
	    FileReader lector = new FileReader("address2.txt");
	    BufferedReader buffer = new BufferedReader(lector);
	    while ((lectura = buffer.readLine())!=null) {
	    	  direcciones+=lectura+"\n";
	    	}
	    try {
	    	File archivoprueba=new File(".lista.txt");
	    	 FileWriter escribir=new FileWriter(archivoprueba,true);
	    	 escribir.write(direcciones);
	    	 
	    }catch (Exception iOException){
	    }
	    FileReader lectorr = new FileReader(".lista.txt");
	    BufferedReader bufferr = new BufferedReader(lectorr);
	    while ((lectura = buffer.readLine())!=null) {
	    	System.out.println(lectura);
	    	}
	}

}
