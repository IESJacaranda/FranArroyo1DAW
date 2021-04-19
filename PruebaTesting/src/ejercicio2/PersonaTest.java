package ejercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona persona;
	Persona p2=new Persona("Paco", 12, 'H');
		
	
	@Test
	void testPersona() {
	}

	@Test
	void testPersonaStringIntChar() {
		fail("Not yet implemented");
	}

	@Test
	void testPersonaStringIntCharDoubleDouble() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	void testEsMayorDeEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}
	@Test
	void testComprobarSexo() {
		assertEquals('H', p2.setSexo('H'));
	}

}
