package lol;

public class prueba {
	public static void main(String[]args) {
		//Hacer matriz diagonal donde la diagonal sea 1, y otra matriz de todo 5 menos 
		//la diagonal (el tamaño 4x4)
		//int [] vector=new int[5];
		//System.out.println(vector);
		//System.out.println(vector[vector.length-1]);
		//System.out.println(vector[0]);
		//int[][] matrix=new int[5][5];
		//matrix[0][3]=8;
		//System.out.println(matrix[0][3]);
		//Jugador[][] mapa=new Jugador[10][10];
		//for(int i=0;i<mapa.length;i++) {
			//for(int j=0;j<mapa.length;j++) {
				//mapa[i][j]=new Jugador();
			//	System.out.println(mapa[i][j]);
		//int [] otroejemplo=new int[10];
			//}
		//}
		int[]cuentatras=new int[10];
		for (int i=0;cuentatras.length>i;i++) {
			cuentatras[i]=i;
			System.out.println(cuentatras[i]);
		}
		int [][][] cuboo=new int[10][9][10];
		for (int i=0;i<cuboo.length;i++) {
			for (int j=0;j<cuboo[i].length;j++) {
				for(int k=0;k<cuboo[i][j].length;k++) {
					cuboo[i][j][k]=1;
					System.out.println(cuboo[i][j][k]);
					//System.out.println(i+"."+j+"."+k);

				}
			}
		}
	}
}
