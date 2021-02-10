package cadenasjava;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad="Choripan";
		System.out.println(lowCaseInString("Choripan"));
	}
	public static Integer lowCaseInString(String cad) {
		int contador=0;
		char c;
		String comparador="";
		for (int i=0;i<cad.length();i++) {
			c=cad.charAt(i);
			if (Character.isLowerCase(c)) {
				contador++;
			}
			
		}
		return contador;
	}

}
