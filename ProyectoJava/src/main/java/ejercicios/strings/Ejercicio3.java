package ejercicios.strings;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void contarCaracter() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una cadena: ");
		
		try {
			
		String cad = sc.nextLine();

		System.out.println("Ingrese un caracter: ");
		char caracter = sc.nextLine().charAt(0);

		int contador = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == caracter) {
				contador++;
			}else if(Character.isDigit(caracter) || Character.isWhitespace(caracter)) {
				throw new IllegalArgumentException("No se permiten numeros o espacios en blancos");
			}

		}

		System.out.println(
				"El caracter " + caracter + " " + " se repite " + " " + contador + " veces en la cadena " + " " + cad);
		}catch(IllegalArgumentException e) {
			System.out.println("Error --> " + e.getMessage());
		}finally {
			sc.close();
		}
		
		
	}


	public static void main(String[] args) {
		contarCaracter();

	}

}
