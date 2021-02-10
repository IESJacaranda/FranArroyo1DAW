package cadenasjava;


public class BuscarPalabra {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String cad="shybaoxlna";
		@SuppressWarnings("unused")
		String palabra="hola";
	}
	public static boolean BuscarPalabra(String cad,String palabra) {
		char c, p;
		int i = 0;
		boolean siono=false;
		int j = 0;
		while (i<palabra.length() && j<cad.length()){
			p = palabra.charAt(i);
			c = cad.charAt(j);
			if (p == c) {
				i++;
				j++;
			}else{
				j++;
				}
			}
			if (i == palabra.length()) {
				siono=true;
			} else {
				siono=false;
		}
		return siono;
	}
}
