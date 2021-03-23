package ejercicios;
import java.util.Scanner;
public class Ejercicio31 {
	static Scanner sc =new Scanner(System.in);
//	.Realizar un programa que solicite por teclado números entre 1 y 1000
//	hasta   que   el   usuario   informe   de   que   ya   no   desea   introducir   másnúmeros.
//	Después debe mostrar:
//	•La media de los números leídos.
	//•Cuántos números terminan en cada uno 
////	de los dígitos (0 .. 9).
//	•El dígito en el que más números terminan.
//	•En qué dígitos no ha terminado 
////	ningún número.Pista: crear un vector de contadores de 10 elementos
	public static void main(String[] args) {
		System.out.println(PedirNumeros());
	}
	public static int MayorRepeticion(int contadores[]) {
		int contadormayor=0;
		for (int i=0;i<contadores.length;i++) {
			if (contadores[i]>contadormayor) {
				contadormayor=contadores[i];
			}
		}
		return contadormayor;
		
	}
	public static int[] ContadorFinalizacionesNumero(int lista[]) {
		int[] contadores = new int[]{ 0,0,0,0,0,0,0,0,0,0};
		int aux = 0;
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count0=0;
		for (int i=0;i<lista.length;i++) {
			lista[i]=aux;
			if (lista[i]!=0) {
				if (aux+'0'=='0') {
					count0++;
					contadores[0]=count0;
				}
				else if (aux+'0'=='1') {
					count1++;
					contadores[1]=count1;
				}
				else if (aux+'0'=='2') {
					count2++;
					contadores[2]=count2;

				}
				else if (aux+'0'=='3') {
					count3++;
					contadores[3]=count3;
				}
				else if (aux+'0'=='4') {
					count4++;
					contadores[4]=count4;
				}
				else if (aux+'0'=='5') {
					count5++;
					contadores[5]=count5;
				}
				else if (aux+'0'=='6') {
					count6++;
					contadores[6]=count6;
				}
				else if (aux+'0'=='7') {
					count7++;
					contadores[7]=count7;
				}
				else if (aux+'0'=='8') {
					count8++;
					contadores[8]=count8;
				}
				else if (aux+'0'=='9') {
					count9++;
					contadores[9]=count9;
				}
			}
		}
		return contadores;
		
	}
	public static Double calcularMedia(int lista[]) {
		double media=0;
		int numnumeros=0;
		double acumulador=0;
		for (int i=0;i<lista.length;i++) {
			if (lista[i]!=0) {
				numnumeros++;
				acumulador+=lista[i];
			}
		}
		media=acumulador/numnumeros;
		return media;
		
	}
	public static int [] PedirNumeros() {
		boolean salir=false;
		int num,i=0;
		char c;
		int[] lista = new int[]{ 0,0,0,0,0,0,0,0,0,0}; 
		do {
			System.out.println("Introduce numero");
			num=Integer.parseInt(sc.nextLine());
			if(num<1000 && num>0) {
				lista[i]=num;
				i++;
				System.out.println("¿Desea introducir mas numeros? Y/N");
				c=sc.nextLine().charAt(0);
				if (c=='Y') {
					salir=true;	            
				}else if(c=='N') {
	            	salir=false;
	            }
			}
		}while(salir);
		return lista;
		
	}
}
