package ejercicio6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejercicioalumnos.Alumno;
public class Letras {
	private List<Integer> letras;
	

	public final String ABECEDARIO="ABCDEFGHIJKLMNOPQRSTUVWYZ";
	public Letras() {
		super();
		/*
		 * Inicializo
		 */
		//letras=new ArrayList<Integer>(26);

		letras=new ArrayList<Integer>(26);
	}
	
	public List<Integer> getLetras() {
		return letras;
	}

	public void AddContadorLetras() {
	int contador=0;
		
		for (int i = 0; i <27; i++) {
			this.letras.add(contador);
		}
	}

	public String cuentaLetras(String frase) {
		char aux;
		int contador=0;
		for (int i = 0; i < frase.length(); i++) {
			
			for (int j = 0; j < ABECEDARIO.length(); j++) {
				aux=frase.charAt(i);
				if (aux==ABECEDARIO.charAt(j)) {
					contador++;
					letras.set(j, contador);
					/*
					 * Tengo que arreglar esto
					 * 
					 */

				}
				
			}
		}
		return " \n"+letras.toString();
	}

	@Override
	public String toString() {
		String resultado="";
		int aux;
		for (int i = 0; i < letras.size()-1; i++) {
			aux=letras.get(i);
			resultado+=aux;
		}
		return resultado;
	}
	
}
