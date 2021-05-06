package relacion11.ejercicio3;

public class Reverse {
	
	public static <T> T[] reverse (T[] arrayOriginal){
		for(int i=0;i<arrayOriginal.length/2;i++) {
			T arrayReverse = arrayOriginal[i];
			arrayOriginal[i] = arrayOriginal[arrayOriginal.length-i-1];
			arrayOriginal[arrayOriginal.length-i-1] = arrayReverse;
		}
		return arrayOriginal;
	}
	
	public static <T> void print (T[]arrayReverse) {
		for(int i=0;i<arrayReverse.length;i++) {
			System.out.println(arrayReverse[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Integer[]original = {1,2,7,5,3,4};
		
		Reverse.print(Reverse.reverse(original));
	}

}
