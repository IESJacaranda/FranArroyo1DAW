package cadenasjava;
//Design a function called palindrome that has a string of
//characters as parameter, and return true if it is a palindrome 
//or false in other case. A word is a palindrome, if it is 
//reads the same from left to right as from right to left, 
//ignoring whites,. For example: "anilina" or "el abad le dio arroz al zorro" 
//To simplify the problem, you can assume that simple characters are used,
//that is, without tildes or diresis.
public class Ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad="textootxeto";
		System.out.println(Palindrome2(cad));
	}
//	public static boolean Palindrome(String cad) {
//		StringBuilder cadenareversa=new StringBuilder();
//		StringBuilder cadena=new StringBuilder(cad);
//		cadenareversa=cadena.reverse();
//		char c;
//		int j=0;
//		boolean siono=false;
//		for (int i=cadena.length();i>0;i--) {
//			c=cadena.charAt(i-1);
//			if (cadena.charAt(i-1)==cadenareversa.charAt(j)) {
//				j++;
//				siono=true;
//			}
//			else {
//				return false;
//			}
//		}
//		return siono;
//	}
	public static boolean Palindrome2(String cad) {
		StringBuilder cadena=new StringBuilder(cad.replace(" ", "").toUpperCase());
		@SuppressWarnings("unused")
		char c;
		int j=0;
		boolean siono=false;
		for (int i=cadena.length();i>0;i--) {
			c=cadena.charAt(i-1);
			if (cadena.charAt(i-1)==cadena.charAt(j)) {
				j++;
				siono=true;
			}
			else {
				return false;
			}
		}
		return siono;
	}
}
