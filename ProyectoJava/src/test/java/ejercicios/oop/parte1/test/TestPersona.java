package ejercicios.oop.parte1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ejercicios.oop.parte1.*;

public class TestPersona {

	@Test
	void test_persona_class() {
		Persona p1 = new Persona("pepe", "Manchego", "54342516V",1991,"pepito");
		Persona p2 = new Persona("Maria", "Mana", "65432131T",1967,"marita");
		
		assertFalse(p1.getNombre() == p2.getNombre());
	
	}

	@Test
	public void testCrearPersona() {
		Persona persona = new Persona("Juan", "Pérez", "12345678A", 1990, "Juanito");
		Persona persona2 = new Persona("Alvaro", "Rodriguez", "87654321B", 1978, "Alvarito");
		Persona persona3 = new Persona("Pedro", "García", "97644321R", 1960, "Pedrito");

		assertFalse(persona.equals(persona2));
		assertFalse(persona.equals(persona3));
		assertFalse(persona2.equals(persona3));
	}

	@Test
	public void testClone() {
		Persona persona1 = new Persona("Juan", "Pérez", "12345678A", 1990, "Juanito");
		Persona persona2 = persona1.clone();
		Persona persona3 = persona2.clone();

		assertEquals(persona1, persona2);
		assertNotSame(persona1, persona2);
		assertEquals(persona2, persona3);
		assertNotSame(persona2, persona3);
	}

	@Test
	public void testEquals() {
		Persona persona1 = new Persona("Juan", "Pérez", "12345678A", 1990, "Juanito");
		Persona persona2 = new Persona("Alvaro", "Rodriguez", "87654321B", 1978, "Alvarito");
		Persona persona3 = new Persona("Pedro", "García", "97644321R", 1960, "Pedrito");

		assertFalse(persona1.equals(persona2));
		assertFalse(persona1.equals(persona3));
		assertFalse(persona2.equals(persona3));
		assertTrue(persona1.equals(new Persona("Juan", "Pérez", "12345678A", 1990, "Juanito")));
		assertTrue(persona2.equals(new Persona("Alvaro", "Rodriguez", "87654321B", 1978, "Alvarito")));
		assertTrue(persona3.equals(new Persona("Pedro", "García", "97644321R", 1960, "Pedrito")));
	}

}
