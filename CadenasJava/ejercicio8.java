package cadenasjava;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8.Designer an función que determine la cantidad de vocales diferentes,
//		que tiene una palabra o frase introducida por teclado. Por ejemplo, la
//		cadena “Abaco”, devolvería 2.
	}
	public static Integer cuentavocales(String frase) {
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		frase=frase.toLowerCase();
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)=='a') {
			contadorA=1;	
			}
			else if (frase.charAt(i)=='e') {
				contadorE=1;	
				}
			else if (frase.charAt(i)=='i') {
				contadorI=1;	
				}
			else if (frase.charAt(i)=='o') {
				contadorO=1;	
				}
			else if (frase.charAt(i)=='u') {
				contadorU=1;	
				}
		}
		return contadorA+contadorE+contadorI+contadorO+contadorU;
	}
}
