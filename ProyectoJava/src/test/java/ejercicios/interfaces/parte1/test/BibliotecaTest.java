package ejercicios.interfaces.parte1.test;

import ejercicios.interfaces.parte1.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class BibliotecaTest {

	
	 @Test
	    public void testCrearLibros() {
	        Libros libro1 = new Libros("1234", "El nombre del viento", 2007);
	        assertEquals("1234", libro1.getCodigo());
	        assertEquals("El nombre del viento", libro1.getTitulo());
	        assertEquals(2007, libro1.getAnioPublicacion());

	        Libros libro2 = new Libros("5678", "El temor de un hombre sabio", 2011);
	        assertEquals("5678", libro2.getCodigo());
	        assertEquals("El temor de un hombre sabio", libro2.getTitulo());
	        assertEquals(2011, libro2.getAnioPublicacion());
	        
	        Libros libro3 = new Libros("3456", "El hombre de hierro", 2010);
	        assertEquals("3456", libro3.getCodigo());
	        assertEquals("El hombre de hierro", libro3.getTitulo());
	        assertEquals(2010, libro3.getAnioPublicacion());
	        
	        Libros libro4 = new Libros("5654", "El madrugon", 2000);
	        assertEquals("5654", libro4.getCodigo());
	        assertEquals("El madrugon", libro4.getTitulo());
	        assertEquals(2000, libro4.getAnioPublicacion());
	        
	        Libros libro5 = new Libros("3212", "La lujuria", 1998);
	        assertEquals("3212", libro5.getCodigo());
	        assertEquals("La lujuria", libro5.getTitulo());
	        assertEquals(1998, libro5.getAnioPublicacion());
	    }

	    @Test
	    public void testPrestarYDevolverLibro() {
	        Libros libro1 = new Libros("1234", "El nombre del viento", 2007);
	        
	        assertFalse(libro1.prestado());
	        libro1.prestar();
	        assertTrue(libro1.prestado());

	        libro1.devolver();
	        assertFalse(libro1.prestado());
	        
	        Libros libro2 = new Libros("5678", "El temor de un hombre sabio", 2011);
	        assertFalse(libro2.prestado());
	        libro2.prestar();
	        assertTrue(libro2.prestado());

	        libro2.devolver();
	        assertFalse(libro2.prestado());
	        
	        Libros libro3 = new Libros("3456", "El hombre de hierro", 2010);
	        assertFalse(libro3.prestado());
	        libro3.prestar();
	        assertTrue(libro3.prestado());

	        libro3.devolver();
	        assertFalse(libro3.prestado());
	        
	        Libros libro4 = new Libros("5654", "El madrugon", 2000);
	        assertFalse(libro4.prestado());
	        libro4.prestar();
	        assertTrue(libro4.prestado());

	        libro4.devolver();
	        assertFalse(libro4.prestado());
	        
	        Libros libro5 = new Libros("3212", "La lujuria", 1998);
	        assertFalse(libro5.prestado());
	        libro5.prestar();
	        assertTrue(libro5.prestado());

	        libro5.devolver();
	        assertFalse(libro5.prestado());
	        
	    }

	    @Test
	    public void testCrearRevistas() {
	        Revistas revista1 = new Revistas("0001", "National Geographic", 2022, "NG202201");
	        assertEquals("0001", revista1.getCodigo());
	        assertEquals("National Geographic", revista1.getTitulo());
	        assertEquals(2022, revista1.getAnioPublicacion());
	        assertEquals("NG202201", revista1.getIdentificador());

	        Revistas revista2 = new Revistas("0002", "Muy Interesante", 2022, "MI202202");
	        assertEquals("0002", revista2.getCodigo());
	        assertEquals("Muy Interesante", revista2.getTitulo());
	        assertEquals(2022, revista2.getAnioPublicacion());
	        assertEquals("MI202202", revista2.getIdentificador());
	        
	        Revistas revista3 = new Revistas("0003", "Hola!", 2003, "AR200202");
	        assertEquals("0003", revista3.getCodigo());
	        assertEquals("Hola!", revista3.getTitulo());
	        assertEquals(2003, revista3.getAnioPublicacion());
	        assertEquals("AR200202", revista3.getIdentificador());
	        
	        Revistas revista4 = new Revistas("0004", "Evoque", 2000, "TR200010");
	        assertEquals("0004", revista4.getCodigo());
	        assertEquals("Evoque", revista4.getTitulo());
	        assertEquals(2000, revista4.getAnioPublicacion());
	        assertEquals("TR200010", revista4.getIdentificador());
	        
	        Revistas revista5 = new Revistas("0005", "Peculiar", 2014, "BR550201");
	        assertEquals("0005", revista5.getCodigo());
	        assertEquals("Peculiar", revista5.getTitulo());
	        assertEquals(2014, revista5.getAnioPublicacion());
	        assertEquals("BR550201", revista5.getIdentificador());
	    }

	    @Test
	    public void testPrestarYDevolverRevista() {
	        Revistas revista1 = new Revistas("0001", "National Geographic", 2022, "NG202201");
	        
	        assertFalse(revista1.prestado());
	        revista1.prestar();
	        assertTrue(revista1.prestado());

	        revista1.devolver();
	        assertFalse(revista1.prestado());

	        revista1.prestar();
	        assertTrue(revista1.prestado());
	        revista1.devolver();
	        
	        Revistas revista2 = new Revistas("0002", "Muy Interesante", 2022, "MI202202");
	        assertFalse(revista2.prestado());
	        revista2.prestar();
	        assertTrue(revista2.prestado());

	        revista2.devolver();
	        assertFalse(revista2.prestado());

	        revista2.prestar();
	        assertTrue(revista2.prestado());
	        revista2.devolver();
	        
	        Revistas revista3 = new Revistas("0003", "Hola!", 2003, "AR200202");
	        assertFalse(revista3.prestado());
	        revista3.prestar();
	        assertTrue(revista3.prestado());

	        revista3.devolver();
	        assertFalse(revista3.prestado());

	        revista3.prestar();
	        assertTrue(revista3.prestado());
	        revista3.devolver();
	        
	        Revistas revista4 = new Revistas("0004", "Evoque", 2000, "TR200010");
	        assertFalse(revista4.prestado());
	        revista4.prestar();
	        assertTrue(revista4.prestado());

	        revista4.devolver();
	        assertFalse(revista4.prestado());

	        revista4.prestar();
	        assertTrue(revista4.prestado());
	        revista4.devolver();
	        
	        Revistas revista5 = new Revistas("0005", "Peculiar", 2014, "BR550201");
	        assertFalse(revista5.prestado());
	        revista5.prestar();
	        assertTrue(revista5.prestado());

	        revista5.devolver();
	        assertFalse(revista5.prestado());

	        revista5.prestar();
	        assertTrue(revista5.prestado());
	        revista5.devolver();
	    }
}
