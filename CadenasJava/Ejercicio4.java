package cadenasjava;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberInString("Chorizopan12"));
	}
	public static int numberInString(String cad) {
		int contador=0;
		char c;
		for (int i=0;i<cad.length();i++) {
			c=cad.charAt(i);
			if (Character.isDigit(c)) {
				contador++;
			}
		}
		return contador;
	}

}
