package ejercicios.oop.parte2.test;

import ejercicios.oop.parte2.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ElectrodomesticoTest {

	
	@Test
		public void testCrearElectrodomestico() {
		Electrodomestico dispositivo1 = new Electrodomestico("NESSON","V9-800", 630);
		assertEquals("NESSON", dispositivo1.getMarca());
		assertEquals("V9-800", dispositivo1.getModelo());
		assertEquals(630, dispositivo1.getConsumo());
		
		Electrodomestico dispositivo2 = new Electrodomestico("DYESN","TR-230", 250);
		assertEquals("DYESN", dispositivo2.getMarca());
		assertEquals("TR-230", dispositivo2.getModelo());
		assertEquals(250, dispositivo2.getConsumo());
	}
	
	@Test
		public void testCrearFrigorifico() {
		Frigorifico dispositivo1 = new Frigorifico("YAMAHA","V2-600", 150, 100);
		assertEquals("YAMAHA", dispositivo1.getMarca());
		assertEquals("V2-600", dispositivo1.getModelo());
		assertEquals(150, dispositivo1.getConsumo());
		assertEquals(100, dispositivo1.getTemperatura());
		
		Frigorifico dispositivo2 = new Frigorifico("YAMAHA","V2-800", 750, 120);
		assertEquals("YAMAHA", dispositivo2.getMarca());
		assertEquals("V2-800", dispositivo2.getModelo());
		assertEquals(750, dispositivo2.getConsumo());
		assertEquals(120, dispositivo2.getTemperatura());
	}
	
}
