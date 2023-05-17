package ejercicios.gestionexcepciones;

public class ProcesarCaracter {

	
	    private LeerPorTeclado leerPorTeclado;

	    public ProcesarCaracter(LeerPorTeclado leerPorTeclado) {
	        this.leerPorTeclado = leerPorTeclado;
	    }

	    public void procesar() throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
	        char c = leerPorTeclado.getChar();

	        switch (c) {
	            case 'a': case 'e': case 'i': case 'o': case 'u':
	                throw new ExcepcionDeVocal("Excepción de vocal");
	            case '0': case '1': case '2': case '3': case '4':
	            case '5': case '6': case '7': case '8': case '9':
	                throw new ExcepcionDeNumero("Excepción de número");
	            case ' ':
	                throw new ExcepcionDeBlanco("Excepción de blanco");
	            case 'x':
	                throw new ExcepcionDeSalida("Excepción de salida");
	            default:
	                break;
	        }
	    }
	}
