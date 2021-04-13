package ejercicio2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Elsa Pito", "123PALANTEMARIA");		
		Yate yate = new Yate(1, 2000, "6969", 2, 00);
		Alquiler alquilerYate = new Alquiler(cliente, yate, LocalDate.now(), LocalDate.now(), null); 
		System.out.println(alquilerYate.getPrecio());
	}

}