 package matrices;
//Tambien esta el ejercicio 2 abajo
public class Ejercicio1 {
	public static void main(String[]args) {
		int[][]ejercicio1=new int[4][4];
		for (int i=0;i<ejercicio1.length;i++) {
			for (int j=0;j<ejercicio1[i].length;j++) {
				if (ejercicio1[i]==ejercicio1[j]) {
					ejercicio1[i][j]=1;
				}
				else {
					ejercicio1[i][j]=0;
					
				}
				System.out.println(ejercicio1[i][j]);
			}
			
		}
		for (int i = 0; i < ejercicio1.length; i++) {
			System.out.println("\n");
			for (int sys = 0; sys < ejercicio1.length; sys++) {
				System.out.print(ejercicio1[i][sys]);
			}
		}
		int[][]ejercicio2=new int[4][4];
		for (int i=0;i<ejercicio1.length;i++) {
			for (int j=0;j<ejercicio2[i].length;j++) {
				if (ejercicio2[i]==ejercicio2[j]) {
					ejercicio2[i][j]=1;
				}
				else {
					ejercicio2[i][j]=5;
					
				}
				System.out.println(ejercicio2[i][j]);
			}
			
		}
		for (int i = 0; i < ejercicio1.length; i++) {
			System.out.println("\n");
			for (int h = 0; h < ejercicio2.length; h++) {
				System.out.print(ejercicio2[i][h]);
			}
		}
	}
	
}

