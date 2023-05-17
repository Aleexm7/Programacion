package ejercicios.strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void contarVocales() {
		System.out.println("A continuacion, escribe una cadena de texto: ");
		Scanner sc = new Scanner(System.in);
		int contadorVocal = 0;
		String teclado = sc.nextLine();

		try {
			for (int i = 0; i < teclado.length(); i++) {

				char caracter = teclado.charAt(i);

				if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
					contadorVocal++;
				} else if (Character.isDigit(caracter)) { //Si se encuentra un número, se lanza una excepción IllegalArgumentException con un mensaje descriptivo.
					throw new IllegalArgumentException("No se permiten numeros en la cadena de texto.");
				} else if (Character.isWhitespace(caracter)) {//si se encuentra un espacio en blanco, se lanza otra excepción IllegalArgumentException
					throw new IllegalArgumentException("No se permiten espacios en blanco en la cadena de texto.");
				}

			}
			System.out.println("La cantidad de vocales es  " + contadorVocal);
		} catch (IllegalArgumentException e) {//Los mensajes de error se capturan y se muestran.
			System.out.println("Error -> " + e.getMessage());
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		contarVocales();
	}
}
