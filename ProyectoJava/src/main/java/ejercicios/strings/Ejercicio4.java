package ejercicios.strings;

import java.util.Scanner;

public class Ejercicio4 {


    public static void compararString(String cad1, String cad2) {
    	if ( cad1.equals(cad2)) {
    		System.out.println("--> Las cadenas a y b son iguales");
		}else {
			System.out.println("--> No son iguales");
		}
        
    }

    public static void concatenarCadenas(String cad1, String cad2) {
        String cadC = cad1 + cad2;
        System.out.println("-->El resultado de la concatenacion de a y b  es: " + " " + cadC);
    }

    public static void compararCadenasConcatenadas(String cad1, String cad2) {
        String cadC = cad1 + cad2;
        String cadD = cad1 + cad2;
      
        if ( cadC.equals(cadD)) {
    		System.out.println("-->La comparacion de las cadenas a y b concatenadas  son iguales");
		}else {
			System.out.println("-->La comparacion de las cadenas a y b concatenadas no son iguales");
		}
        
    }

    public static void obtenerLongitudCadena(String cad1, String cad2) {
        int longitud = cad1.length();
        int longitud2 = cad2.length();
        System.out.println("--> La cadena " + cad1 + " tiene " + longitud + " caracteres.");
        System.out.println("--> La cadena " + cad2 + " tiene " + longitud2 + " caracteres.");
        
    }

    public static void copiarCadena(String cad1, String cad2) {
    	cad2 = String.copyValueOf(cad1.toCharArray());
    	System.out.println("La cadena copiada es: " + cad2);
    	
    }

    public static void reemplazarCadena(String cad) {
        String cadenaReemplazada = cad.replace("a", "t");
        System.out.println("La cadena  después de aplicar replace: " + cadenaReemplazada);
        
    }

    public static void presentarCadenas(String cad1, String cad2) {
        System.out.println("Contenido de la cadena a: " + cad1);
        System.out.println("Contenido de la cadena b: " + cad2);
    }
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String cad1= sc.nextLine();
		System.out.println("Introduce otra cadena: ");
		String cad2= sc.nextLine();
		sc.close();
		
		copiarCadena(cad1,cad2);
		
	}

}
