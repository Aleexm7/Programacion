package ejercicios.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestArrays {

	/*
	 * Crear la clase TestArray que contenga una constante entera de valor 5, pida
	 * al usuario que inserte el numero de elementos dado por la constante y lo
	 * guarde en un array, al finalizar debe de mostrar el array por pantalla
	 */

	final static int TAMAÑO = 5;

	public static void rellenarArray(int[] arr) {
		System.out.println("Introduce 5 numeros para rellenar el array.");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAMAÑO; i++) {

			try {
				System.out.print("Introduce un valor : ");
				if (sc.hasNextInt()) {
					arr[i] = sc.nextInt();
					sc.nextLine();
				}else {
					System.out.println("El valor introducido no es correcto, necesito numeros enteros!");
					sc.nextLine();
					i--; // Volvemos a pedir el valor actual al usuario
				}

			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es correcto, necesito números enteros !");
				sc.nextLine();
				
				i--;  // Volvemos a pedir el valor actual al usuario
			}
		}
		sc.close();
	}

	public static void imprimirArray(int[] arr) {
		for (int i = 0; i < TAMAÑO; i++) {
			System.out.println(arr[i]);

		}
	}

	public static void main(String[] args) {

		int[] miArray = new int[TAMAÑO];

		rellenarArray(miArray);
		imprimirArray(miArray);

	}
}
