package examen.entorno;

public class RefactorizacionDemo {
	

	public static void main(String[] args) {
		// Fragmento de código 1 a refactorizar: Extracción de método
		saludar();
		System.out.println("Realizando operaciones...");
		System.out.println("Operación 1 completada.");
		System.out.println("Operación 2 completada.");
		System.out.println("Fin del programa.");

		// Fragmento de código 2 a refactorizar: Extracción de clase
		ExtraerClase operaciones = new ExtraerClase(); //Creamos una instancia de ExtraerClase.
        operaciones.ejecutarPrograma(); // Llamamos  al método ejecutarPrograma() para realizar las operaciones.
	}

	public static void saludar() {
		System.out.println("Hola, bienvenido al programa.");
	}

}
