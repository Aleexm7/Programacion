package ejercicios.strings;

import java.util.Scanner;

public class Ejercicio5 {
	
	
	public static void convertidorInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		
		String numero = sc.nextLine();
		
		Integer numeroInteger = Integer.parseInt(numero);
		
		int numeroInt = numeroInteger.intValue();
		
		System.out.println("El numero convertido a Integer es : " + numeroInteger);
		System.out.println("El numero convertido a Int es : " + numeroInt);
		
		sc.close();
	}
	
	

	public static void main(String[] args) {
		
		convertidorInt();
	}

}
