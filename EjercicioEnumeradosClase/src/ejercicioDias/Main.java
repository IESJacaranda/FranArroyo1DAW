package ejercicioDias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
	public static void main (String [] args) {
		
			Dia dia = Dia.SABADO;
			//Te dice el dia de la semana
			System.out.println(dia.getDiaSemana());
			//Te imprime el dia que le estas indicando
			System.out.println(Dia.DOMINGO);
			//Crea una instancia de la clase Date
			java.util.Date date;
			
			//Le asignamos al objeto ld, la fecha actual.
			LocalDate ld = LocalDate.now();
			//Le sumamos 366 dias
			ld.plusDays(366);
			//Le decimos la decha que nosotros queramos en un formato
			LocalDate ld1 = LocalDate.of(2011,3,3);
			//Y en otro
			LocalDate ld2 = LocalDate.parse("2018-03-15");
			
			//Con este metodo , nos devuelve un boolean en el caso de que ld1 sera despues
			//de ld2 imprimira true o false segun los valores que posean
			System.out.println(ld1.isAfter(ld2));
			
			//Es ta vez , es practicamente igual solo que con horas
			LocalTime lt = LocalTime.now();
			LocalTime lt1 = LocalTime.of(15,33,12);
			LocalTime lt2 = LocalTime.parse("11:00:59");
			System.out.println(lt1.isAfter(lt2));
			
			
			LocalDateTime ldt;
			

		}
	

	
}
