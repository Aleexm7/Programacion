package ejercicios.gestionexcepciones.parte2;

public class PruebaEdadPersonas {

	
	public void generaExcepcionEdad(int edad) throws InfantilException, AdultoException, MayorException {
		
		if(edad < 18) {
			throw new InfantilException("Es menor de edad");
			
		}else if(edad >= 18 && edad <65 ){
			throw new AdultoException("Es adulto");
		}else if (edad >= 65) {
			throw new MayorException("Es viejo");
		}
		
	}
	
}
