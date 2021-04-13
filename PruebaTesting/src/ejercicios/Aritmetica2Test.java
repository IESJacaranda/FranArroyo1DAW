package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Aritmetica2Test {
	Aritmetica2 aritmetica;
	@BeforeEach
		public void init() {		
		Aritmetica2 aritmetica=new Aritmetica2();
	}
	  @Test
		void testSuma() {
			assertEquals(2, aritmetica.suma(1, 1));
			assertEquals(0, aritmetica.suma(-1, 1));
			assertEquals(1, aritmetica.suma(0, 1));
			assertEquals(-2, aritmetica.suma(-1, -1));
		}
	  
	  
	  @Test
		void testResta() {
			assertEquals(0, aritmetica.resta(1, 1));
			assertEquals(-2, aritmetica.resta(-1, 1));
			assertEquals(-1, aritmetica.resta(0, 1));
			assertEquals(0, aritmetica.resta(-1, -1));	
			}

		@Test
		void testMultiplicacion() {
			assertEquals(1, aritmetica.multiplicacion(1, 1));
			assertEquals(-1, aritmetica.multiplicacion(-1, 1));
			assertEquals(0, aritmetica.multiplicacion(0, 1));
			assertEquals(1, aritmetica.multiplicacion(-1, -1));	}

		@Test
		void testDivision() {
			assertEquals(1, aritmetica.division(1, 1));
			assertEquals(-1, aritmetica.division(-1, 1));
			assertEquals(2, aritmetica.division(2, 1));
			//AssertEquals(Math.round(3.3333*100)/100, aritmetica.division(10, 3));
			}

		@Test
		void testGetUltimaResultado() {
			 Aritmetica prueba = new Aritmetica();
			 double resultado=prueba.resta(2,2);
			 assertEquals(0, resultado);
		}

	}
