package ejercicios.oop.parte4.test;

import ejercicios.oop.parte4.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class testRobots {

	@Test
	public void testCrearRobots() {
		Robot r1 = new Robot(1001, 4566, 25);
		r1.getName();
		Robot r2 = new Robot(1002, 4570, 25);
		r2.getName();

	}

	@Test
	public void testClonarRobot() {
		try {
			Robot r3 = new Robot(1004,4570,25);
			Robot r4 = (Robot) r3.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEqualsRobot() {
		Robot r5 = new Robot(1005,4566,30);
		Robot r6 = new Robot(1006,4566,25);
		
		assertFalse(r5.equals(r6));
		assertTrue(r6.equals(new Robot(1006,4566,25)));
	}

}
