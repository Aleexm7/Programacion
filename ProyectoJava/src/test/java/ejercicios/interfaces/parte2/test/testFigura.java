package ejercicios.interfaces.parte2.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ejercicios.interfaces.parte2.*;


public class testFigura {

	@Test
	public void testEqualsFigura() {
		circulo c1 = new circulo(20);
		circulo c2 = new circulo(30);
		
		assertFalse(c1.equals(c2));
	}
	
	@Test
	public void testClone() throws CloneNotSupportedException {
		circulo c3 = new circulo(30);
		circulo c5 = (circulo) c3.clone();
		
		assertFalse(c3==c5);
		assertTrue(c3!=c5);
	}
	
}
