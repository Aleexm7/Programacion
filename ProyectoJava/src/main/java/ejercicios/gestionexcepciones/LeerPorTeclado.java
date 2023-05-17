package ejercicios.gestionexcepciones;

import java.util.Scanner;

public class LeerPorTeclado {

	private char ultimoCaracterLeido;
	
	
	
	public char getChar() {
		
        Scanner sc = new Scanner(System.in);
        char entradaUsuario = sc.next().charAt(0);
		sc.close();
        ultimoCaracterLeido = entradaUsuario;
        
        return entradaUsuario;
		
	
	}
	
	public char getUltimoCaracterLeido() {
        return ultimoCaracterLeido;
    }
}

