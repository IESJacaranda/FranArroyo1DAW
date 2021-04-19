package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaJovenTest {

	@Test
	void testEsTitularValido() {
		//>18 || <25
		CuentaJoven c=new CuentaJoven();
		Persona personaMenor=new Persona("Paco",12,"3001012D");
		Persona personamayor=new Persona("ILLOJUAN",16,"213123Z");
		c.setPersona(personaMenor);
		assertFalse(c.esTitularValido());
		c.setPersona(personamayor);
		assertFalse(c.esTitularValido());
	}
	public void lanzaExcepcionSiNoTitular() {
		boolean lanzaExcepcion=false;
		try {
			CuentaJoven cj=new CuentaJoven();
			cj.esTitularValido();
		} catch (NullPointerException e) {
			lanzaExcepcion=true;
		}
		assert(lanzaExcepcion);


	}
}
