package ejercicio.mvc;

public class Controller {


	    public static void main(String[] args) {
	        Model model = new Model();
	        View view = new View();
	        
	        // Crear instancias de Coche
	        Coche coche1 = new Coche("Ferrari","LX300");
	        Coche coche2 = new Coche("BMW","M4");
	        Coche coche3 = new Coche("Tesla","SX400");

	        // Acelerar los coches
	        coche1.acelerar(250);
	        coche2.acelerar(200);
	        coche3.acelerar(320);
	        
	        // Mostrar información de los coches
	        view.mostrarCoche(coche1);
	        view.mostrarCoche(coche2);
	        view.mostrarCoche(coche3);
	        
	        
	     // Cambiar velocidad de los coches
	        coche1.setVelocidad(120);
	        coche2.setVelocidad(100);
	        coche3.setVelocidad(100);
	        

	     // Mostrar información actualizada de los coches
	        view.mostrarCoche(coche1);
	        view.mostrarCoche(coche2);
	        view.mostrarCoche(coche3);
	    }
}
