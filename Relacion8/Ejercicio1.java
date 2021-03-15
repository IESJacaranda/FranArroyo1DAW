package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
	
	static Scanner sc=new Scanner (System.in);
	
	public static void main(String[] args) {
		  int[] numeros = new int[10];
		  System.out.println("Me introduces 10 numeros? xfa 7u7");
		  
		  for (int i = 0; i<numeros.length; i++) {
			  numeros[i]=Integer.parseInt(sc.nextLine());
		  }
		  for (int i=9; i>=0;i--) {
			  System.out.print("-"+numeros[i]);
		  }
	  }
}

