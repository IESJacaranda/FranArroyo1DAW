package ejercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona persona;
	@BeforeEach
	public void init() {
		//nombre: Susana
		//edad:: 25
		// altura: 1
		persona=new Persona();
		
	}

		
	@Test
	void testPersona() {
		assertEquals("",persona.getNombre());
		assertEquals(0,persona.getEdad());
		assertEquals(0,persona.getAltura());
		assertEquals('H', persona.getSexo());

	}

	@Test
	void testPersonaStringIntChar() {
		Persona persona2=new Persona("Paco",25,'M');
		assertEquals("Paco",persona.getNombre());
		assertEquals(25,persona.getEdad());
		assertEquals(0,persona.getAltura());
		assertEquals('M', persona.getSexo());
	}

	@Test
	void testPersonaStringIntCharDoubleDouble() {
		Persona persona2=new Persona("Paco",25,'M');
		assertEquals("Paco",persona.getNombre());
		assertEquals(25,persona.getEdad());
		assertEquals(0,persona.getAltura());
		assertEquals('M', persona.getSexo());
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSexo() {
		persona.setSexo('H');
		assertEquals('H', persona.getSexo());
		persona.setSexo('M');
		assertEquals('M', persona.getSexo());
		persona.setSexo('K');
		assertEquals('H', persona.getSexo());
	}

	@Test
	void testSetPeso() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAltura() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularIMC() {
		Persona infra=new Persona("Susana",25,'M',19,1);
		assertEquals(-1, infra.calcularIMC());
		Persona normo20=new Persona("Susana",25,'M',20,1);
		assertEquals(0, normo20.calcularIMC());
		Persona normo21=new Persona("Susana",25,'M',21,1);
		assertEquals(0, normo21.calcularIMC());
		Persona normo25=new Persona("Susana",25,'M',25,1);
		assertEquals(0, normo25.calcularIMC());
		Persona sobre=new Persona("Susana",25,'M',26,1);
		assertEquals(1, sobre.calcularIMC());
	}

	@Test
	void testEsMayorDeEdad() {
		Persona menor=new Persona("Susana",17,'M',26,1);
		assertEquals(false, menor.esMayorDeEdad());
		Persona mayor1=new Persona("Susana",18,'M',26,1);
		assertEquals(true, mayor1.esMayorDeEdad());
		Persona mayor2=new Persona("Susana",19,'M',26,1);
		assertEquals(true, mayor2.esMayorDeEdad());
	}

	@Test
	void testToString() {
		//Esto no entra D:
		//asi k wai
//		Persona infra = new Persona("Susana",25,'M',19,1);
//		String patron= "Informacion de la persona:\n"
//                + "Nombre: " "\n"
//                + "Sexo: " "\n"
//                + "Edad: " + edad + " años\n"
//                + "DNI: " + DNI + "\n"
//                + "Peso: " + peso + " kg\n"
//                + "Altura: " + altura + " metros\n";
//		assertTrue(infra.toString().matches(patron));
	}
	@Test
	void testComprobarSexo() {
<<<<<<< HEAD
		assertEquals('H', p2.setSexo('H'));
=======
>>>>>>> 7a66214571d110c5b5c936ebd25001a75a7b1ebe
	}

}
