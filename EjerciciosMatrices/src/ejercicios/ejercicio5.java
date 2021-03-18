package ejercicios;

import java.util.Arrays;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(VerMatrizConFormato(matriz));
	}
    public static String VerMatrizConFormato(int[][] matriz){
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
    public static boolean CompararMatrices(int [][]matriz,int matriz2[][]) {
    	boolean soniguales=false;
    	if ((matriz.length==matriz2.length && matriz[0].length==matriz2[0].length)) {
    		int [][] matrizDerecha=RotarMatriz(matriz);
    		int [][] matrizAbajo=RotarMatriz(matrizDerecha);
    		int [][] matrizIzquierda=RotarMatriz(matrizAbajo);
    	}
    	for (int i=0;i<matriz.length;i++) {
    		for (int j=0;i<matriz[i].length;j++) {
    			soniguales=true;
    		}
    	}
    	return soniguales;
    }
    public static int [][] RotarMatriz(int [][]matriz){
		int aux = matriz.length;
		int[][] nuevamatriz = new int[aux][aux];
		for (int i=0;i<aux;i++) {
			  for (int j=0;j<aux;j++) {
				  nuevamatriz[i][aux-1-j] = matriz[i][j];
			  }
			}
		return nuevamatriz;
    }
}
