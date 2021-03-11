package ejercicios;
import java.util.Random;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3. Genera un programa que dadas dos matrices calcule su suma. 
//Ten en cuenta que para que dos matrices se puedan sumar, éstas deben 
//tener la misma dimensión (número de filas , número de columnas).Por ejemploDados 
//[1, 0, 0]
//[7, 14, 23]
//[8, 14, 23]
//		
//[0, 1, 0] + [3,  9,  15]=
//
//[3, 10, 15]
//[0, 0, 1]
//[0,   7, 22]
//[9,  7,  23]
		//Se inician las dos matrices
		int[][] matriz1= new int[3][3];
		int[][] matriz2=new int[3][3];
        int[][] suma = new int[matriz1.length][matriz2.length];
        RellenadorDeMatrices(matriz1);
        RellenadorDeMatrices(matriz2);
        for (int i=0; i < matriz1.length; i++) {
        	  for (int j=0; j< matriz1[i].length; j++) {				
        	    suma[i][j]=matriz1[i][j]+matriz2[i][j];								
        	  }
        	}
        System.out.println(VerMatrizConFormato(suma));
	
	}
	private static void RellenadorDeMatrices(int[][] matriz1) {
		Random asignadornumeros=new Random();
		for (int i=0;i<matriz1.length;i++) {
			for (int j=0;j<matriz1[i].length;j++) {
				matriz1[i][j]=asignadornumeros.nextInt(10);
			}
		}
	}
    private static String VerMatrizConFormato(int[][] matriz){
    	String matrizconformato="";
    	int z=0;
        for(int i=0;i<matriz.length;i++){
        	matrizconformato=matrizconformato+"\n [";
            for(int j=0;j<matriz[i].length;j++){
            	if(j!=matriz[j].length-1) {
            		matrizconformato+=matriz[i][j]+",";
            	}
        		else {
        			matrizconformato+=matriz[i][j]+"]";
        		}
            }
        }
        return matrizconformato;
    }


}
