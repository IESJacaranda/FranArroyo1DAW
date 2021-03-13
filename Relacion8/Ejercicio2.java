package ejercicios;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros=new int[10];
        for (int i=0;i < numeros.length;i++) {
        	System.out.println("Me metes 10 numeros xfi");
            numeros[i]=Integer.parseInt(sc.nextLine());	
        }
  		for (int i=0; i<numeros.length;i++) {
			  System.out.print("-"+numeros[i]);
		  }       
        desplazaDerecha(numeros);
  		for (int i=0; i<numeros.length;i++) {
			  System.out.println("-"+numeros[i]);
		  }
    }
    public static void desplazaDerecha(int[] lista){
        int i,ultimo;
        ultimo=lista[lista.length-1];
        for(i=lista.length-1; i>0; i--){
            lista[i]=lista[i-1];
        }
        lista[0]=ultimo;
    }
}
