package cadenasjava;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(charactersInString("Chorizo", 'o'));
	}
	public static Integer charactersInString(String cad,char letra) {
		int contador=0;
		String cadenanueva=cad.toUpperCase();
        letra = Character.toUpperCase(letra);
        for (int i=0;i<cadenanueva.length();i++) {
			if (cadenanueva.charAt(i)==letra) {
				contador++;
			}
		}
		return contador;
	}
}
