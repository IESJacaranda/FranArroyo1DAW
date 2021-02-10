package cadenasjava;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ejercicio10 {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       String frase;
       System.out.print("Introduce una frase: ");
       frase = sc.nextLine();
       StringTokenizer cadena = new StringTokenizer(frase);
       System.out.println("Número de palabras:"+cadena.countTokens());                                             
    }
}