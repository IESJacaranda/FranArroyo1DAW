package repaso;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	public String MOSTRARMENU() {
		String MENU="1. Añadir generador solar\n"
				+ "2.Añadir generador eólico."
				+ "3.Mostrar generadores de la empresa ordenados por lafecha de inicio de funcionamiento.\n"
				+ "4.Mostrar generadores  de  la  empresa  ordenador  por la \n"
				+ "localidad y si  están  \n"
				+ "en  la  misma localidad por fecha de inicio.\n"
				+ "5.Mostrar generadores eólicos de la empresa\n"
				+ "6.Borrar generador\n"
				+ "7.Mostrar total de energía suministrada por la empresa\n"
				+ "8.¿Existe generador en Localidad?\n"
				+ "9.Salir\n";
		return MENU;
	}
}
