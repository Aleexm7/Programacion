package ejercicios.strings;

import java.util.Scanner;

public class Ejercicio2 {

	public static void cadenaInvertida() {
		System.out.println("Introduce una cadena de texto para invertirla: ");
		Scanner sc = new Scanner(System.in);

		try {
			String cadenaInvertida = "";// Esta será la cadena invertida, primero está vacía
			String teclado = sc.nextLine();

			// Recorremos de final al inicio
			for (int i = teclado.length() - 1; i >= 0; i--) {

				char caracter = teclado.charAt(i);
				if (Character.isDigit(caracter)) {
					throw new IllegalArgumentException("No se permiten números");
				} else if (Character.isWhitespace(caracter)) {
					throw new IllegalArgumentException("No se permiten espacios en blanco");
				}

				cadenaInvertida += caracter;
			}
			System.out.println("La cadena invertida es :" + cadenaInvertida);
		} catch (IllegalArgumentException e) {
			System.out.println("Error --> " + e.getMessage());
		} finally {
			sc.close();
		}

	}

	public static void main(String[] args) {
		cadenaInvertida();
	}
}
