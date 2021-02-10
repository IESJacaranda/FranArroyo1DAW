package cadenasjava;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(upCaseInString("Espania"));
	}
	public static Integer upCaseInString(String cad) {
		int contador=0;
		char c;
		String comparador="";
		for (int i=0;i<cad.length();i++) {
			c=cad.charAt(i);
			if (Character.isUpperCase(c)) {
				contador++;
			}
		}
		return contador;
	}
}
