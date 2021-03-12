package ejercicios;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. Elabora un programa que concatene listas de datos en una sola variable.
//Por ejemplo, si recibe dos listas de tamaño 2 y 3 con los datos  [3, 2] y [5, 15, 23] 
//devuelva una única lista de tamaño 5 con [3, 2, 5, 15, 23].
		 int[] lista1 = new int[]{ 3,2}; 
		 int[] lista2 = new int[]{ 5,15,23}; 
		 System.out.println(ConcatenarArrays(lista1, lista2));
	}
    private static String ConcatenarArrays(int[] lista1, int[] lista2) { 
        int arrayjunto[]=new int[lista1.length+lista2.length];
        String resultado="";
    	for (int i = 0; i<lista1.length; i++) {
        	arrayjunto[i] = lista1[i]; 
        }
        for (int i = 0, j=lista1.length; i<lista2.length; i++, j++) {
            arrayjunto[j] = lista2[i];
        }
        for (int i=0;i<arrayjunto.length;i++) {
        	resultado+="["+arrayjunto[i]+"]";
        }
		return resultado;
    }
}

