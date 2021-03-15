package ejercicios;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int aux = matriz.length;
		int[][] nuevamatriz = new int[aux][aux];
		for (int i=0;i<aux;i++) {
			  for (int j=0;j<aux;j++) {
				  nuevamatriz[i][aux-1-j] = matriz[i][j];
			  }
			}
		System.out.println(VerMatrizConFormato(matriz));
		System.out.println(VerMatrizConFormato(nuevamatriz));
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
}
