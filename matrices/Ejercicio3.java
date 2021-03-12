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
    private static int[][] SumarMatriz(int[][] matriz1, int[][] matriz2){
        int filas1 =matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 =matriz2.length;
        int columnas2 = matriz2[0].length;
        int[][] resultado;
        if(matriz1!=null && matriz2!=null && matriz1.length==matriz2.length && matriz1[0].length==matriz2[0].length) {
        	
        }
        if(filas1 == filas2 && columnas1 == columnas2){
            resultado = new int[filas1][columnas1];
            for(int i=0;i<matriz1.length;i++){
                for(int j=0;j<matriz1[0].length;j++){
                    resultado[i][j]= matriz1[i][j] + matriz2[i][j];
                }
            }
            return resultado;
        } else {
            return null;
        }
    }
 


}
