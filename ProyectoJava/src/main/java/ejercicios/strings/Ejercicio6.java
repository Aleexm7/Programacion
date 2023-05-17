package ejercicios.strings;

import java.util.Scanner;

public class Ejercicio6 {

	
	public static void convertidorFloat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		String numero = sc.nextLine();
		
		float numeroFloat = Float.parseFloat(numero);
		
		
		System.out.println("El numero convertido como Float es : " + numeroFloat);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		convertidorFloat();

	}

}
